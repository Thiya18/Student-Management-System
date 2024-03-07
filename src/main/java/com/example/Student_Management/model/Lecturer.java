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
@Table(name="Lecturer_data")
public class Lecturer {
    @Id
    private int Lecturer_NIC;
    private int Lecturerid;
    private String Lecturer_First_name;
    private String Lecturer_Last_name;
    private String Lecturer_Address;
    private String Lecturer_DOB;
    private String Lecturer_Gender;
    private String Lecturer_Email;
    private int Lecturer_Phone_number;
    private String Lecturer_dep;


}
