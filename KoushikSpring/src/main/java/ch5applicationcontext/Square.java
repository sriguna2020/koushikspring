package ch5applicationcontext;

public class Square implements Shape{
	private String message;
	public Square(String message) {
		this.message = message;
	}
	public void draw() {
		System.out.println(message);
	}
}
