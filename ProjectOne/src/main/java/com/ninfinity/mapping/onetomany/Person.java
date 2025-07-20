package com.ninfinity.mapping.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Person {
	@Id
	int pId;
	String name;
	@OneToMany(mappedBy = "person",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	List<Address> addList;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddList() {
		return addList;
	}
	public void setAddList(List<Address> addList) {
		this.addList = addList;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", name=" + name + ", addList=" + addList + "]";
	}
	public Person(int pId, String name, List<Address> addList) {
		super();
		this.pId = pId;
		this.name = name;
		this.addList = addList;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
