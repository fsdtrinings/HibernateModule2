package com.hql;
import javax.persistence.*;
@Entity
@Table(name = "ADDRESS7")
public class Address {
	@Id
	@GeneratedValue
	@Column(name = "add_id")
	private long id;
	@Column(name = "address_line1")
	private String addressLine1;
	@Column(name = "city")
	private String city;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
