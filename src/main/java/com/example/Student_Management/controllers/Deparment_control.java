package com.example.Student_Management.controllers;

import com.example.Student_Management.model.Course;
import com.example.Student_Management.model.Department;
import com.example.Student_Management.services.Department_service;
import com.example.Student_Management.services.Student_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/h1/Deparment_control")
public class Deparment_control {

    @Autowired
    private Department_service class_deparment_ser;

    @PostMapping("/adddeparment")
    public Department adddeparment(@RequestBody Department obj_save_dep_data)
    {
        return class_deparment_ser.savedepaertment(obj_save_dep_data);
    }

    @GetMapping("/getalldeparment")
    public List<Department> getalldeparment()
    {
        return class_deparment_ser.FindAlldepaertment();
    }


    @GetMapping("/getdeparment_ID/{id}")
    public Department getdeparment_ID(@PathVariable int id)
    {

        return class_deparment_ser.getdepaertmentById(id);
    }

    @DeleteMapping("/deletedeparment/{id}")
    public String deletedeparment(@PathVariable int id)
    {
        try {
            class_deparment_ser.depaertment_delete_byid(id);
            return String.valueOf(new ResponseEntity<>("Department with ID"+id+"delete successfully", HttpStatus.OK));

        }
        catch (Exception e)
        {
            return String.valueOf(new ResponseEntity<>("Department with ID"+id+"delete Unsuccessfully", HttpStatus.INTERNAL_SERVER_ERROR));


        }
    }

    @PutMapping("updatedeparment/{id}")
    public Department updatedeparment(@PathVariable int id, @RequestBody Department updatedRecord)
    {
        return class_deparment_ser.updatedeparment(id, updatedRecord);
    }



}
