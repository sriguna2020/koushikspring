package ch12applicationcontextaware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware {
	private Point a;
	private Point b;
	private Point c;
	private ApplicationContext context = null;
	public void draw(){
		System.out.println("Point a: "+getA().toString()+", Point b: "+getB().toString()+", Point c: "+getC().toString());
	}
	
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	public Point getC() {
		return c;
	}
	public void setC(Point c) {
		this.c = c;
	}

	public void setBeanName(String beanName) {
		System.out.println("bean name: "+beanName);
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context = context;
		
	}
}
