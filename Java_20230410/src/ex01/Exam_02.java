package ex01;

public class Exam_02 {

	public static void main(String[] args) {

//		1~100까지 홀수 개수
		
		int count = 0;
		for(int i =1; i<=100; i++) 
			if(i % 2 != 0) {
				System.out.print(i+", ");
				count++;}
		System.out.println("\n1~100까지의 홀수의 갯수는" +count);
		
		count = 0;
		for (int i=1; i<=100; i = i+2)
			count++;
		System.out.println("\n1~100까지의 홀수의 갯수는" +count);
		
	}

}
