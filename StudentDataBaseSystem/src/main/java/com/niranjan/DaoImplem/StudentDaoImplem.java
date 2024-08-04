package com.niranjan.DaoImplem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.niranjan.DAO.StudentDAO;
import com.niranjan.entities.Student;

@Repository
public class StudentDaoImplem implements StudentDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int create(Student student) {
		Integer result = (Integer) hibernateTemplate.save(student);
		return result;
	}

	@Override
	public void update(Student student) {
		hibernateTemplate.update(student);
	}
	
	@Override
	public void delete(Student student) {
		hibernateTemplate.delete(student);
	}

	@Override
	public Student getById(Integer id) {
		return  hibernateTemplate.get(Student.class,id);
	}

	@Override
	public List<Student> retriveAll() {
		return hibernateTemplate.loadAll(Student.class);
	}

}
