package ch18requiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ch18requiredannotation.xml");
		Shape sh =  (Shape) ctx.getBean("circle");
		sh.draw();
	}

}
