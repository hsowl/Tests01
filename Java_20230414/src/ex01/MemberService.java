package ex01;

import java.util.Scanner;

class Member {
	String name;
	String id;
	String password;
	int age;
	
	boolean login (String id, String password) {
		
		if(id.equals("홍길동") && password.equals("12345")) {
			return true;
		}
		else return false;
	}
	
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
	
}


public class MemberService {

	public static void main(String[] args) {
		Member m = new Member();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("아이디를 입력하여주세요");
			m.id = sc.nextLine();
			System.out.println("비밀번호를 입력하여주세요");
			m.password = sc.nextLine();
			
			Boolean k = m.login(m.id, m.password);
			
			if(k == true) {
				System.out.println("로그인성공");
				break;
			}
			else {
				System.out.println("로그인실패");
				System.out.println("아이디와 비밀번호를 다시 입력하세요.");
			}
		}
		
		m.logout(m.id);
		
		
//		Boolean b = m.login("로이", "1234");
//		if(b == true)
//			System.out.println("로그인성공");
//		else
//			System.out.println("로그인실패");
//		
//		
//		Boolean b2 = m.login("홍길동", "12345");
//		
//		
//		if(b2 == true)
//			System.out.println("로그인성공");
//		else
//			System.out.println("로그인실패");
//		
//		m.logout("홍길동");
	}

}
