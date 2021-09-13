package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany1 {

	public static void main(String[] args) {

		System.out.println("get start the program");

		Configuration confi = new Configuration();
		confi.configure("hibernate.cfg.xml");
		SessionFactory factory = confi.buildSessionFactory();

		Question1 question1 = new Question1();
		question1.setQuestionId(1);
		question1.setQuestion("what is java");

		Answer1 answer1 = new Answer1();
		answer1.setAnswerId(1);
		answer1.setAnswer("java is a programming language");
		answer1.setQuestion1(question1);

		Answer1 answer2 = new Answer1();
		answer2.setAnswerId(2);
		answer2.setAnswer("with thw help in java create a web application");
		answer2.setQuestion1(question1);

		Answer1 answer3 = new Answer1();
		answer3.setAnswerId(3);
		answer3.setAnswer("java is a high performence");
		answer3.setQuestion1(question1);

		List<Answer1> list = new ArrayList<Answer1>();
		list.add(answer1);
		list.add(answer2);
		list.add(answer3);
		question1.setAnswers(list);

		Session session = factory.openSession();
		Transaction trt = session.beginTransaction();
		session.save(question1);

		Question1 q = (Question1) session.get(Question1.class, 1);
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		System.out.println(q.getAnswers());
		/*
		 * for (Answer1 a : q.getAnswers()) { System.out.println(a.getAnswer()); }
		 */

		trt.commit();
		session.close();

	}
}
