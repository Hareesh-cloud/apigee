package com.example.apigee.enity;

public class Student {
	private int id;
	private String name;
	private String college_Name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String college_Name) {
		super();
		this.id = id;
		this.name = name;
		this.college_Name = college_Name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege_Name() {
		return college_Name;
	}
	public void setCollege_Name(String college_Name) {
		this.college_Name = college_Name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college_Name=" + college_Name + "]";
	}
}
