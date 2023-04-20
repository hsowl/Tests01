package ex02;

class Member {
	private String name; // private를 붙이면 함수를 통해서만 접근이 가능해짐
	private int age;
	
	void setData(String n, int a) {
		name = n;
		if(a>=0 && a<= 120)
			age = a;
		else
			age = 1;
	}
	
	void display ( ) {
		System.out.println(name+ ", " + age );
	}
	
}

// 정적변수 or 정적메소드는 공유자원이면서 지들끼리만 데이터를 주고 받을 수 있다.
public class Exam01 {

	public static void main(String[] args) {
		
		Member m = new Member();
		m.setData("구본우", 1000);
		m.display();
		
		
		
	}

}
