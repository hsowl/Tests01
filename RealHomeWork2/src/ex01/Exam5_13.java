package ex01;

import java.util.Scanner;

public class Exam5_13 {

	public static void main(String[] args) {

		String[] words = { "television", "computer", "mouse", "phone" };
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			for(int j = 0; j < words[i].length(); j++) {
				int tmp = (int)(Math.random()*words[i].length());
				char k = question[tmp];
				question[tmp] = question[j];
				question[j] = k;
			}
			
			
			
			System.out.printf("Q%d. %s의 정답을 입력하세요. >", i+1, new String(question));

			String answer = sc.nextLine();

			if(words[i].equals(answer.trim()))
				System.out.printf("맞았습니다.%n%n");
			else
				System.out.printf("틀렸습니다.%n%n");
		}
		
	}

}
