package io.spring_assignment8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class classRoom {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("college.xml");
		
		context.registerShutdownHook();
		
		Student student = (Student) context.getBean("student");
		
		student.getDetails();
	}

}
