package io.spring_assignment5;

import javax.annotation.Resource;

public class Circle implements Shape {
	
	private Point center;

	public Point getCenter() {
		return center;
	}
	
	@Resource(name="point")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw() {
		System.out.println("Circle : Center = ("+getCenter().getX()+","+getCenter().getY()+")");
	}

}
