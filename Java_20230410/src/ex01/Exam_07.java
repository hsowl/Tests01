package ex01;

import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		
//	1+(-2) + 3 + (-4) + ....이런식으로 더해나갈 때, 몇까지 더해야 총합이 100이상 될까?
//	이 때 i값하고 총합을 출력
		
		
		
		int i = 0;
		int total = 0;
		
		
		for (i=0; ; i++) {
			if(i % 2 ==1)
				total += i;
			else
				total -= i;
			if(total>=100) break;
		}
		
		System.out.println("i : "+i+", total : "+total);

//		------------------------------------------------------
		
		
	
	}

}
