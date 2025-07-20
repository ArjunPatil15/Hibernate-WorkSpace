package com.ninfinity.criteria;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(name = "getAllStudents",query = "from Student"),
	@NamedQuery(name = "getStudentByRollNumber",query = "from Student as s where s.rollNumber = :y"),
})
@Entity
public class Student {
	@Id
	int rollNumber;
	String name;
	String branch;
	int marks;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", branch=" + branch + ", marks=" + marks + "]";
	}
	public Student(int rollNumber, String name, String branch, int marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.branch = branch;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
