package ex01;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

//		1~45 난수 추출하고 로또처럼 6개 번호 추출
		
		int[] lotto = new int[45];
		
		for(int i = 0 ; i < lotto.length ; i++) 
			lotto[i] = i+1;
		
		for(int i = 0; i<lotto.length; i++) {
			int num = (int)(Math.random()*45);
			int tmp = lotto[i];
			lotto[i] = lotto[num];
			lotto[num] = tmp;
		}
		
		System.out.println("이번주 로또 번호는 : ");
		for(int i=0; i<6; i++)
			System.out.print(lotto[i]+ " ,");
		
		
			
//		int user = 0;
//		int[] num1 = new int[6];
//		System.out.println();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("원하시는 로또 번호 6개를 입력해주세요 (1~45만 가능)");
//		for(int i = 0 ; i < num.length ; i++) {
//			num1[i] = sc.nextInt();
//		}
//		System.out.print(num1[0]+ " ,");
//		System.out.print(num1[1]+ " ,");
//		System.out.print(num1[2]+ " ,");
//		System.out.print(num1[3]+ " ,");
//		System.out.print(num1[4]+ " ,");
//		System.out.print(num1[5]);
//		
//		if(num[0] == num1[0] && num[1] == num1[1] && num[2] == num1[2] && num[3] == num1[3] && num[4] == num1[4] && num[5] == num1[5])
//			System.out.println("당첨입니다.");
//		else
//			System.out.println("까비!");
//		
		
	}

}
