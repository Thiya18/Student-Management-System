package com.example.Student_Management.services;

import com.example.Student_Management.model.Department;
import com.example.Student_Management.model.Lecturer;
import com.example.Student_Management.model.Student;
import com.example.Student_Management.repositories.Lecturer_repositories;
import com.example.Student_Management.repositories.Student_repositories;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Lecturer_service {
    @Autowired
    private Lecturer_repositories class_lecturer_repo;

    public Lecturer savelecturer(Lecturer obj_save_lec_data)
    {

        return class_lecturer_repo.save(obj_save_lec_data);
    }

    public List<Lecturer> FindAlllecturer()
    {
        return class_lecturer_repo.findAll();
    }
    public Lecturer getlecturerById (int id)
    {
        return class_lecturer_repo.findById(id).orElse(null);
    }

    public void lecturer_delete_byid(int id )
    {
        class_lecturer_repo.deleteById(id);
    }

    public Lecturer updatelecturer(int id, Lecturer updatedRecord) {
        Lecturer existingRecord = class_lecturer_repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Record not found with id: " + id));


        existingRecord.setLecturer_First_name(updatedRecord.getLecturer_First_name());
        existingRecord.setLecturer_Last_name(updatedRecord.getLecturer_Last_name());
        existingRecord.setLecturer_Address(updatedRecord.getLecturer_Address());
        existingRecord.setLecturer_DOB(updatedRecord.getLecturer_DOB());
        existingRecord.setLecturer_Gender(updatedRecord.getLecturer_Gender());
        existingRecord.setLecturer_Email(updatedRecord.getLecturer_Email());
        existingRecord.setLecturer_Phone_number(updatedRecord.getLecturer_Phone_number());
        existingRecord.setLecturer_dep(updatedRecord.getLecturer_dep());

        existingRecord.setLecturerid(updatedRecord.getLecturerid());





        return class_lecturer_repo.save(existingRecord);
    }



}
