package com.example.Student_Management.services;

import com.example.Student_Management.model.Course;
import com.example.Student_Management.model.Department;
import com.example.Student_Management.model.Student;
import com.example.Student_Management.repositories.Course_repositories;
import com.example.Student_Management.repositories.Depaertment_repositories;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Department_service {

    @Autowired
    private Depaertment_repositories class_depaertment_repo;

    public Department savedepaertment(Department obj_save_dep_data)
    {

        return class_depaertment_repo.save(obj_save_dep_data);
    }

    public List<Department> FindAlldepaertment()
    {
        return class_depaertment_repo.findAll();
    }
    public Department getdepaertmentById (int id)
    {
        return class_depaertment_repo.findById(id).orElse(null);
    }

    public void depaertment_delete_byid(int id )
    {
        class_depaertment_repo.deleteById(id);


    }


    public Department updatedeparment(int id, Department updatedRecord) {
        Department existingRecord = class_depaertment_repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Record not found with id: " + id));


        existingRecord.setDepartment_tital(updatedRecord.getDepartment_tital());
        existingRecord.setDepartment_description(updatedRecord.getDepartment_description());
        existingRecord.setDepartment_Course(updatedRecord.getDepartment_Course());





        return class_depaertment_repo.save(existingRecord);
    }
}
