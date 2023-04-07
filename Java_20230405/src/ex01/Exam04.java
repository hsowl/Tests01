package ex01;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		/*	
		int num = 8;
		int cnt = 3;
		System.out.println(num / cnt);
		System.out.println(num % cnt);
		*/
		
		
		
		
//		과제 키보드를 4000초 입력을 받은 후 화면상 1시간 6분 40초가 나오게 해봐라
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시간 초를 입력하세요 : ");
		
//		String input = Sc.nextLine();   ----->내가 적은거
//		System.out.println(input);      ----->내가 적은거
		int num = sc.nextInt();   /*------> 선생님이 한거 Integer.parseInt랑 비슷한거임~*/
		
		
//		int num = Integer.parseInt(input);    --------->내가 적은거
		
		System.out.print(num/3600+"시간 "); //시간계산
		System.out.print((num%3600)/60+"분 "); //분계산
		System.out.print(num%60+"초");
		

}
}