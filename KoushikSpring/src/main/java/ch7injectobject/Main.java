package ch7injectobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ch7injectobject.xml");
		Triangle tri = (Triangle) ctx.getBean("triangle");
		tri.draw();
	}

}
