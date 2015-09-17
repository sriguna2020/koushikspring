package ch10autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ch10autowire.xml");
		Triangle tri = (Triangle) ctx.getBean("triangle");
		tri.draw();
	}

}
