package com.Mphasis.demo.Service;

import java.util.List;


import com.Mphasis.demo.Entity.Student;


public interface StudentService {
	public List<Student> getAll();
	public Student getone(int id);
	public Student update(int id);
	public void delete(int id);
	public void add(Student student);

}
