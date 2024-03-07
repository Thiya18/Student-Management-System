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
@Table(name="Course_data")
public class Course {
    @Id
    @GeneratedValue
    private  int Course_id;
    private  String Course_tital;
    private  int Course_fee;
    private  String Course_description;
    private  String Course_lectures;
    private  int Course_dep;


}
