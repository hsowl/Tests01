package ex01;

public class Exam_11 {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1+","+num2);
		
		for(int i = 0; i<8; i++) {
			int k = (num1)+(num2);
			System.out.print(", "+k);
			num1 = num2;
			num2 = k;
		}
		System.out.println();

	}

}
