package ex01;


public class Exam04 {

	public static void main(String[] args) {

		int sum = 0;
		
		int[] num = new int[] {10,20,30}; //new int 생략가능
		
//		int[] arrNum = {10,20,30};
		
		for(int i = 0; i<3; i++)
			sum+=num[i];
		System.out.println(sum);
		
	}

}
