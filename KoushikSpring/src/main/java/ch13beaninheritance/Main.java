package ch13beaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ch13beaninheritance.xml");
		Triangle tri = (Triangle) ctx.getBean("triangle");
		tri.draw();
	}

}
