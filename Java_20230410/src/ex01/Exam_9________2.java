package ex01;

import java.util.Scanner;

public class Exam_9________2 {

	public static void main(String[] args) {
		
//		for 문은 무한 반복....처리해준다.
		
		int jango = 0;
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		for(;flag;) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			int num = sc.nextInt();
		
		switch (num) {
		case 1 : 
			System.out.println("예금> ");
			jango += sc.nextInt();
			break;
		case 2 : 
			System.out.println("출금> ");
			jango -= sc.nextInt();
			break;
		case 3 :
			System.out.println("현재 잔고는 : "+jango);
			break;
		case 4 : 
			flag = false;
			break;
		}
		
		}
		System.out.println("프로그램 종료");
		
		
		
		
	}}	
	


