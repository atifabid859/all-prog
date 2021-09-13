package com.java_peoject;

public class Getter {
	int id;
	String name;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "start program" + this.id + "" + this.name;

	}

	public static void main(String[] args) {
		Getter get = new Getter();
		get.setId(101);
		get.setName("Asad");
		System.out.println(get);
	}

}
