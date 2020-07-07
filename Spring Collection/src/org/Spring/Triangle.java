package org.Spring;

import java.util.List;

public class Triangle {
	private List<Point> points;
	
	
	public List<Point> getPoint() {
		return points;
	}

	public void setPoint(List<Point> point) {
		this.points = point;
	}

	public void draw() {
		for (Point point : points) {
			System.out.println("x:"+point.getX()+",y:" +point.getY());
		}
	}

}
