package com.NVlimited.Beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	private String id;
	
	private String Question;

	public Question(String id, String question) {
		super();
		this.id = id;
		Question = question;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}
	
	
	
	
	

}
