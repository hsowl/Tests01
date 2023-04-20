package ex01;

class A{
	int a=10;
	void func() {
		System.out.println("A - a : "+ a);
	}
	public String toString() {
		return "A클래스의 a값은"+a+"이다.";
	}

}


class B extends A{
	int a =20;
	void func1() {
		System.out.println("B - a : "+ a);
	}

	public String toString() {
		return "B클래스의 a값은"+a+"이다.";
	}
	
	
}

public class Exam01 {

	public static void main(String[] args) {
		
	
		A a = new A();
		System.out.println(a.toString());
		
		B b = new B();
		System.out.println(b.toString());
		
		A aa = new B();
		System.out.println(aa.toString());
		
		Object ob = new B();
		System.out.println(ob.toString());
		
		A aaa = new B();
		
		B bbb = (B)aaa;
		
		
		
		
	}

}
