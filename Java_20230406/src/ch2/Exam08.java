package ch2;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		//세 정수를 입력받아서 최대값과 최소값 구하기.
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		int max, min=0;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		//최댓값 구하기
		if(num1>num2 && num1>num3)
			max=num1;
		else { 
			if(num2>num3) max = num2;
			else max = num3;}
		
		//최소값 구하기
		if(num1>num2 && num2<num3)
			min = num2;
		else {
			if(num1>num3 && num2> num3 ) min = num3;
			else min = num1;
		}
		
	
			
		System.out.println("최대값 :"+ max);
		System.out.println("최소값 :"+ min);
		
		
		}
		
}		


