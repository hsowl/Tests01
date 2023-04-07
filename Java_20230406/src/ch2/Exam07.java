package ch2;

import java.util.Scanner;

// 성별, 나이 ----> 성별이 남성이면서 나이가 20세 이상이면 군대간다....아니면 안간다.
public class Exam07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 입력하세요");
		String 성별 = sc.nextLine();
		
//		sc.nextLine(); 버퍼에 남아있는 엔터 제거용으로 사용 (버그 발생 시 사용)
		
		System.out.println("나이를 입력하세요");
		int 나이 = sc.nextInt();
		
		// 문자 같은경우는 .equals로 비교를 해준다.
		// 문자열비교는 ==아니고, .equals로 비교한다.
		
		if(성별.equals("남")){
			if(나이 >= 20)
				System.out.println("군대가세요");
			else
				System.out.println("군대안가도되세요");}
		else 
			System.out.println("군대가지마");
		
		
		
		
		System.out.println("프로그램 종료");
	}

}
