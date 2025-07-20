package com.ninfinity.mapping.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	int pId;
	String projName;
	@ManyToMany
	@JoinTable(
			name = "pe_table",
			joinColumns = {@JoinColumn(name = "project")},
			inverseJoinColumns = {@JoinColumn(name="employee")}
			)
	List<Employee> eList;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public List<Employee> geteList() {
		return eList;
	}
	public void seteList(List<Employee> eList) {
		this.eList = eList;
	}
	@Override
	public String toString() {
		return "Project [pId=" + pId + ", projName=" + projName + ", eList=" + eList + "]";
	}
	public Project(int pId, String projName, List<Employee> eList) {
		super();
		this.pId = pId;
		this.projName = projName;
		this.eList = eList;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
