package com.example.Student_Management.repositories;
import org.springframework.data.repository.CrudRepository;

import com.example.Student_Management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface Student_repositories extends CrudRepository<Student,Integer> {
}
