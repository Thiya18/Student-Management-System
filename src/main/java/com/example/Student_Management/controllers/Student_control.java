package com.example.Student_Management.controllers;

import com.example.Student_Management.model.Student;
import com.example.Student_Management.services.Student_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/h1/Student_control")
public class Student_control {

@Autowired
private Student_service class_student_ser;

    @PostMapping("/addstudent")
    public Student addstudent(@RequestBody Student obj_save_stu_data)
    {
        return class_student_ser.savestudent(obj_save_stu_data);
    }

    @GetMapping("/getallstudent")
    public List<Student> getallstudent()
    {
        return class_student_ser.FindAllstudent();
    }

    @GetMapping("/getstudent_ID/{id}")
    public Student getstudent_ID(@PathVariable int id)
    {

        return class_student_ser.getstudentById(id);
    }



    @DeleteMapping("/deletestudent/{id}")
    public String deletestudent(@PathVariable int id)
    {
        try {
            class_student_ser.student_delete_byid(id);
            return String.valueOf(new ResponseEntity<>("Student with ID"+id+"delete successfully", HttpStatus.OK));

        }
        catch (Exception e)
        {
            return String.valueOf(new ResponseEntity<>("Student with ID"+id+"delete Unsuccessfully", HttpStatus.INTERNAL_SERVER_ERROR));


        }
    }

    @PutMapping("updatestudent/{id}")
    public Student updatestudent(@PathVariable int id, @RequestBody Student updatedRecord)
    {
        return class_student_ser.updatestudent(id, updatedRecord);
    }



}
