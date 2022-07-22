package com.example.MyProjectWithDatabase.control;

import com.example.MyProjectWithDatabase.control.repo.CityRepo;
import com.example.MyProjectWithDatabase.moduls.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CityController {

    @Autowired
    CityRepo repo;

    @GetMapping("/city/add")
    public String getAddCity(Model model){
        return "city-add";
    }

    @PostMapping("city/add")
    public String postAddCity(@RequestParam String name, @RequestParam int population, Model model){
        City city = new City(name, population);
        repo.save(city);
        return "success";
    }

//    @GetMapping("/city")
//    public String getCity(Model model){
//        return
//    }
}
