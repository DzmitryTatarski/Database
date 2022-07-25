package com.example.MyProjectWithDatabase.control.repo;

import com.example.MyProjectWithDatabase.moduls.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepo extends CrudRepository<Subject, Long> {
}
