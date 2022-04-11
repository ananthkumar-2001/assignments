package io.spring_assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bank.xml");
		
		BankAccountController bankAccountController = (BankAccountController) context.getBean("bankAccountController");
		
		

	}

}
