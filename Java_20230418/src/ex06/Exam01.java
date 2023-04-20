package ex06;

class 사람 {
	String name;
	int age;
//	public 사람() {
//		this.name = name;
//		this.age = age;
//	}
	void info() {
		System.out.println(name+ ", "+ age);
	}

}



//class 구본우 extends 사람{
//	double weight;
//	
//	public 구본우(String name,int age,double weight) {
//		super(name,age);
//		this.weight = weight;
//	}
//	void infoDisplay() {
//		System.out.println(name+", "+age+", "+ weight);
//	}
//}

class 추명선 extends 사람{
	
	double height;
	public 추명선 () {
		
	}
//	public 추명선(String name,int age, double height) {
//		this.name = name;
//		this.age = age;
//		this.height = height;
//	}
	void infoDisplay() {
		System.out.println(name+", "+age+", "+ height);
	}
}

//class 박종진{
//	String name;
//	int age;
//	String grade;    //학점
//	public 박종진(String name,int age, String grade) {
//		this.name = name;
//		this.age = age;
//		this.grade = grade;
//	}
//	void infoDisplay() {
//		System.out.println(name+", "+age+", "+ grade);
//	}
//}
// 정적변수 or 정적메소드는 공유자원이면서 지들끼리만 데이터를 주고 받을 수 있다.
public class Exam01 {

	public static void main(String[] args) {
		
		추명선 추 = new 추명선();
		추.name = "추명선";
		추.age = 20;
		추.height = 180.2;
		
		추.infoDisplay();
		
//		구본우 구 = new 구본우("상경",15,5.3);
//		구.infoDisplay();
//		
//		박종진 박 = new 박종진("박종진",25,"A");
//		박.infoDisplay();
		
		
		
	}

}
