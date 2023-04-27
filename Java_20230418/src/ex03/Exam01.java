package ex03;

class Member {
	private String name; // private를 붙이면 함수를 통해서만 접근이 가능해짐
	private int age;
	
	//생성자를 따로 생성하지 않으면 자바에서 자동으로 디폴트 생성자를 생성함.
	//생성자는 반환타입이 없다, 클래스 이름과 동일, 오버로딩이 가능. 초기화 기능을 가지고있다.
	public Member(String n, int a) {
		name = n;
		age = a;
	}
	
	public Member() {
		name = "미정의";
		age = 0;
	};
	
	public Member(String n) {
		name = n;
		age = 20;
	}
	
//	void setData(String n, int a) {
//		name = n;
//		if(a>=0 && a<= 120)
//			age = a;
//		else
//			age = 1;
//	}
	
	void display ( ) {
		System.out.println(name+ ", " + age );
	}
	
}

// 정적변수 or 정적메소드는 공유자원이면서 지들끼리만 데이터를 주고 받을 수 있다.
public class Exam01 {

	public static void main(String[] args) {
		
		Member m = new Member("구본우", 26); //생성자를 찾는다.
		
		Member m2 = new Member("추명선", 26);
		
		m.display();
		m2.display();
		
		
		Member m3 = new Member();
		
		m3.display();
		
		Member m4 = new Member("이성진");
		m4.display();
		
		
		
		
		
		
	}

}
