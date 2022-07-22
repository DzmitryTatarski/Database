package com.example.MyProjectWithDatabase.control.repo;

import com.example.MyProjectWithDatabase.moduls.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroupRepo extends CrudRepository<Group, Long> {

    Optional<Group> findByName(String name);
}
