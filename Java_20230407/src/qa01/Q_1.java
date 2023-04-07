package qa01;

import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {

//		정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		
		if (num%3 == 0)
			System.out.println("3의 배수입니다");
		else
			System.out.println("3의 배수가 아닙니다");

		System.out.println("프로그램 종료");
	}
		
}
