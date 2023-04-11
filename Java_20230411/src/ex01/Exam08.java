package ex01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

	int num = 0, sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력하세요 : ");
	String tmp = sc.nextLine();
	num = Integer.parseInt(tmp);
	
	while(num != 0) {
		sum += num%10;
		System.out.println("sum = "+sum+ "    num = "+num);
		
		num /= 10;
	}
	System.out.println("각 자리수의 합 : "+sum);
		
	
	}

}
