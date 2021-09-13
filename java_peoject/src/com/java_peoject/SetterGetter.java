package com.java_peoject;

public class SetterGetter {
	int id;
	String name; 
	String address;

	public SetterGetter() {
		super();
		
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
	
SetterGetter se = new SetterGetter();
se.setId(101);
se.setName("sakib");
se.setAddress("sakinaka");
System.out.println(se.getId()+"= "+se.getName()+"= "+se.getAddress());
	}

}
