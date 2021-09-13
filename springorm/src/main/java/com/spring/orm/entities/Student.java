package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Details")
public class Student {
@Id
@Column(name = "stuent_Id")
	private int studentId;
@Column(name = "stuent_Name")
	private String studentName;
@Column(name = "stuent_City")
	private String studentCity;
public Student(int studentId, String studentName, String studentCity) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentCity = studentCity;
}
public Student() {
	super();
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}


	
}
