package ex02;

public class A {
	
	//중첩 클래스
	class B {
		private int field = 1; //멤버변수, 인스턴스변수, 지역변수?
		void test () {System.out.println("test 함수");}
		
		static int field2 = 1; //정적변수, 정적클래스변수
		static void test2() {}
		
		B() {
		System.out.println("B객체생성");
		}
		void method(int num) {
			field = num;
			System.out.println(field);
		}
	}
	
	class C {
		C()	{
			System.out.println("C객체생성");
		}
	}
	
	B field = new B();
	C field2 = new C();
	
	A() {
		B b = new B();
		System.out.println("A객체생성");
	}
	
	void method() {
		B b = new B();
	}
	
	public static void main(String[] args) {

	}

}
