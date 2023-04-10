package ex01;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		
//	1~10합을 누적
		
//		int total = 0;
//		int num = 10;
//		
		
		
//				초기값; 검사 ; 증가
//		i =1 t= 0
//		for (int i = 1; i<=num; i++)
//			total += i; // total = total + 1 이란 뜻 //
//
//		System.out.println("1~" +num + "까지 합 : "+ total);
		
		
		
//		2하고 3의배수를 동시에 만족하는 수의 갯수 100까지
//		for (int i = 1; i<= 100 && i%6 == 0; i++)
//			System.out.printf(i + ", ");
		
//		int count = 0;
//		
//		for (int i = 1; i<=100; i++) 
//			if (i % 2 ==0 && i % 3 ==0) {
//				System.out.print(i + ", ");
//				count++;}
//				
//		System.out.println("\n1~100에서 2와 3의 배수의 갯수는 :" +count);
		
//		5의 배수와 10의 배수를 동시에 만족하는 수의 갯수 num까지
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		
		
		for (int i = 1; i<=num; i++) {
			if (i % 5 ==0 && i % 10 ==0)
				System.out.print(i + ", ");
				count++;}
		System.out.println("\n1~"+num+"사이의 5와 10의 배수의 갯수는 : "+count);
		
	}

}
