package ex09;

import java.util.Objects;

class Point {
	private int xPos;
	private int yPos;
	public Point(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	@Override
	public String toString() {
		return "Point [xPos=" + xPos + ", yPos=" + yPos + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this.xPos == ((Point)obj).xPos && this.yPos == ((Point)obj).yPos)
			return true;
		else
			return false;
	}





}



class Rectangle{

	

	private Point upperLeft;

	private Point lowerRight;
	
	public Rectangle(int x1, int y1, int x2, int y2) {

		upperLeft = new Point(x1,y1);

		lowerRight = new Point(x2,y2);

	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Rectangle other = (Rectangle) obj;
		return Objects.equals(lowerRight, other.lowerRight) && Objects.equals(upperLeft, other.upperLeft);
	}
	
	
//	@Override

//	public boolean equals(Object obj) {
//
//		if (this.upperLeft == ((Rectangle)obj).upperLeft && this.lowerRight == ((Rectangle)obj).lowerRight)
//
//			return true;
//
//		else
//
//			return false;
//
//	}

	

	

}



public class Exam01 {



	public static void main(String[] args) {

		Point p = new Point(1,2);

		Point p1 = new Point(1,2);

		Rectangle r = new Rectangle(1, 2, 1, 2);

		Rectangle r1 = new Rectangle(1, 2, 1, 2);

		

		System.out.println(r);

		System.out.println(r1);

		

		System.out.println(r.equals(r1));

		

		

		

	}



}

