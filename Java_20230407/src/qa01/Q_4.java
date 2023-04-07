package qa01;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {

//		사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, total;
		double average;
		
		System.out.println("세 개의 정수를 차례대로 입력하세요");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		total = a+b+c;
		average = total/3;
		
		if(a>b && b>c) 
			System.out.println("최대값 = "+a);
		else if (b>a && b>c)
			System.out.println("최대값 = "+b);
		else if (c>a && c>b)
			System.out.println("최대값 = "+c);
		if (a<b && b<c)
			System.out.println("최소값 = "+a);
		else if (b<a && b<c)
			System.out.println("최소값 = "+b);
		else if (c<a && c<b)
			System.out.println("최소값 = "+c);
		
		System.out.println("총 점수는 :" +total);
		System.out.printf("평균은 : %.2f",average);
	
	
	}
	
	
	

		
	
}
