package ch20JSRannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape{
	
	@Resource(name="point1")// autowire by id.
	private Point a;
	
	public Circle(){
		System.out.println("Circle constructor");
	}
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
	@PostConstruct
	public void initCircle(){
		System.out.println("Initializing Circle");
	}
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Destroying Circle");
	}
}