package io.string_assignments1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {

	private int customerId;
	
	private String customerName;
	
	private double customerContact;
	
	private String customerAddress;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(double customerContact) {
		this.customerContact = customerContact;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void getCustomerDetails() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
		Address address = (Address) context.getBean("address");
		System.out.print(getCustomerId()+" "+getCustomerName()+" "+getCustomerContact()+" ");
		address.getAddress();
	}
	
}
