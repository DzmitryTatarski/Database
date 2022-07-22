package com.example.MyProjectWithDatabase.control;

import com.example.MyProjectWithDatabase.control.repo.CityRepo;
import com.example.MyProjectWithDatabase.control.repo.GroupRepo;
import com.example.MyProjectWithDatabase.control.repo.StudentRepo;
import com.example.MyProjectWithDatabase.control.repo.UniversityRepo;
import com.example.MyProjectWithDatabase.moduls.Student;
import com.example.MyProjectWithDatabase.tools.GroupTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class StudentControl {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    CityRepo cityRepo;

    @Autowired
    UniversityRepo universityRepo;

    @Autowired
    GroupRepo groupRepo;

    @GetMapping("/student/add")
    public String getStudentAdd(Model model){
        return "student-add";
    }

    @PostMapping("/student/add")
    public String postStudentAdd (@RequestParam String firstName,
                                 @RequestParam String lastName,
                                 @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date birthday,
                                 @RequestParam int averageMark,
                                 @RequestParam(name = "university") long idUniversity, Model model)
    {
        Student student = new Student(firstName, lastName, birthday, averageMark, universityRepo.findById(idUniversity).get());
        student.setGroup(groupRepo.findByName(GroupTools.getGroupName(student.getCity(), student.getUniversity(), GroupTools.getDefinedGroup())).get());
        studentRepo.save(student);
        return "success";
    }
}
