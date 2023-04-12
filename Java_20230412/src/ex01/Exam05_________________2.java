package ex01;


public class Exam05_________________2 {

	public static void main(String[] args) {

//		1. int 배열 10개 생성
//		2. 랜덤함수 이용해서 10개 설정
//		3. 최대값, 최소값 출력
		
		int[] num = new int [10];
	
		for(int i = 0; i <num.length; i++) {
			num [i] = (int)(Math.random()*100+1);
			System.out.printf("num[%d] = %d%n",i,num[i]);
		}
			int max = num[0];
			int min = num[0];
			
			for (int i = 0; i< num.length; i++)
				if (num [i] > max )
					max = num [i];
			
			for (int i = 0; i< num.length; i++)
				if (num [i] < min )
					min = num [i];
			
			System.out.println(max);
			System.out.println(min);
			
		
	}

}
