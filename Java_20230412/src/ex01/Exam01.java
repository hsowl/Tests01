package ex01;


public class Exam01 {

	public static void main(String[] args) {

//		조원3명 자바점수를 입력받아서
//		자바점수 배점은 랜덤함수이용해서 50~100사이 값이 저장되도록 한다.
//		조원 총점과 평균을 출력하는 프로그램 작성.
		
		
		
		int 김지민님 = (int)(Math.random()*50+1)+50;
		int 박종진님 = (int)(Math.random()*50+1)+50;
		int 김소휘님 = (int)(Math.random()*50+1)+50;
		
		int total = 김지민님+박종진님+김소휘님;
		double average = total/3;
		
		System.out.println("김지민님의 점수 : "+김지민님);
		System.out.println("박종진님의 점수 : "+박종진님);
		System.out.println("김소휘님의 점수 : "+김소휘님);
		System.out.println("조원의 총점은 : "+total);
		System.out.printf("조원의 평균은 : %.2f",average);
		
		
	}

}
