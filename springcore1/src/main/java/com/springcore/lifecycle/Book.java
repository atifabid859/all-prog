package com.springcore.lifecycle;

public class Book {
private String price;

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}


public Book() {
	super();
	
}

@Override
public String toString() {
	return "Book [price=" + price + "]";
}
public void init() {
	System.out.println("init method");
}
public void destroy() {
	System.out.println("destroy method");
}


}
