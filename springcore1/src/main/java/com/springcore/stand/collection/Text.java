package com.springcore.stand.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("get start program");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stand/collection/alonconfig.xml");
Person person=context.getBean("person1",Person.class);
System.out.println(person);System.out.println(person.getFriends().getClass());
System.out.println("__________________________________________________________");

Person person1=context.getBean("person1",Person.class);
System.out.println(person1);
System.out.println(person1.getFeestructure().getClass().getName());
System.out.println("__________________________________________________________");

System.out.println(person1.getProperties());

	}

}
