package com.hql;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Delete;

import com.maven.Student;

public class HqlDemo {

	public static void main(String[] args) {
		System.out.println("get start program");

		Configuration cof = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cof.buildSessionFactory();
		Session session = factory.openSession();
		// hql
		// String query="from Student where cityString='kanpur'";
		String query = "from Student as s where s.cityString=:x and s.name=:n";

		Query q = session.createQuery(query);
		q.setParameter("x", "kanpur");
		q.setParameter("n", "sakib");
		List<Student> list = q.list();
		for (Student student : list) {
			System.out.println(student.getName() + "" + student.getCerti());

		}
		System.out.println("____________________________________________________________________");
		Transaction transaction = session.beginTransaction();
//		String query1="delete from Student  where cityString='basti'";
//		Query q2=session.createQuery(query1);
//		
//	
		// Delete Query
//		int r=q2.executeUpdate();
//		System.out.println("deleted");
//		System.out.println(r);
		String query2 = "update Student set name='ehtesham' where cityString='kanpur'";
		Query q2 = session.createQuery(query2);

		int r = q2.executeUpdate();
		System.out.println("update ");
		System.out.println(r);

		transaction.commit();
		session.close();

	}

}
