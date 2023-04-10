package ex01;

import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		
//		3이상 4462 이하에서 짝수인 정수의 합
		
		int total = 0;
		
		for (int i=3; i <=4462; i++)
			if(i % 2 ==0)
				total += i;
		System.out.println(total);
				
		
		
		
		
		
		
		
	}

}
