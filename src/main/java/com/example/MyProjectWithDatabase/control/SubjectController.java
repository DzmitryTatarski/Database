package com.example.MyProjectWithDatabase.control;

import com.example.MyProjectWithDatabase.control.repo.SubjectRepo;
import com.example.MyProjectWithDatabase.moduls.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.sql.Time;

@Controller
public class SubjectController {

    @Autowired
    SubjectRepo subjectRepo;

    @GetMapping("/subject/add")
    public String getAddSubject(Model model){
        return "subject-add";
    }

    @PostMapping("/subject/add")
    public String postTeacherAdd(@RequestParam String name, @RequestParam("duration") @DateTimeFormat(pattern = "HH:mm") Date time, Model model){
        Subject subject = new Subject(name, time);
        subjectRepo.save(subject);
        return "success";
    }
}
