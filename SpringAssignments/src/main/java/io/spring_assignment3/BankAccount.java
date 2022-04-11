package io.spring_assignment3;

public class BankAccount {
	
	private long accountId;
	
	private String accountHolderName;
	
	private String acccountType;
	
	private double accountBalance;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAcccountType() {
		return acccountType;
	}

	public void setAcccountType(String acccountType) {
		this.acccountType = acccountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	

}
