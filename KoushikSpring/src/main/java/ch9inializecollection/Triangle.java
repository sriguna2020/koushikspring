package ch9inializecollection;

import java.util.List;

public class Triangle {
	private List<Point> points;
	
	public void draw(){
		for(Point p: points){
			System.out.println(p.toString());
		}
	}
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	

}
