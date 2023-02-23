package com.example.apigee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.apigee.enity.Student;
import com.example.apigee.service.StudentServiceInf;

@RestController
public class StudentController {
	@Autowired
	StudentServiceInf service;
	
	@GetMapping("/allstudents")
	public List<Student> getStudent(){
		return service.getStudents();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentbyId(@PathVariable int id) {
		return service.getStudentbyid(id);
	}
	
}
