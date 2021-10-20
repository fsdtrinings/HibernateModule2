package p1;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="IGCurrentAccount")
public class CurrentAccount extends Account {

	int gstNumber;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(int gstNumber) {
		this.gstNumber = gstNumber;
	}
	
	
}
