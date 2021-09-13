package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.maven.Student;

public class HQLPagination {

	public static void main(String[] args) {
		System.out.println("get start program");
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		//ipmlementing pagination
		Query query = session.createQuery("from Student");
		query.setFirstResult(2);
		query.setMaxResults(6);
		List<Student> list = query.list();
		for(Student student:list) {
			System.out.println(student.getId()+"  "+student.getCityString()+"  "+student.getName());
			
		}
		
	}
}
