package ex01;


public class Exam02 {

	public static void main(String[] args) {

		int sum = 0;
		double average = 0;
		int[] 조4 = new int[20];
		
		for (int i=0; i<조4.length; i++) {
			조4[i] = (int)(Math.random()*50+1)+50;
		}
		
		for (int i=0; i<조4.length; i++)
			sum += 조4[i];
		average = sum/3.0;
		
		for(int i=0; i<조4.length; i++)
			System.out.print( 조4[i]+ " ,");
		
		System.out.println();
		System.out.println(sum + " ," + average);
		
		
		
	}

}
