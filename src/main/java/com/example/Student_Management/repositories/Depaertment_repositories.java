package com.example.Student_Management.repositories;

import com.example.Student_Management.model.Department;
import com.example.Student_Management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Depaertment_repositories extends JpaRepository<Department,Integer> {
}
