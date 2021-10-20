package com.manytomanybidirctional.jointable;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "SS_EMPLOYEE")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "EMPLOYEE_ID")
	private int employeeId;
	private String firstname;
	private String job;
	private int salary;
	@ManyToMany(cascade = { CascadeType.ALL })  
	@JoinTable
	private Set<Previledge> previledge = new HashSet<Previledge>();

	public Employee(String firstname, String job, int salary) {
		super();
		this.firstname = firstname;
		this.job = job;
		this.salary = salary;
		}

public Employee() {
	// TODO Auto-generated constructor stub
}

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getJob() {
	return job;
}

public void setJob(String job) {
	this.job = job;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public Set<Previledge> getPreviledge() {
	return previledge;
}

public void setPreviledge(Set<Previledge> previledge) {
	this.previledge = previledge;
}

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", firstname=" + firstname + ", job=" + job + ", salary=" + salary
			+ ", previledge=" + previledge + "]";
}


	

}
