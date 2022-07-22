package com.example.MyProjectWithDatabase.control;

import com.example.MyProjectWithDatabase.control.repo.CityRepo;
import com.example.MyProjectWithDatabase.control.repo.GroupRepo;
import com.example.MyProjectWithDatabase.control.repo.StudentRepo;
import com.example.MyProjectWithDatabase.control.repo.UniversityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    CityRepo cityRepo;
    @Autowired
    GroupRepo groupRepo;
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    UniversityRepo universityRepo;

    @GetMapping("/")
    public String home(Model model){
        return "home";
    }

    @PostMapping("/")
    public String deleteAll(Model model){
        studentRepo.deleteAll();
        groupRepo.deleteAll();
        universityRepo.deleteAll();
        cityRepo.deleteAll();
        return "success";
    }
}
