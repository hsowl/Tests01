package ex01;

public class Exam05 {
	
	public static void main(String[] args) {
		Robot[] arr =
			{ new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		
		
	}

class Robot {
	void funcR() {}
}
	
class DanceRobot extends Robot {
	void dance () {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing ( ) {
		System.out.println("노래를 부릅니다.");
	}
}

class DrawRobot extends Robot {
	void draw ( ) {
		System.out.println("그림을 그립니다.");
	}
}


}
