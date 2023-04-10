package ex01;

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		
//		사용자로부터 두개의 정수 (시작,끝)를 입력받아 시작포함해서 끝까지의 합을 출력
		
		Scanner sc =new Scanner(System.in);
		System.out.println("시작과 끝의 정수를 차례대로 입력하세요");
		int start = sc.nextInt();
		int finish = sc.nextInt();
		
		int total = 0;
		
		for (int i = start; i <= finish; i++)
			total += i;
		
		System.out.println(start+ "에서" +finish+ "까지의 정수의 합은" + total + "입니다.");
		
		
		
		
		
		
		
	}

}
