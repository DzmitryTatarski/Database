package com.example.MyProjectWithDatabase.control;

import com.example.MyProjectWithDatabase.control.repo.SubjectRepo;
import com.example.MyProjectWithDatabase.control.repo.TeacherRepo;
import com.example.MyProjectWithDatabase.moduls.Subject;
import com.example.MyProjectWithDatabase.moduls.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TeacherController {

    @Autowired
    TeacherRepo teacherRepo;

    @Autowired
    SubjectRepo subjectRepo;

    @GetMapping("/teacher/add")
    public String getAddTeacher(Model model){
        return "teacher-add";
    }

    @PostMapping("/teacher/add")
    public String postTeacherAdd(@RequestParam String firstName,
                                 @RequestParam String lastName,
                                 @RequestParam int phone,
                                 @RequestParam(name = "subject") long idSubject, Model model){
        Teacher teacher = new Teacher(firstName, lastName, phone, subjectRepo.findById(idSubject).get());
        teacherRepo.save(teacher);
        return "success";
    }
}
