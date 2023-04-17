package ex01;

import java.util.Arrays;

public class Exam6 {

	public static void main(String[] args) {

//	int[] n = new int[5];
//	
//	int[][] num = new int [4][3];
//	
//	num[2][1] = 100;    
//	
//	int[][]	num2 = {
//			{1,2,3,3},
//			{4,5,6,6,6},
//			{7,8,9,8,6,6}
//	};
//		
//		for (int i =0; i<3; i++) {
//			for(int j =0; j<num2[i].length; j++)
//				System.out.print(num2[i][j]);
//			System.out.println();
//		}	

		
//		주석 처리는 내가 한 방법, 아닌거는 선생님 방법
		
		
	int[][] num3 = new int[4][4];
	
	for(int i = 0; i<num3.length; i++) 
		for(int j=i; j==i; j++) {
			num3[i][j] = i+1;
			}
	
	for(int i = 0; i<num3.length; i++) {
		for(int j=0; j<num3[i].length; j++) {
			System.out.print(num3[i][j]);
		}
		System.out.println();
	}
	
	
	System.out.println(Arrays.toString(num3[0]));
	System.out.println(Arrays.toString(num3[1]));
	System.out.println(Arrays.toString(num3[2]));
	System.out.println(Arrays.toString(num3[3]));
//	for (int i = 0; i<4; i++) {
//		for(int j = 0; j<4; j++) {
//			if(i==j) num3[i][j] = 1+i;
//			System.out.print(num3[i][j]);
//		}
//		System.out.println();
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
