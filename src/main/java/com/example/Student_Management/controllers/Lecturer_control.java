package com.example.Student_Management.controllers;

import com.example.Student_Management.model.Department;
import com.example.Student_Management.model.Lecturer;
import com.example.Student_Management.model.Student;
import com.example.Student_Management.services.Lecturer_service;
import com.example.Student_Management.services.Student_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/h1/Lecturer_control")
public class Lecturer_control {

    @Autowired
    private Lecturer_service class_lecturer_ser;

    @PostMapping("/addlecturer")
    public Lecturer addlecturer(@RequestBody Lecturer obj_save_lec_data)
    {
        return class_lecturer_ser.savelecturer(obj_save_lec_data);
    }

    @GetMapping("/getalllecturer")
    public List<Lecturer> getalllecturer()
    {
        return class_lecturer_ser.FindAlllecturer();
    }


    @GetMapping("/getlecturer_ID/{id}")
    public Lecturer getlecturer_ID(@PathVariable int id)
    {

        return class_lecturer_ser.getlecturerById(id);
    }



    @DeleteMapping("/deletecourse/{id}")
    public String deletecourse(@PathVariable int id)
    {
        try {
            class_lecturer_ser.lecturer_delete_byid(id);
            return String.valueOf(new ResponseEntity<>("Lecturer with ID"+id+"delete successfully", HttpStatus.OK));

        }
        catch (Exception e)
        {
            return String.valueOf(new ResponseEntity<>("Lecturer with ID"+id+"delete Unsuccessfully", HttpStatus.INTERNAL_SERVER_ERROR));


        }
    }

    @PutMapping("updatelecturer/{id}")
    public Lecturer updatelecturer(@PathVariable int id, @RequestBody Lecturer updatedRecord)
    {
        return class_lecturer_ser.updatelecturer(id, updatedRecord);
    }


}
