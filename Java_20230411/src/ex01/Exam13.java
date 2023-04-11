package ex01;


public class Exam13 {

	public static void main(String[] args) {
//		break 문 p.175 예제

			int sum=0;
			int i=0;
			
			while(true) {
				if(sum>100)
					break;
				i++;
				sum+=i;
				System.out.println("sum : "+sum);
			}
			System.out.println( "num : "+ i);
			
			System.out.println("프로그램 종료");
	
		
		
	}
	
}
