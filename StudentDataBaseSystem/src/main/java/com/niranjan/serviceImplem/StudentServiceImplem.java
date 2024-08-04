package com.niranjan.serviceImplem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niranjan.DAO.StudentDAO;
import com.niranjan.entities.Student;
import com.niranjan.service.StudentService;

@Service
public class StudentServiceImplem implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;
	
	public StudentDAO getStudentDAO() {
		return studentDAO;
	}
	
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}


	@Override
	@Transactional
	public int save(Student student) {
		int result = studentDAO.create(student);
		return result;
	}

	@Override
	@Transactional
	public void updateRecord(Student student) {
		studentDAO.update(student);
	}
	
	@Override
	@Transactional
	public void delete(Student student) {
		studentDAO.delete(student);
	}

	@Override
	public Student getOneRecord(Integer id) {
		return studentDAO.getById(id);
	}

	@Override
	public List<Student> getAllRecords() {
		return studentDAO.retriveAll();
	}

}
