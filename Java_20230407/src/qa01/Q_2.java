package qa01;

import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {

//	정수 한개를 입력받아서 그 수가 50 이상의 수인지 50미만의 수인지 판단
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나를 입력하세요");
		int num = sc.nextInt();
		
		if(num>=50)
			System.out.println("50 이상의 정수입니다");
		else
			System.out.println("50 미만의 정수입니다");
			
		
		
	}

}
