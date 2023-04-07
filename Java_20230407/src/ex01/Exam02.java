package ex01;

import java.util.Scanner;

public class Exam02 {

	//성적을 입력받아서 학점 구하는 프로그램 작성
	//90이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("성적입력 : ");
		int num = sc.nextInt();
		
		if(num >=90)
			System.out.println("A학점");
		else  if (num >=80)
			System.out.println("B학점");
		else  if (num >=70)
			System.out.println("C학점");
		else  if (num >=60)
			System.out.println("D학점");
		else
			System.out.println("F학점");
		
		System.out.println("프로그램 종료");
		
		

}
}