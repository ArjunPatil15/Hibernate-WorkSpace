package com.ninfinity.inheritance.two;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "s_record")
public class Student extends Person{
	String branch;
	int marks;
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
		return "Student [branch=" + branch + ", marks=" + marks + ", id=" + id + ", name=" + name + ", city=" + city
				+ "]";
	}
	public Student(int id, String name, String city, String branch, int marks) {
		super(id, name, city);
		this.branch = branch;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String city) {
		super(id, name, city);
		// TODO Auto-generated constructor stub
	}
	
	
}
