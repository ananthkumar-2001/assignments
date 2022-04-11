package io.assignments;

public class BankAccount {
	
	public double withdraw(double amount) throws InsufficientFundsException {
		
		double bal = 19500;
		
		if(amount>bal) {
			
			throw new InsufficientFundsException(amount);
			
		}
		
		else {
			
			bal = bal - amount;
			
			System.out.println("Withdraw Successful");
			
		}
		
		return bal;
		
	}

}
