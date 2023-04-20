package ex09;

class Parent {
	String name;
	
	public Parent (String name) {
		this.name = name;
	}
}
	

class Child extends Parent {
	int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
		this.name = name;
		this.studentNo = studentNo;
	}
	void info() {
		System.out.println(name+studentNo);
	}
	
}


public class Exam2 {

	public static void main(String[] args) {
	
		
	}

}
