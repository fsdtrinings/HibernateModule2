package p1;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="IGSavingAccount")
public class SavingAccount  extends Account{

	int interestAmount;

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(int interestAmount) {
		this.interestAmount = interestAmount;
	}
	
	
}
