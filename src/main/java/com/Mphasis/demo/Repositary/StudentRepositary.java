package com.Mphasis.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mphasis.demo.Entity.Student;

public interface StudentRepositary extends JpaRepository<Student,Integer> {

}
