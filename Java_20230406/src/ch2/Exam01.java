package ch2;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math, total;
		double average;
		
		System.out.println("국어점수>>");
		kor = sc.nextInt();
		System.out.println("영어점수>>");
		eng = sc.nextInt();
		System.out.println("수학점수>>");
		math = sc.nextInt();
		
		total = kor+eng+math;
		average = total/3.0;
		
		System.out.println("총점 : "+ total);
		System.out.printf("평균 : %.2f", average);
//		System.out.println("평균 : "+ average); //%.2f는 소수점 2번째 자리까지 표기를 위함
	}

}
