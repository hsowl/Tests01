package ex01;

import java.util.Arrays;
/* 
	1. 더하기 : 반환타입 O, 매개변수 O	(2개)
	2. 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수작성.	
	
	3. 더학 : 반환타입 X, 매개변수 O (2개)
 */

public class FunctionExam2 {

	public static void main(String[] args) {
	
		System.out.println("프로그램 시작");
		
		int num = add(1,2);
		int number = convertInt(10.2);
		System.out.println("add = "+num);
		System.out.println("convertInt = "+number);
		
		System.out.println("프로그램 끝");
	}
		
	static int convertInt (double f) {
		System.out.println("convertInt 함수 시작");
		int result = (int)f;
		System.out.println("convertInt 함수 끝");
		return result;
	}
	
	static int add(int n1, int n2){
			System.out.println("add 함수 시작");
			int result = n1 + n2;
			System.out.println("add 함수 끝");
			return result;
			
			
			
			
		}
	}


