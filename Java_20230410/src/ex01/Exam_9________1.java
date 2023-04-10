package ex01;

import java.util.Scanner;

public class Exam_9________1 {

	public static void main(String[] args) {
		
//		for 문은 무한 반복....처리해준다.

		Scanner sc = new Scanner(System.in);
		
		int jango = 0;
		boolean flag = true;
		
		for(;flag;) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			int num = sc.nextInt();
			
		switch(num) {
		case 1 : 
			System.out.println("예금액>");
			jango += sc.nextInt();
			break;
		case 2 : 
			System.out.println("출금액>");
			jango -= sc.nextInt();
			break;
		case 3 :
			System.out.println("잔고 : "+ jango);
			break;
		case 4 :
			flag = false;
			break;
		}}
		System.out.println("프로그램 종료");
		
		
	}}	
	


