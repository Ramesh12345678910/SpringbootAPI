package com.Mphasis.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mphasis.demo.Entity.Student;
import com.Mphasis.demo.Repositary.StudentRepositary;

@Service
public class Serviceimp implements StudentService {

    @Autowired
    private StudentRepositary repo;

    @Override
    public List<Student> getAll() {
        return repo.findAll();
    }

    @Override
    public Student getone(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void add(Student student) {
        repo.save(student);
    }

    @Override
    public Student update(int id) {
        Student student = repo.findById(id).orElse(null);
        if (student != null) {
            student.setName("bhaskar");
            student.setPercentage(92.4f);
            repo.save(student); // Save the updated student
        }
        return student;
    }

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }
}
