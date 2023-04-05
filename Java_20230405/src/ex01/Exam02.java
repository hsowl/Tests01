package ex01;

public class Exam02 {

	public static void main(String[] args) {
		
		double d = 85.4;
		int score = 10;
		
		d = score;
//		d = (double)score; 프로그램에서 자동으로 바꿔줌 <----예시
		
		System.out.println(d);
		
		d = 85.4;
		score = (int)d;
		System.out.println(score);
		
		int sum = 5;
		long longsum = 3000000000l;
		
//		longsum = sum;
		sum = (int)longsum;
		
		System.out.println(sum);
		
		System.out.println(5|2);
		
		
		
		
		
	}

}
