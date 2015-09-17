package ch8innerbean_alias;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ch8innerbean.xml");
		Triangle tri = (Triangle) ctx.getBean("triangle-alias");
		tri.draw();
	}

}
