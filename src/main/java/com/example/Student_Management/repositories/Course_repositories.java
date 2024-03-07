package com.example.Student_Management.repositories;

import com.example.Student_Management.model.Course;
import com.example.Student_Management.model.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Course_repositories extends JpaRepository<Course,Integer> {

}
