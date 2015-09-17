package ch6constructorinjection;

public class Square implements Shape{
	
	private String message;
	private int type;
	
	public Square(String message) {
		this.message = message;
	}
	
	public Square(String message, int type) {
		this.message = message;
		this.type = type;
	}
	
	public void draw() {
		System.out.println("Message: "+message+", type: "+type);
	}
}
