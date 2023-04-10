package ex01;

import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) {
		
//		for 문은 무한 반복....처리해준다.
		
		Scanner sc = new Scanner(System.in);
		int balance=0;
		boolean flag = true;
		
		for(; flag ;) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			
			int number = sc.nextInt();
			
			switch (number) {
			case 1 : 
				System.out.println("예금액>");
				balance += sc.nextInt();
				break;
			case 2 :
				System.out.println("출금액>");
				balance -= sc.nextInt();
				break;
			case 3 :
				System.out.println("잔고>");
				System.out.println("현재 잔고 : "+balance);
				break;
			case 4 :
				System.out.println("선택>");
				flag = false;
				break;
			}
//			if (number ==4) break;
		}
		System.out.println("프로그램 종료");
		
//		------------------------------------------------------
		
		
	}}	
	


