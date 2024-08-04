package com.niranjan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niranjan.entities.Student;
import com.niranjan.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	public StudentService getService() {
		return service;
	}

	public void setService(StudentService service) {
		this.service = service;
	}
	
	@RequestMapping("home")
	public String home() {
		return "userInfo";
	}
	
	@RequestMapping("update")
	public String update() {
		return "update";
	}
	
	@RequestMapping(value = "studentForm" , method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("student") Student student ,ModelMap map ) {
		service.save(student);
		List<Student> allRecords = service.getAllRecords();
		map.addAttribute("records", allRecords);
		return "userInfo";
	}
	
	@RequestMapping("validateRno")
	public @ResponseBody String validateRno(@RequestParam("id") Integer id) {
		  Student record = service.getOneRecord(id);
		  String res="";
		  if(record!=null) {
			  res = id + " is already exists..!!";
		  }
		  return res;
	}
	
	
	@RequestMapping("allRecords")
	public String getAllUser(ModelMap map) {
		List<Student> allRecords = service.getAllRecords();
		map.addAttribute("records", allRecords);
		return "userInfo";
	}
	
	@RequestMapping(value = "updateStudent" , method = RequestMethod.POST)
	public String updateStudent(@ModelAttribute("student") Student student,ModelMap map) {
		service.updateRecord(student);
		List<Student> allRecords = service.getAllRecords();
		map.addAttribute("records", allRecords);
		return "userInfo";
	}
	
	@GetMapping("delete")
	public String delete(@RequestParam("id") Integer id,ModelMap map) {
		Student record = service.getOneRecord(id);
		service.delete(record);
		List<Student> allRecords = service.getAllRecords();
		map.addAttribute("records", allRecords);
		return "userInfo";
	}
	

}
