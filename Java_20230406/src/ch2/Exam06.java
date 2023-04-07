package ch2;

import java.util.Scanner;

//면접 점수 >70, 실기 접수 > 70 합격 아니면 불합격
public class Exam06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("면접접수를 입력하세요 >>");
		int 면접점수 = sc.nextInt();
		System.out.println("실기접수를 입력하세요 >>");
		int 실기점수 = sc.nextInt();
		
		if (면접점수 >= 70) {
			if(실기점수 >= 70) {
				System.out.println("합격");
			}else
				System.out.println("불합격");
		}else {
			System.out.println("불합격");
		}
		
		
		System.out.println("프로그램 종료");
	}

}
