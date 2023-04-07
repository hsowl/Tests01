package qa01;

import java.util.Scanner;

public class Q_7 {

	public static void main(String[] args) {

//		정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램 작성
//		(90 이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 나머지는 F)
		
		int a,b,c,total;
		double average;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 3개를 차례대로 입력하세요");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		total = a+b+c;
		average = (a+b+c)/3;
		
		System.out.println("당신의 총점은 : "+total+ "입니다.");
		System.out.printf("당신의 평균은 : %.2f%n",average, "입니다.");
		
		if(average>100)
			System.out.println("점수를 다시 확인하여주세요.");
		else if(average>=90)
			System.out.println("당신의 학점은 A입니다.");
		else if (average>=80)
			System.out.println("당신의 학점은 B입니다.");
		else if (average>=70)
			System.out.println("당신의 학점은 C입니다.");
		else if (average>=60)
			System.out.println("당신의 학점은 D입니다.");
		else if (average<60 && average>=0)
			System.out.println("당신의 학점은 F입니다.");
		else
			System.out.println("점수를 다시 확인하여주세요");
			
		
	}

}
