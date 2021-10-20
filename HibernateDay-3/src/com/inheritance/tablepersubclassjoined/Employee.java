package com.inheritance.tablepersubclassjoined;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="INFO_EMPLOYEE1")
@PrimaryKeyJoinColumn
public class Employee extends Person {
	String desg;
	long sal;
	public Employee(String name, String desg, long sal) {
		super(name);
		this.desg = desg;
		this.sal = sal;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public String getDesg() {
		return desg;
	}


	public void setDesg(String desg) {
		this.desg = desg;
	}


	public long getSal() {
		return sal;
	}


	public void setSal(long sal) {
		this.sal = sal;
	}
	
	
	
	

}
