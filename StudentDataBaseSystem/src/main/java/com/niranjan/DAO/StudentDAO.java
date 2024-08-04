package com.niranjan.DAO;

import java.util.List;

import com.niranjan.entities.Student;



public interface StudentDAO {
	 int create(Student student);

	 void update(Student student);

	 void delete(Student student);

	 Student getById(Integer id);
	
	 List<Student> retriveAll();
}
