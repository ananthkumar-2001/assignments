package io.spring_assignment6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("message.xml");
		
		message msg1 = (message) context.getBean("message");
		
		msg1.display();
	}

}
