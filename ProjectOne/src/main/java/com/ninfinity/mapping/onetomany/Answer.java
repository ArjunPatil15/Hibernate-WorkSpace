package com.ninfinity.mapping.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	int aid;
	String ans;
	
	@ManyToOne
	Question ques;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Question getQues() {
		return ques;
	}

	public void setQues(Question ques) {
		this.ques = ques;
	}

	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", ans=" + ans + ", ques=" + ques + "]";
	}

	public Answer(int aid, String ans, Question ques) {
		super();
		this.aid = aid;
		this.ans = ans;
		this.ques = ques;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
