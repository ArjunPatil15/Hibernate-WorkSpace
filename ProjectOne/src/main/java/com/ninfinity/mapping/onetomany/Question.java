package com.ninfinity.mapping.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	int qid;
	String ques;
	
	@OneToMany
	List<Answer> ans;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", ques=" + ques + ", ans=" + ans + "]";
	}

	public Question(int qid, String ques, List<Answer> ans) {
		super();
		this.qid = qid;
		this.ques = ques;
		this.ans = ans;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
