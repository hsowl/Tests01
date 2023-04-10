package naksujang;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//		1~100까지 홀수 개수
//		1~100까지 짝수 개수
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int count = 0;
		int count2 = 0; 
		for(int num = a; num<=b ; num++)
			if(num%2==1)
				count++;
			else
				count2++;
		
		
		System.out.println(a+"~"+b+"까지의 홀수의 갯수 : "+count);
		System.out.println(a+"~"+b+"까지의 짝수의 갯수 : "+count2);
		
		
		
	}

}
