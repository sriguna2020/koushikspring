package ch18requiredannotation;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{
	
	private Point a;
	
	public void draw() {
		System.out.println("drawing a circle");
		System.out.println("Point: "+a.toString());
	}

	public Point getA() {
		return a;
	}
	@Required
	public void setA(Point a) {
		this.a = a;
	}

}
