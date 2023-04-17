package ex01;

import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {

//		배열 10개 생성후 랜덤으로 1~100 사이 값을 넣는다.
//		배열 10개 총점과 평균을 구한다.
//		배열 10개 최대값, 최소값을 구한다.
//		배열 10개 오름차순 정렬을 한다.
		
//		1~100사이에 최대값과 최소값을 임의로 설정 하고 총합과 평균 구하기
		
		int[] num = new int [10];
		
		for(int i = 0; i < num.length; i++) {
			num[i]	= (int)(Math.random()*100+1);
		}
		
//		for(int i = 0; i < num.length; i++)
//			System.out.printf("num[%d] = %d%n",i,num[i]);
		
		int total = 0;
		for(int i = 0; i < num.length; i++)
			total += num[i];
//			total = num[0] + num[1] + num [2] + num[3] + ......+ num[9]
		
		double average = total/10.0;
		
		System.out.println("총점은 : "+total);
		System.out.printf("평균은 : %.2f%n",average);
		
//		최대값과 최소값 구하기
		
		int max = num[0];
		int min = num[0];
		
		
		for(int i = 0; i < num.length; i++) 
			if(num[i] > max )
				max = num[i];
		
		
		for(int i = 0; i < num.length; i++) 
			if(num[i] < min )
				min = num[i];
		
		
		System.out.println("최대값은 : "+max);
		System.out.println("최소값은 : "+min);
		
//		오름차순으로 정렬하기
		
		for(int i = 0; i<num.length; i++)
			for(int j = i; j<num.length; j++)
				if(num[i] > num[j]) {
					int tmp = num[i];
						num[i] = num[j];
						num[j] = tmp;
				}
		
		for(int i = 0; i < num.length; i++)
//			System.out.printf("num[%d] = %d%n",i,num[i]);
			System.out.print(num[i]+ " ,");
	
//	System.out.println(Arrays.toString(num));
	
	}

}
