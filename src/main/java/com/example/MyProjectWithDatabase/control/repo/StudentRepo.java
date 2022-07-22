package com.example.MyProjectWithDatabase.control.repo;

import com.example.MyProjectWithDatabase.moduls.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Long> {
}
