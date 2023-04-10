package naksujang;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
//		사용자로부터 두개의 정수 (시작,끝)를 입력받아 시작포함해서 끝까지의 합을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작과 끝을 정할 두가지 정수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int total = 0;
		
		for(int i = num1 ; i <=num2 ; i++)
			total += i;
		System.out.println(num1+"부터"+num2+"까지의 합은"+total+"입니다");
		
		
	}

}
