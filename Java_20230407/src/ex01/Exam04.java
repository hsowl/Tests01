package ex01;

import java.util.Scanner;

public class Exam04 {

//	숫자 하나 입력받아서 2의 배수이면서 3의 배수이면
//	2와3의 배수입니다...출력
//	아닐 시  2와 3의 배수가 아닙니다...출력
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		if (num % 6 ==0)	
		System.out.println("2와 3의 배수입니다");
			else
			System.out.println("2와 3의 배수가 아닙니다");
		
		
	}

}
