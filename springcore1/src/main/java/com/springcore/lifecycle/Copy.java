package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Copy implements InitializingBean,DisposableBean {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public Copy() {
		super();
		
	}

	@Override
	public String toString() {
		return "Copy [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// init method
		System.out.println("calling init method");
		
	}

	public void destroy() throws Exception {
		// distroy method
		System.out.println("calling  distroy method ");
		
	}
	
}
