package com.manytomanybidirctional.jointable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name = "SS_PREVILEDGE")
public class Previledge {
	@Id
	@GeneratedValue
	@Column(name = "PREVILEDGE_ID")
	private int previledgeId;
	private String name;
	private int cost;
	@ManyToMany(mappedBy = "previledge")  
	private Set<Employee> employees = new HashSet<Employee>();
	public int getPreviledgeId() {
		return previledgeId;
	}
	public void setPreviledgeId(int previledgeId) {
		this.previledgeId = previledgeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	public Previledge() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Previledge [previledgeId=" + previledgeId + ", name=" + name + ", cost=" + cost + ", employees="
				+ employees + "]";
	}
	
	

	
}
