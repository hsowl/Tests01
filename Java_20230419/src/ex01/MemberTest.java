package ex01;

class Bag {
	int capacity;
	SunCream sun; 	//포함 관계
	Bag(){
		System.out.println("Bag()");
	}
	
	void move() {
		System.out.println("가방 옮기다");
	}
	
	
}

class SunCream {
	int vol;
	SunCream() {
		System.out.println("SunCream()");
	}
	void cover() {
		System.out.println("선크림 바르다.");
	}
}

public class MemberTest {

	public static void main(String[] args) {
		
		Bag bg = new Bag();
		
		bg.sun = new SunCream();
		
		bg.move();
	}

}
