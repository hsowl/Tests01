package ex01;

import java.util.Scanner;

public class Exam17 {

	public static void main(String[] args) {

		int user = 0;
		int com = 0;
		
		com = (int)((Math.random()*100)+1);
		Scanner sc = new Scanner(System.in);
		
		do { 
			System.out.println("1과 100사이의 정수 입력 >");
			user = sc.nextInt();
			if(user>com) {
				System.out.println("작은수");
			}else if (user<com) {
				System.out.println("큰수");
			}
			
		}while (user != com);
		
		System.out.println("정답입니다");
		
		
		
		
	}
	
}
