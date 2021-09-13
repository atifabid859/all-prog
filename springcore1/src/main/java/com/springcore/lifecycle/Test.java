package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("get start program ");
		
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
	/*
	 * Book book = (Book) context.getBean("b1"); System.out.println(book);
	 * context.registerShutdownHook();
	 * 
	 * Copy copy=(Copy) context.getBean("c1"); System.out.println(copy);
	 * 
	 */
	
	Example example=(Example)context.getBean("example");
	System.out.println(example);
	 context.registerShutdownHook();
	}

}
