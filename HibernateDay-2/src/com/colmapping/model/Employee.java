package com.colmapping.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
@Table(name="Emp_Info")
@Entity
public class Employee {
	@Id
	@GeneratedValue
	int empid;
	String name;
	@ElementCollection
	@CollectionTable(name = "Emp_skills",
	joinColumns=@JoinColumn(name="sid"))
   	Set<String> skills;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", skills=" + skills + "]";
	}


	


	
	

}
