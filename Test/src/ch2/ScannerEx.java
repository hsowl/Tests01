package ch2;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력 하세요 : ");
		
		String input = Sc.nextLine();
		System.out.println(input);

	}

}
