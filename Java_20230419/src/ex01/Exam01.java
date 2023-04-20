package ex01;

 class Car {
	 String color;
	 String gearType;
	 int door;
	 
	 Car() {
		 this("white","auto",4);
	 }
	 
	 Car(String color) {
		this(color,"auto",4);
	 }
	 
	 Car(String color,String gearType, int door) {
		 this.color = color;
		 this.gearType = gearType;
		 this.door = door;
	 }
 
 }
 


// 정적변수 or 정적메소드는 공유자원이면서 지들끼리만 데이터를 주고 받을 수 있다.
public class Exam01 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.println("c1의 color = "+c1.color+", gearType = "+c1.gearType+", door = "+c1.door);
		System.out.println("c2의 color = "+c2.color+", gearType = "+c2.gearType+", door = "+c2.door);
		
		
	}

}
