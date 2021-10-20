package com.inheritance.singletableperclasshierarchy;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("E")
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
