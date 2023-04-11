package ex01;


public class Exam09 {

	public static void main(String[] args) {

	int num = 10000;
	int sum = 0;
//	int length = (int)(Math.log10(num)+1);
	
	for(int i = 0; i < int length(num) ; i++) {
		sum	 += num % 10;
		num /= 10;
	}
	System.out.println("sum = "+sum);
		
	}
	
}
