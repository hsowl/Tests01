package ex01;

import java.util.Scanner;

public class Exam5_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String answer;
		
		String question[] = {"chair", "computer", "integer"};
		String answer2[] = {"의자", "컴퓨터", "정수"};
		
		
		for(int i = 0; i < question.length; i++) {
			System.out.print("Q"+(i+1)+".  "+question[i]+"의 뜻은?");
			answer = sc.next();
			if(answer.equals(answer2[i])) {
				System.out.println("정답입니다.");
				count++;
			}
			else
				System.out.println("틀렸습니다. 정답은 "+answer2[i]+"입니다.");
		}
		
		System.out.println();
		System.out.println("전체 3문제 중 "+count+"문제 맞추셨습니다.");
		
	}

}
