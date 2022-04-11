package io.spring_assignment5;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Required;

public class Line implements Shape {
	
	private Point pointA;
	
	private Point pointB;

	public Point getPointA() {
		return pointA;
	}
	
	@Inject
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public Point getPointB() {
		return pointB;
	}
	
	@Required
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	public void draw() {
		
		System.out.println("Line : Center = ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("Line : Center = ("+getPointB().getX()+","+getPointB().getY()+")");
		
	}

}
