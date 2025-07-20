package com.ninfinity.testCache;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Developer {
	@Id
	int id;
	String name;
	String skill;
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
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", skill=" + skill + "]";
	}
	public Developer(int id, String name, String skill) {
		super();
		this.id = id;
		this.name = name;
		this.skill = skill;
	}
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
