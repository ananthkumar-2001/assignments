package io.spring_assignment3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@Controller
public class BankAccountController {
	
	@Bean
	public BankAccount bankAccount(){
		return new BankAccount();
	}
	
	private double amount;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double withdraw(long accountId, double balance) {
		if(getAmount()>balance || getAmount()<0) {
			System.out.println("Insufficient Balance");
		}
		else {
			balance -= getAmount();
		}
		return balance;
	}
	public double deposit(long accountId, double balance) {
		if(getAmount()<0) {
			System.out.println("negative amount entered");
		}
		else {
			balance += getAmount();
		}
		return balance;
	}
	public double getBalance(long accountId) {
		return 0;
	}
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		return true;
	}
	
	
	

}
