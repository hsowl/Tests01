package ex06;

class 사람 {
	String name;
	int age;
	public 사람(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void info() {
		System.out.println(name+ ", "+ age);
	}

}

class 구본우 extends 사람{
	double weight;
	
	public 구본우(String name,int age,double weight) {
		super(name,age);
		this.weight = weight;
	}
	void infoDisplay() {
		System.out.println(name+", "+age+", "+ weight);
	}
}

public class Exam2 {

	public static void main(String[] args) {
		
		구본우 구 = new 구본우("상경",15,5.3);
		구.infoDisplay();
		
		
	}

}
