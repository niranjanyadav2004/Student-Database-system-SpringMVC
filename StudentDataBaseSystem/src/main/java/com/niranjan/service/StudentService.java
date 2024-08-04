package com.niranjan.service;

import java.util.List;

import com.niranjan.entities.Student;

public interface StudentService {
      int save(Student student);
      void updateRecord(Student student);
      void delete(Student student);
      Student getOneRecord(Integer id);
      List<Student> getAllRecords();
}
