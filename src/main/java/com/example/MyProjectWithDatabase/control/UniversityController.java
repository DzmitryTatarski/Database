package com.example.MyProjectWithDatabase.control;

import com.example.MyProjectWithDatabase.control.repo.CityRepo;
import com.example.MyProjectWithDatabase.control.repo.GroupRepo;
import com.example.MyProjectWithDatabase.control.repo.UniversityRepo;
import com.example.MyProjectWithDatabase.moduls.City;
import com.example.MyProjectWithDatabase.moduls.Group;
import com.example.MyProjectWithDatabase.moduls.University;
import com.example.MyProjectWithDatabase.tools.GroupTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UniversityController {

    @Autowired
    UniversityRepo universityRepo;
    @Autowired
    CityRepo cityRepo;
    @Autowired
    GroupRepo groupRepo;

    @GetMapping("/university/add")
    public String getUniversity(Model module){
        return "university-add";
    }

    @PostMapping("/university/add")
    public String addUniversity(@RequestParam String name, @RequestParam String address, @RequestParam(name = "city") long idCity, Model module) {
        City city = cityRepo.findById(idCity).get();
        University university = new University(name, address, city);
        universityRepo.save(university);
        List<Group> list = GroupTools.createGroupList(city, university, 1);
        list.forEach(groupRepo::save);
        return "success";
    }
}
