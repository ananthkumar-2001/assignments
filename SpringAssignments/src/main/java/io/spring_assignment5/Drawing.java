package io.spring_assignment5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("draw.xml");
		Shape shape = (Shape) context.getBean("line");
		shape.draw();
	}

}
