package io.assignments;

public class InsufficientFundsException extends Exception {

	
	private double amount;
	
	public InsufficientFundsException(double amount) {
		
		this.amount = amount;
		
	}
	
	public String toString() {
		
		return "InsufficientFundsException for Amount: " + getAmount();
		
	}
	
	public String getMessage() {
		
		return "InsufficientFundsException for Amount: " + getAmount();
		
	}
	
	public double getAmount(){
		
		return amount;
		
	}
	
	

}

