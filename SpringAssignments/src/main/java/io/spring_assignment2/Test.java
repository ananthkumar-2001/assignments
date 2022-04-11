package io.spring_assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("que2.xml");
		Question question = (Question) context.getBean("question");
		question.getAnswers();
	}

}
