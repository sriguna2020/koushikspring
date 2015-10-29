package ch19autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape{
	
	@Autowired
	@Qualifier(value="circle-related")// optional but its to mark a bean.
	private Point a;
	
	public void draw() {
		System.out.println("drawing a circle");
		System.out.println("Point: "+a.toString());
	}
}