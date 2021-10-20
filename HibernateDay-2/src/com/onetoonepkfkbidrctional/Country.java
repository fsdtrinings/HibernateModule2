package com.onetoonepkfkbidrctional;

import javax.persistence.Entity;
import javax.persistence.*;
@Table(name="V4_COUNTRY")
@Entity
public class Country {
	@Id 
	@GeneratedValue
	@Column(name="COUNTRY_ID")
	int id;
	String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hos_id")
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
