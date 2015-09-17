package ch22messagesource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ch22messagesource.xml");
		Shape sh =  (Shape) ctx.getBean("circle");
		sh.draw();
		System.out.println(ctx.getMessage("greeting", null,"Default greeting",null));
	}

}
