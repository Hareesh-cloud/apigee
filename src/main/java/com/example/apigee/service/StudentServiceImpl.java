package com.example.apigee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.apigee.enity.Student;
@Service
public class StudentServiceImpl implements StudentServiceInf {
	
	static List<Student> list=new ArrayList<Student>();
	public static List<Student> addStd(){
		list.add(new Student(1001, "haneef", "Reva univeristy"));
		list.add(new Student(1002, "junaid", "Reva univeristy"));
		return list;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return addStd();
	}

	@Override
	public Student getStudentbyid(int id) {
		// TODO Auto-generated method stub
		//List<Student> collect = list.stream().filter(s->s.getId()==id).map(null)
		Student student = list.get(id);
		return student;
	}

}
