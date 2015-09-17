package ch14lifecyclecallback;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("ch14lifecyclecallback.xml");
		ctx.registerShutdownHook();
		Triangle tri = (Triangle) ctx.getBean("triangle");
		tri.draw();
	}

}
