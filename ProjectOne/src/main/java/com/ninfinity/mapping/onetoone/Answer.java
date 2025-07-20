package com.ninfinity.mapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	int aId;
	String answer;
	
	@OneToOne(mappedBy = "ans")
	Question ques;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question getQues() {
		return ques;
	}
	public void setQues(Question ques) {
		this.ques = ques;
	}
	@Override
	public String toString() {
		return "Answer [aId=" + aId + ", answer=" + answer + ", ques=" + ques + "]";
	}
	public Answer(int aId, String answer, Question ques) {
		super();
		this.aId = aId;
		this.answer = answer;
		this.ques = ques;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
