package com.ninfinity.ProjectOne;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "Manager_Details")
public class Manager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_Id")
	int id;
	
	@Column(length = 30, name = "Manager_name")
	String name;
	
	@Column(length = 30)
	String city;
	
	@Column(name = "Emp_status")
	boolean isPermt;
	
	@Transient
	double salary;
	
	@Temporal(TemporalType.DATE)
	Date dateOfJoining;
	
	@Lob
	byte[] photo;
	
	
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
	public boolean isPermt() {
		return isPermt;
	}
	public void setPermt(boolean isPermt) {
		this.isPermt = isPermt;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", city=" + city + ", isPermt=" + isPermt + ", salary=" + salary
				+ ", dateOfJoining=" + dateOfJoining + ", photo=" + Arrays.toString(photo) + "]";
	}
	public Manager(int id, String name, String city, boolean isPermt, double salary, Date dateOfJoining, byte[] photo) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.isPermt = isPermt;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.photo = photo;
	}
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
