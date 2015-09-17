package ch21stereotypeannotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("ch21stereotypeannotation.xml");
		ctx.registerShutdownHook();
		Shape sh =  (Shape) ctx.getBean("circle");
		sh.draw();
	}

}
