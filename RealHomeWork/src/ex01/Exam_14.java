package ex01;

import java.util.Scanner;

public class Exam_14 {

	public static void main(String[] args) {

		int answer = (int)(Math.random()*100+1);
		int input = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요");
			input = sc.nextInt();
			
			if(answer == input) {
				System.out.println(count+"회 만에 맞췄습니다.");
				break;
			}else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요");
			}else if (answer > input) {
				System.out.println("더 큰 수를 입력하세요");
			}
			
		}while(true);
		
		
	}

}
