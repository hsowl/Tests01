package ex01;

class B{
	void f1() {
		System.out.println("f1");
	}

}

class K extends B {
	void f2() {
		System.out.println("f2");
	}
}

class C extends B {
	void f3() {
		System.out.println("f3");
	}
}

class E extends B {
	void f4() {
		System.out.println("f4");
	}
}


public class Exam01 {

	public static void main(String[] args) {
		func(new B());
		func(new K());
		func(new C());
		func(new E());
	}
	
	static void func(B b) {
		
		if ( b instanceof K) {
			K kk = (K)b;
			kk.f2();
		}else if (b instanceof C) {
			C cc = (C)b;
			cc.f3();
		}else if (b instanceof E) {
			E ee = (E)b;
			ee.f4();
		}else if (b instanceof B) {
			b.f1();
		}

	
	
	}
	
	
	
}
