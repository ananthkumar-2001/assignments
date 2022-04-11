package io.assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void withdrawTest() {
		
		BankAccount bcAccount = new BankAccount();
		
		assertThrows(InsufficientFundsException.class, () -> bcAccount.withdraw(20000), "withdraw more than curren balance throws exception");
		
	}

}
