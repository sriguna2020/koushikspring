package ch15beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("ch15beanpostprocessor.xml");
		ctx.registerShutdownHook();
		Triangle tri = (Triangle) ctx.getBean("triangle");
		tri.draw();
	}

}
