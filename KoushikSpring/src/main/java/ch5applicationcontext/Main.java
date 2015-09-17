package ch5applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ch4injection.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ch5application.xml");
		Shape sh = (Shape) ctx.getBean("shape2");
		sh.draw();
	}

}
