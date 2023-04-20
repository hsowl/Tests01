package ex01;

class Robot {
	void action () {
		
	}
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
	void action() {
		dance();
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
	void action( ) {
		sing();
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
	void action() {
		draw();
	}
}

public class Exam03 {

	public static void main(String[] args) {

		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i<arr.length;i++) {
			arr[i].action();
		}
	}
}
