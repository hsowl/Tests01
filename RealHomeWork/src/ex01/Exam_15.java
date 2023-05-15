package ex01;

public class Exam_15 {

	public static void main(String[] args) {

		int number = 12321;
		int tmp = number;
		
		int result = 0;
		
		while(tmp != 0) {
			
			for(int  i= 0; i<2; i++) {
				
				result = tmp%100000;
			}
			
			
//			result = tmp%100000;
//			System.out.println(result);
//			result = tmp%10000;
//			System.out.println(result);
//			result = tmp%1000;
//			System.out.println(result);
//			result = tmp%100;
//			System.out.println(result);
//			result = tmp%10;
//			System.out.println(result);
//			tmp = 0;
		}
		
		if(number == result) {
			System.out.println(number + "는 회문수 입니다.");
		}else
			System.out.println(number + "는 회문수가 아닙니다.");
		
		
	}

}
