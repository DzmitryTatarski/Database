package com.example.MyProjectWithDatabase.service;

import com.example.MyProjectWithDatabase.moduls.City;

import java.util.List;

public interface CityService {

    void create(City city);
    boolean editName(City city, int id);
    boolean editPopulation(City city, int id);
    City find(int id);
    boolean delete(int id);
    List<City> readAll();
}
