package ex01;

import java.util.Arrays;

//186p 예제


public class Exam03 {

	public static void main(String[] args) {

		int[] score = new int[5];
		for (int i = 0; i<5; i++)
			score[i] = 50 + 10*i;
		
//		for(int i = 0; i < 5; i++)
//			System.out.printf("score[%d] = %d%n",i,score[i]);
		
		System.out.println(Arrays.toString(score));
			
	}

}
