package ex04;

class Member {
	int age;
	static int num;
}

class Member2 {
	int age;
	static int num;
}

public class MemberService {

	public static void main(String[] args) {
		Member.num = 20;
		
		Member m = new Member();
		m.age = 10;



	}

}
