package com.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetomany.Answer1;
import com.onetomany.Question1;

public class Cascade {
	public static void main(String[] args) {

		Configuration cof = new Configuration();
		cof.configure("hibernate.cfg.xml");
		SessionFactory factory = cof.buildSessionFactory();
		Question1 question1 = new Question1();
		question1.setQuestionId(1234);
		question1.setQuestion("what is cascading");

		Answer1 answer1 = new Answer1();
		answer1.setAnswerId(987);
		answer1.setAnswer("in hibernate it is a importent concept");
		answer1.setQuestion1(question1);

		Answer1 answer2 = new Answer1();
		answer2.setAnswerId(986);
		answer2.setAnswer("second cascading");
		answer2.setQuestion1(question1);

		Answer1 answer3 = new Answer1();
		answer3.setAnswerId(906);
		answer3.setAnswer("third cascading ");
		answer3.setQuestion1(question1);

		List<Answer1> list = new ArrayList<Answer1>();
		list.add(answer1);
		list.add(answer2);
		list.add(answer3);
		question1.setAnswers(list);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction(); 
		session.save(question1);
		/*
		 * session.save(answer1); session.save(answer2); session.save(answer3);
		 */
		transaction.commit();
		session.close();

	}
}
