package com.example.Student_Management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Department_data")
public class Department {

    @Id
    @GeneratedValue 
    private  int Department_id;
    private  String Department_tital;

    private  String Department_description;
    private  int Department_Course;
}
