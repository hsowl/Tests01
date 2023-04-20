package ex01;

class Unit {
	int x,y;
	void move (int x, int y) {} 
	void stop () {
	}
}

class Marine extends Unit {
	void move (int x, int y) {
		System.out.println("걸어서 이동");
	} 
	void stimPack() {
		
	}
}

class Tank extends Unit{
	void move (int x, int y) {
		System.out.println("탱크로 이동");
	}
	void changeMode() {
		System.out.println("모드 바꾸기");
	}
}

class Dropship extends Unit{
	void move (int x, int y) {
		System.out.println("배로 이동");
	} 
	void load () {
	}
	void unload () {
	}
}

//class Airplane extends Unit {
//	void move (int x, int y) {
//		System.out.println("날아서 이동");
//	}
//}

public class Exam02 {

	public static void main(String[] args) {
		Marine ma = new Marine();
		move(ma);
		Tank ta = new Tank();
		move(ta);
		Dropship dr = new Dropship();
		move(dr);
//		Airplane ap = new Airplane();
//		move(ap);
	}
	static void move (Unit u) {
		u.move(10,10);
	}
	
}
