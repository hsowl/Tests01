package ex01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		
//		int random = (int)(Math.random()*10+1); //0~9 정수 ---> 1~10 정수
//		
//		System.out.println(random);
//		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요");
//		int user = sc.nextInt();
//		int com = (int)(Math.random()*3) + 1;
//
//		System.out.println("당신은" + user + "입니다.");
//		System.out.println("컴은" + com + "입니다.");
//		
//		switch(user-com) {
//		case 2 : case -1:
//			System.out.println("당신은 졌습니다");
//			break;
//		case -2 : case 1:
//			System.out.println("당신은 이겼습니다");
//			break;
//		case 0 : 
//			System.out.println("비겼습니다");
//	}
//		System.out.println("프로그램 종료");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 중에 하나를 입력하세요.");
		int user = sc.nextInt();
		int com = (int)(Math.random()*3 +1);
		
		System.out.println("당신은 "+ user + "입니다");
		System.out.println("com "+ com + "입니다");
		
		switch(user-com) {
		case 0 :
			System.out.println("당신은 비겼습니다.");
			break;
		case -1 : case 2 :
			System.out.println("당신은 졌습니다");
			break;
		case -2 : case 1 : 
			System.out.println("당신은 이겼습니다");
			break;
		default :
		}
		System.out.println("프로그램 종료");
		
		
	}
}
