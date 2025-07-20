package com.ninfinity.HQLSQL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	int id;
	String name;
	String city;
	String subject;
	String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", city=" + city + ", subject=" + subject + ", email=" + email
				+ "]";
	}
	public Teacher(int id, String name, String city, String subject, String email) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.subject = subject;
		this.email = email;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
