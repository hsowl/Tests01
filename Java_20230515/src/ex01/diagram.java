package ex01;

interface A {}

class B implements A {}

class C implements A {}

class D extends B {
	void funcD() {
		System.out.println("funcD");
	}
}	

class E extends C {
	void funcE() {
		System.out.println("funcE");
	}
}

public class diagram {
	static void test(A test) {
		if(test instanceof B) {
			test = new D();
			((D)test).funcD();
		}else if(test instanceof C) {
			test = new E();
			((E) test).funcE();
		}else if(test instanceof D) {
			((D) test).funcD();
		}else if(test instanceof E) {
			((E) test).funcE();
		}
		
	}
	
	public static void main(String[] args) {
		
		A ab = new B();
		A ac = new C();
		A ad = new D();
		A ae = new E();
		
		B bb = new B();
		B bd = new D();
		
		D dd = new D();
		
		E ee = new E();
		
		test(new B());
		
	}

}
