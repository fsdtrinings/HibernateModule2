
package com.hql;
import javax.persistence.*;


@Entity
@Table(name = "EMPLOYEE7")

@NamedQuery(name="get_total_emp", 
query="select count(e) from Employee e ")

@NamedQueries({
@NamedQuery(name="get_emp_byid",
query="select e from Employee e where id =:id")	,
@NamedQuery(name="get_all_emp",query="from Employee")
})

public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "emp_id")
	private long id;
	@Column(name = "emp_name")
	private String name;
	@Column(name = "emp_salary")
	private double salary;
    @OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="aid")
	private Address address;

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
     
	
	
}
