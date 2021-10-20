package com.onetomanypkfk;
import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.*;
import javax.persistence.Table;
@Table(name="R_TRAINER")
@Entity
public class Trainer {
	@Id
	@GeneratedValue
	@Column(name = "TRAINER_ID")
	int id;
	@Column(name="TRAINER_NAME")
	String name;
	// collection for Batch
	@OneToMany(cascade = CascadeType.ALL)		
	@JoinColumn(name="TRAINER_ID")
	Set<Batch> batches;
	public Trainer(String name, Set<Batch> batches) {
		super();
		this.name = name;
		this.batches = batches;
	}
	public Trainer() {
		// TODO Auto-generated constructor stub
	}
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
	public Set<Batch> getBatches() {
		return batches;
	}
	public void setBatches(Set<Batch> batches) {
		this.batches = batches;
	}
	
	}
