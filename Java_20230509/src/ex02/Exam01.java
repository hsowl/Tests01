package ex02;

interface Shape {
	   public double getArea();
	}


class Rectangle implements Shape {
	   int width;
	   int height;
	   @Override
	   public double getArea() {
		   int total = width*height;
		   return total;
	   }
	}

class Circle implements Shape {
	   int radius;
	   @Override
	   public double getArea() {
		   double total = radius*Math.PI*radius;
		   return total;
	   }
	}

public class Exam01 {

	   public static void main(String[] args) {

	      Rectangle rt = new Rectangle();
	      Circle cc = new Circle();
	      
	      rt.width = 10;
	      rt.height = 20;
	      System.out.println(rt.getArea());
	      
	      cc.radius = 5;
	      System.out.printf("%.2f",cc.getArea());
	      
	      
	   }

	}