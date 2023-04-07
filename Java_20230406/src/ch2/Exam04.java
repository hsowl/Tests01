package ch2;

import java.util.Scanner;

//성적 입력 받아서 70이상 합격했습니다..메시지 출력...
public class Exam04 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		int jumsu = sc.nextInt();
//		
//		//조건문 ~if
//		if(jumsu >= 70)
//			System.out.println("합격을 축하드립니다!")
//		
//			
//		System.out.println("프로그램 종료");
//		
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		if(age >= 20)
			System.out.println("성년");
		if(age < 20)
			System.out.println("미성년");
		
		System.out.println("프로그램 종료");
	}

}
