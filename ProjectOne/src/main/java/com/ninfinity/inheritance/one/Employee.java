package com.ninfinity.inheritance.one;

import javax.persistence.Entity;

@Entity
public class Employee extends Person{
	String dept;
	int salary;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", salary=" + salary + ", id=" + id + ", name=" + name + ", city=" + city
				+ "]";
	}
	public Employee(int id, String name, String city, String dept, int salary) {
		super(id, name, city);
		this.dept = dept;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String city) {
		super(id, name, city);
		// TODO Auto-generated constructor stub
	}
	
	

}
