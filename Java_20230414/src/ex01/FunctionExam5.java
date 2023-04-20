package ex01;

import java.util.Arrays;
/* 
	1. 더하기 : 반환타입 O, 매개변수 O	(2개)
	2. 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수작성.	
	
	3. 더학 : 반환타입 X, 매개변수 O (2개)
 	4. 호출함수에게 실수값을 전달하면 호출함수에서 정수로 변환해서 출력

*
*/

public class FunctionExam5 {

	public static void main(String[] args) {
	
		System.out.println("프로그램 시작");
		
		num();
		num1();
		
		System.out.println("프로그램 끝");
	}
	
	
	static void num () {
		int a = 1+2;
		System.out.println(a);
	}
	
	static void num1 () {
		double f = 10.5;
		System.out.println((int)f);
	}
	
	}
	
	
	
	
	


