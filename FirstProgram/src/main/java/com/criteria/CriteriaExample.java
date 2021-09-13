package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.maven.Student;

public class CriteriaExample {
	
	public static void main(String[] args) {
		System.out.println("get the start program");
		
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Student.class);
		
		List<Student> list = criteria.list();
		for(Student student:list) {
			System.out.println(student);
			
		}
		session.close();
		
	}

}
