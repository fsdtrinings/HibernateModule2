package com.infogain.model;
public class Employee {
	int eId;
	String name;
	String address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}



	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
