package qa01;

import java.util.Scanner;

public class Q_5 {

	public static void main(String[] args) {

//		사용자로부터 정수를 입력받아서 양수인지 음수인지 확인하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		
		if (num==0)
			System.out.println("0입니다");
		else if(num>0)
			System.out.println("양수입니다");
		else if (num<0)
			System.out.println("음수입니다");
	}

}
