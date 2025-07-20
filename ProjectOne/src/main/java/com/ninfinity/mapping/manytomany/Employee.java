package com.ninfinity.mapping.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	int eId;
	String empName;
	@ManyToMany(mappedBy = "eList")
	List<Project> eList;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<Project> getaList() {
		return eList;
	}
	public void setaList(List<Project> eList) {
		this.eList = eList;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", empName=" + empName + ", eList=" + eList + "]";
	}
	public Employee(int eId, String empName, List<Project> eList) {
		super();
		this.eId = eId;
		this.empName = empName;
		this.eList = eList;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
