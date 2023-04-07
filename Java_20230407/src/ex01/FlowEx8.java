package ex01;

import java.util.Scanner;

public class FlowEx8 {

	public static void main(String[] args) {

//		주민등록번호를 입력받아 남자 여자 구분
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요");
		String num = sc.nextLine();
		
		char gender = num.charAt(7);
		
		switch(gender) {
		case '1' : case '3' :
			System.out.println("남자입니다");
			break;
		case '2' : case '4' : 
			System.out.println("여자입니다");
			break;
		default : 
			System.out.println("주민등록번호를 다시 입력하여주세요");
		}
		System.out.println("프로그램 종료");
		
		
		
		
	}

}
