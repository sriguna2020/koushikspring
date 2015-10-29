package ch19autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("When autowiring, Spring will look for a bean defition, if more than one, then Spring will"
				+ " look for id as name of the bean. OR user Qualified(name='something') to indicate that this is "
				+ "the bean to use.");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ch19autowireannotatin.xml");
		Shape sh =  (Shape) ctx.getBean("circle");
		sh.draw();
	}

}
