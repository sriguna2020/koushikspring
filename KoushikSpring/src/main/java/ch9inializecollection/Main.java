package ch9inializecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ch9initializecollection.xml");
		Triangle tri = (Triangle) ctx.getBean("triangle");
		tri.draw();
	}

}
