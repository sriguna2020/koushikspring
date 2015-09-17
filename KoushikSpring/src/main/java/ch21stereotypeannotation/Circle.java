package ch21stereotypeannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
//@Service // - Indicates that an annotated class is a "Service" (e.g. a business service facade). This annotation serves as a specialization of @Component, allowing for implementation classes to be autodetected through classpath scanning. 
//@Controller // - It is typically used in combination with annotated handler methods based on the RequestMapping annotation. 
//@Repository // - Indicates that an annotated class is a "Repository" (or "DAO"). As of Spring 2.5, this annotation also serves as a specialization of @Component, allowing for implementation classes to be autodetected through classpath scanning. 
@Component(value="circle")
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