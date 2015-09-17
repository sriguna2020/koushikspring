package ch16beanfactorypostprocessor;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{
	private Point a;
	private Point b;
	private Point c;
	
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

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing bean in triangle");
	}

	public void destroy() throws Exception {
		System.out.println("destroying bean in triangle");
	}
	
	public void init(){
		System.out.println("Init method");
	}
	
	public void cleanUp(){
		System.out.println("CleanUp method");
	}

}
