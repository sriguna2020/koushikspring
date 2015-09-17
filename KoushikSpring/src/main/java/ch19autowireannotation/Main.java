package ch19autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ch19autowireannotatin.xml");
		Shape sh =  (Shape) ctx.getBean("circle");
		sh.draw();
	}

}
