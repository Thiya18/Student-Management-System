package com.example.Student_Management.services;

import com.example.Student_Management.model.Course;
import com.example.Student_Management.model.Department;
import com.example.Student_Management.model.Lecturer;
import com.example.Student_Management.model.Student;
import com.example.Student_Management.repositories.Course_repositories;
import com.example.Student_Management.repositories.Lecturer_repositories;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Course_serivce {
    @Autowired
    private Course_repositories class_course_repo;

    public Course savecourse(Course obj_save_cou_data)
    {

        return class_course_repo.save(obj_save_cou_data);
    }

    public List<Course> FindAllcourse()
    {
        return class_course_repo.findAll();
    }
    public Course getcourseById (int id)
    {
        return class_course_repo.findById(id).orElse(null);
    }

    public void course_delete_byid(int id )
    {
        class_course_repo.deleteById(id);
    }

    public Course updatecourse(int id, Course updatedRecord) {
        Course existingRecord = class_course_repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Record not found with id: " + id));


        existingRecord.setCourse_tital(updatedRecord.getCourse_tital());
        existingRecord.setCourse_fee(updatedRecord.getCourse_fee());
        existingRecord.setCourse_description(updatedRecord.getCourse_description());
        existingRecord.setCourse_lectures(updatedRecord.getCourse_lectures());
        existingRecord.setCourse_dep(updatedRecord.getCourse_dep());




        return class_course_repo.save(existingRecord);
    }
}
