package ex05;

class Member {
	// 1. 함수이름이 같다. 2. 매개변수 타입이거나 갯수가 틀려야한다.
	int func (int n) {
		System.out.println("int");
		return n;
	}
	double func (double d) {
		System.out.println("double");
		return d;
	}
	String func (String str) {
		System.out.println("String");
		return str;
	}
	int func (int n1, int n2) {
		System.out.println("int int");
		return n1+n2;
	}
}
public class Exam01 {

	public static void main(String[] args) {
		
		Member m = new Member();
		
		System.out.println(m.func(10, 2));
	}

}
