package com.onetoonepkfkbidrctional;

import javax.persistence.*;
@Entity
@Table(name="V4_headofstate")
public class HeadOfState {
	@Id
	@GeneratedValue
	@Column(name = "h_id")	 
	int id;
	String title;
	String name;
	@OneToOne(mappedBy = "hos")
	Country country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}



}

