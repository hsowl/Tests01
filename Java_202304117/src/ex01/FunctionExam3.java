package ex01;

import java.util.Arrays;
/* 
	1. 더하기 : 반환타입 O, 매개변수 O	(2개)
	2. 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수작성.	
	
	3. 더학 : 반환타입 X, 매개변수 O (2개)
 	4. 호출함수에게 실수값을 전달하면 호출함수에서 정수로 변환해서 출력

*
*/

public class FunctionExam3 {

	public static void main(String[] args) {
	
		System.out.println("프로그램 시작");
		
		double df = convertInt ();
		
		System.out.println((int)df);
		
		System.out.println("프로그램 끝");
	}
	
	static int num () {
		int result = (1+2);
		return result;
	}
	
	static double convertInt () {
		return 10.5;
	}
	
	
	
	
	}


