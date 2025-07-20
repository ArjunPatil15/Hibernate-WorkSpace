package com.ninfinity.embed;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Student_Details")
@Entity
public class Student {
		@Id
		int id;
		String name;
		String city;
		
		@Embedded
		Course c1;

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

		public Course getC1() {
			return c1;
		}

		public void setC1(Course c1) {
			this.c1 = c1;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", city=" + city + ", c1=" + c1 + "]";
		}

		public Student(int id, String name, String city, Course c1) {
			super();
			this.id = id;
			this.name = name;
			this.city = city;
			this.c1 = c1;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
	

}
