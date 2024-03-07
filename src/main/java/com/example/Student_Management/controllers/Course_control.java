package com.example.Student_Management.controllers;

import com.example.Student_Management.model.Course;
import com.example.Student_Management.model.Lecturer;
import com.example.Student_Management.model.Student;
import com.example.Student_Management.services.Course_serivce;
import com.example.Student_Management.services.Student_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/h1/Course_control")
public class Course_control {

    @Autowired
    private Course_serivce class_course_ser;
    @PostMapping("/addcourse")
    public Course addcourse(@RequestBody Course obj_save_cou_data)
    {
        return class_course_ser.savecourse(obj_save_cou_data);
    }

    @GetMapping("/getallcourse")
    public List<Course> getallcourse()
    {
        return class_course_ser.FindAllcourse();
    }


    @GetMapping("/getcourse_ID/{id}")
    public Course getcourse_ID(@PathVariable int id)
    {

        return class_course_ser.getcourseById(id);
    }

    @DeleteMapping("/deletecourse/{id}")
    public String deletecourse(@PathVariable int id)
    {
        try {
            class_course_ser.course_delete_byid(id);
            return String.valueOf(new ResponseEntity<>("Course with ID"+id+"delete successfully", HttpStatus.OK));

        }
        catch (Exception e)
        {
            return String.valueOf(new ResponseEntity<>("Course with ID"+id+"delete Unsuccessfully", HttpStatus.INTERNAL_SERVER_ERROR));


        }
    }

    @PutMapping("updatecourse/{id}")
    public Course updatecourse(@PathVariable int id, @RequestBody Course updatedRecord)
    {
        return class_course_ser.updatecourse(id, updatedRecord);
    }


}
