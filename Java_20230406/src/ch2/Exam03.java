package ch2;

import java.util.Scanner;

//나의 이름, 주소, 나이(만으로 입력)를 입력 받아서 출력하는 프로그램 작성 (단 나이는 +1해서 출력)
public class Exam03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 주소 나이를 순서대로 입력하세요");
		String name = sc.nextLine();
		String address = sc.nextLine();
		int age = sc.nextInt();
		
		System.out.println("이름 "+ name);
		System.out.println("주소 "+ address);
		System.out.println("이름 "+ (age+1));
	}

}
