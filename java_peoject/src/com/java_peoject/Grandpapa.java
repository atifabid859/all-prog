package com.java_peoject;

public interface Grandpapa {
void show();
}
interface Parent{
void display();
}


class Child implements Grandpapa,Parent{

	@Override
	public void display() {
		System.out.println("Parent class");
		
	}

	@Override
	public void show() {
		System.out.println("Grand papa class");
		
	}
}