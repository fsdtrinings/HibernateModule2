package com.componentmapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "EMP_ADD")
public class Emp {
	@Id
	@GeneratedValue
	@Column(name = "EMP_ID")
	private long employeeId;
  @Column(name = "EMP_NAME")
  private String employeeName;
  private Address employeeAddress;
public Emp(String employeeName, Address employeeAddress) {
	super();
	this.employeeName = employeeName;
	this.employeeAddress = employeeAddress;
}
  public Emp() {
	// TODO Auto-generated constructor stub
}
public long getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(long employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public Address getEmployeeAddress() {
	return employeeAddress;
}
public void setEmployeeAddress(Address employeeAddress) {
	this.employeeAddress = employeeAddress;
}

  
  
  

}
