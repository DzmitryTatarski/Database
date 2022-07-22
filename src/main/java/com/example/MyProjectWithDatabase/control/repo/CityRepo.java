package com.example.MyProjectWithDatabase.control.repo;

import com.example.MyProjectWithDatabase.moduls.City;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "city", path = "city")
public interface CityRepo extends PagingAndSortingRepository<City, Long> {

    City findByName(@Param("name") String name);
}
