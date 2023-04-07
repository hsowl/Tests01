package qa01;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {

//	1학년부터 4학년까지 중간고사 시험을 봤다
//	4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격 -> 이를 판단하는 프로그램 작성
//	점수가 0미만 100초과이면 경고문구 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학년과 점수를 차례대로 입력하세요 : ");
		int grade = sc.nextInt();
		int score = sc.nextInt();
		
		
		
		//4학년 점수확인
		if (grade == 4 && score >= 70 && score <= 100) 
				System.out.println("합격입니다");
		else if (grade == 4 && score < 70 && score >= 0)
				System.out.println("불합격입니다");
		
		//123학년 점수확인
		else if (grade <=3 && grade > 0 && score >= 60 && score <= 100)
				System.out.println("합격입니다");
		else if (grade <=3 && grade > 0 && score < 60 && score >= 0)
				System.out.println("불합격입니다.");
		else
				System.out.println("학년과 점수를 확인하세요");
		
		
		
	}

}
