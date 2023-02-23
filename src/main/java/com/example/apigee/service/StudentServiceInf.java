package com.example.apigee.service;

import java.util.List;

import com.example.apigee.enity.Student;

public interface StudentServiceInf {
	public List<Student> getStudents();
	public Student getStudentbyid(int id);

}
