package com.example.Student_Management.repositories;

import com.example.Student_Management.model.Lecturer;
import com.example.Student_Management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Lecturer_repositories extends JpaRepository<Lecturer,Integer> {
}
