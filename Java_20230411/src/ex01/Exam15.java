package ex01;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {

//		랜덤함수 1~100사이 숫자를 가지고 있다.
//		유저가 컴퓨터 숫자를 맞추는게임
		
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random()*100)+1;
		int count = 0;
		while (true) {
			System.out.println("1부터 100까지의 정수 중 하나를 입력해주세요.");
			int user = sc.nextInt();
			count++;
			System.out.println("당신이 선택한 숫자는"+user+"입니다");
			
			if(user==com) {
				System.out.println("맞췄습니다.");
				System.out.println("당신은 "+count+"번만에 맞췄습니다.");break;
				}
			else if (user>com)
				System.out.println("작은수");
			else if (user<com)
				System.out.println("큰수");
		}
		
		
	}
	
}
