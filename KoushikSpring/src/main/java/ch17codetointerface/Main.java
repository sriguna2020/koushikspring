package ch17codetointerface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ch17codetointerface.xml");
		Shape sh =  (Shape) ctx.getBean("triangle");
		sh.draw();
	}

}
