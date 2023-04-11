package ex01;


public class Exam10 {

	public static void main(String[] args) {

	
		int sum = 0;
		int i = 0;
		
		while(true) {
			sum +=i;
			i++;
			
			System.out.println("sum = "+sum);
			
			if(sum>10000000) break;
		}
		System.out.println("프로그램 종료");
		
	}
	
}
