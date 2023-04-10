package ex01;

import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		
//	1+(-2) + 3 + (-4) + ....이런식으로 더해나갈 때, 몇까지 더해야 총합이 100이상 될까?
//	이 때 i값하고 총합을 출력
		
		int sum = 0;
		int sign = 1;
		int tmp = 0;
	
		
		
		
		for (int i=1; true ; i++,sign = -sign) {
			tmp = sign * i;
			sum += tmp;
			if(sum>=100) break;
		}
		
		System.out.println("tmp : "+ tmp +", total : "+sum);

//		------------------------------------------------------
		
		
		
	}

}
