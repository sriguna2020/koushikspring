package ch4injection;

public class Triangle implements Shape {
	
	private String message;
	private int num;
	
	public void draw() {
		System.out.println(message+"--"+num);
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
