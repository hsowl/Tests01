package ex01;

public class Exam1_________1 {

	public static void main(String[] args) {

		int[] num = new int [5];
		
		for(int i = 0; i < num.length; i++) {
			num[i]	= (int)(Math.random()*100+1);
		}
		
		for(int i = 0; i<num.length; i++)
			for(int j = i; j<num.length; j++)
				if(num[i] > num[j]) {
					int tmp = num[i];
						num[i] = num[j];
						num[j] = tmp;
				}
		
		
		for(int i = 0; i < num.length; i++)
			System.out.print(num[i]+ " ,");
	
		
	}

}
