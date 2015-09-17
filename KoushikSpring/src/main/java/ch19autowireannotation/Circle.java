package ch19autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape{
	
	@Autowired
	@Qualifier(value="circle-related")
	private Point a;
	
	public void draw() {
		System.out.println("drawing a circle");
		System.out.println("Point: "+a.toString());
	}

	public Point getA() {
		return a;
	}
	
	public void setA(Point a) {
		this.a = a;
	}

}