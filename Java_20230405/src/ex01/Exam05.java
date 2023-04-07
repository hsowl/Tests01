package ex01;

public class Exam05 {

	public static void main(String[] args) {
		
		int jumsu = 80;
		
		String result=null;
		
		//삼항연산자 or 조건연산자   ()? 참일 때 실행 : 거짓일 때 실행문장  p130.
		
		/* boolean */
			
		result = (jumsu >=60) ? "합격" : "불합격";
		
		System.out.println("당신은 " + result + " 입니다");
		
		
	}

}
