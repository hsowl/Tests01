package ex01;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
//학점 구하기는 switch문으로 변경

		Scanner sc = new Scanner(System.in);
		System.out.println("성적입력 : ");
		int num = sc.nextInt();
		
		switch(num / 10) {
		case 10 : case 9 : 
			System.out.println("당신의 학점은 A입니다.");
			break;
		case 8 : 
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 7 : 
			System.out.println("당신의 학점은 C입니다.");
			break;
		case 6 : 
			System.out.println("당신의 학점은 D입니다.");
			break;
		default : 
			System.out.println("당신의 학점은 F입니다.");
		
		
		
			
		}
		System.out.println("프로그램 종료");

	}
}
