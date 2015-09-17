package ch4injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ch4injection.xml");
		Shape sh = (Shape) ctx.getBean("shape2");
		sh.draw();
	}

}
