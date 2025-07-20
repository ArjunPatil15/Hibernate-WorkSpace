package com.ninfinity.mapping.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	int aId;
	String city;
	@ManyToOne
	Person person;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Address [aId=" + aId + ", city=" + city + ", person=" + person + "]";
	}
	public Address(int aId, String city, Person person) {
		super();
		this.aId = aId;
		this.city = city;
		this.person = person;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
