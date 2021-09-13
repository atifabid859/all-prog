package com.firstlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.maven.Student;

public class FirstLevel {

	public static void main(String[] args) {
System.out.println("get start program");
//first level cache 
SessionFactory factory=new Configuration().configure().buildSessionFactory();
Session session = factory.openSession();

Student student = session.get(Student.class,1);

System.out.println(student);
System.out.println("working something");

Student student2 = session.get(Student.class,1);
System.out.println(student2);

session.close();

	}

}
