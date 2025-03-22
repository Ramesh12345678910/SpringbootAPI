package com.Mphasis.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Mphasis.demo.Entity.Student;
import com.Mphasis.demo.Service.StudentService;

@RestController
public class Studentcontroller {
	@Autowired
	public StudentService serv;
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return serv.getAll();
		}
	@GetMapping("/students/{id}")
	public Student getstudent(@PathVariable int id) {
		return serv.getone(id);
	}
	@PostMapping("students/add")
	public void addstudent(@RequestBody Student student) {
		serv.add(student);
	}
	@PutMapping("students/update/{id}")
	public Student updatestudent(@PathVariable int id) {
		return serv.update(id);
	}
	@DeleteMapping("/students/delete/{id}")
	public void deletestudent(@PathVariable int id) {
		serv.delete(id);
	}

}
