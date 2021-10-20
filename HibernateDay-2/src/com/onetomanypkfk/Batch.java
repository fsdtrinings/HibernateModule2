package com.onetomanypkfk;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="R_BATCH")
@Entity
public class Batch {
	@Id
	@GeneratedValue
	@Column(name = "BATCH_ID")
	int id;
    String slot;
	String bmode;
	public Batch(String slot, String bmode) {
		super();
		this.slot = slot;
		this.bmode = bmode;
	}
public Batch() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSlot() {
	return slot;
}
public void setSlot(String slot) {
	this.slot = slot;
}
public String getBmode() {
	return bmode;
}
public void setBmode(String bmode) {
	this.bmode = bmode;
}

}
