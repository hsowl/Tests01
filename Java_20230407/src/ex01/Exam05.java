package ex01;

import java.util.Scanner;

public class Exam05 {

//	숫자 하나 입력받아서 짝수 인지 홀수 인지 출력
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		if (num==0)
			System.out.println("zero");
		else if(num % 2 == 0)
			System.out.println("짝수입니다");
			else
			System.out.println("홀수입니다");
		
		
	}

}
