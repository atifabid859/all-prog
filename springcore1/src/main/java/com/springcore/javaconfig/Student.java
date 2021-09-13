package com.springcore.javaconfig;

import org.springframework.stereotype.Component;



//@Component
public class Student {
	private Note note;
	
	
public Note getNote() {
		return note;
	}


	public void setNote(Note note) {
		this.note = note;
	}


public Student(Note note) {
		super();
		this.note = note;
	}


public Student() {
	super();
	
}


@Override
public String toString() {
	return "Student [note=" + note + "]";
}


public void read()
{
	System.out.println("student reading a book");
}
}
