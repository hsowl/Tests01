package ex01;

import java.util.Scanner;

public class Exam05_1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요.");
		int score = sc.nextInt();
		
		char grade = ' ', opt = '0';
		
		System.out.println("당신의 점수는 " + score + "입니다.");
		
		if (score >= 90) {
			grade = 'A';
			if (score >=98)
				opt = '+';
			else if (score <94)
				opt = '-';}
		else if (score >= 80) {
			grade = 'B';
			if (score >= 98)
				opt = '+';
			else if (score <84)
				opt = '-';}
		else
			System.out.println(grade = 'c');
		System.out.printf("당신의 학점은  %c%c 입니다", grade, opt);
		}
	}


