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
@Table(name="Student_data")

public class Student {

    @Id
    private int Student_NIC;
    private int Student_id;
    private String First_name;
    private String Last_name;
    private String Address;
    private String DOB;
    private String Gender;
    private String Email;
    private int Phone_number;
    private String Course;
    private String Batch;



}
