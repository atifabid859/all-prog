package com.springcore.constructor;

public class Person {
private int personId;
private String name;
private Certi certi;

public Person(int personId, String name,Certi certi) {
	super();
	this.certi =certi;
	this.personId = personId;
	this.name = name;
}

@Override
public String toString() {
	return "Person [personId=" + personId + ", name=" + name + ", certi=" + certi + "]";
}

	
}
