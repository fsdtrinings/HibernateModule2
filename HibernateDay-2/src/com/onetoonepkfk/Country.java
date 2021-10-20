package com.onetoonepkfk;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "v1_country")
public class Country {
	@Id 
	@GeneratedValue
	int id;
	String name;	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="hosid")		
	HeadOfState hos;
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
	public HeadOfState getHos() {
		return hos;
	}
	public void setHos(HeadOfState hos) {
		this.hos = hos;
	}
	
	

}
