package ch7injectobject;

public class Triangle {
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
	

}
