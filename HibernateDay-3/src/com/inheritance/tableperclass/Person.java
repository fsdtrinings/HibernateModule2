package com.inheritance.tableperclass;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name="Info_Person1")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) 
public class Person {
	@Id
	@GeneratedValue
	int id;
	String name;
	
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
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
