package com.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer1 {
	@Id
	@Column(name = "answer_id")
	private int answerId;
	private String answer;
	@ManyToOne
	private Question1 question1;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int questionId) {
		this.answerId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question1 getQuestion1() {
		return question1;
	}

	public void setQuestion1(Question1 question1) {
		this.question1 = question1;
	}

	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer1(int answerId, String answer, Question1 question1) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question1 = question1;
	}

}
