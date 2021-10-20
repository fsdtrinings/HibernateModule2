package com.inheritance.tablepersubclassjoined;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="INFO_Student1")
@PrimaryKeyJoinColumn
public class Student extends Person {
	String course;
	int fee;
	
	public Student(String name, String course, int fee) {
		super(name);
		this.course = course;
		this.fee = fee;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	
	
	
	
	

}
