package ch16beanfactorypostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("ch16beanfactorypostprocessor.xml");
		ctx.registerShutdownHook();
		Triangle tri = (Triangle) ctx.getBean("triangle");
		tri.draw();
	}

}
