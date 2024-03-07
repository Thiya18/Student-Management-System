package com.example.Student_Management.services;

import com.example.Student_Management.model.Student;
import com.example.Student_Management.repositories.Student_repositories;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student_service {
    Student obj =new Student();

    @Autowired
    private Student_repositories class_student_repo;

    public Student savestudent(Student obj_save_stu_data)
    {

        return class_student_repo.save(obj_save_stu_data);
    }

    public List<Student> FindAllstudent()
    {
        return (List<Student>) class_student_repo.findAll();
    }
    public Student getstudentById (int id)
    {
        return class_student_repo.findById(id).orElse(null);
    }

    public void student_delete_byid(int id )
    {
        class_student_repo.deleteById(id);
    }

    public Student updatestudent(int id, Student updatedRecord) {
        Student existingRecord = class_student_repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Record not found with id: " + id));


        existingRecord.setFirst_name(updatedRecord.getFirst_name());
        existingRecord.setLast_name(updatedRecord.getLast_name());
        existingRecord.setAddress(updatedRecord.getAddress());
        existingRecord.setDOB(updatedRecord.getDOB());
        existingRecord.setGender(updatedRecord.getGender());
        existingRecord.setEmail(updatedRecord.getEmail());
        existingRecord.setPhone_number(updatedRecord.getPhone_number());
        existingRecord.setCourse(updatedRecord.getCourse());
        existingRecord.setBatch(updatedRecord.getBatch());

        existingRecord.setStudent_id(updatedRecord.getStudent_id());




        return class_student_repo.save(existingRecord);
    }
}


