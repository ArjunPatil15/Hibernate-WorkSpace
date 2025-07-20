package com.ninfinity.mapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	int qId;
	String ques;
	
	@OneToOne
	@JoinColumn(name = "Answers")
	Answer ans;
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [qId=" + qId + ", ques=" + ques + ", ans=" + ans + "]";
	}
	public Question(int qId, String ques, Answer ans) {
		super();
		this.qId = qId;
		this.ques = ques;
		this.ans = ans;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
