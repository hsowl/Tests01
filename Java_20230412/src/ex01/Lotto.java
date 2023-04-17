package ex01;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	      int[] lotto = new int[45];
//	      
//	      for(int i=0; i<lotto.length; i++)
//	         lotto[i] = i+1;
//	      
//	      for(int i=0; i<lotto[i]; i++) {
//	         int num = (int)(Math.random()*45+1);
//	         int tmp = lotto[i];
//	         lotto[i] = lotto[num];
//	         lotto[num] = tmp;
//	         
//	      }
//	      
//	      System.out.println("이번주 로또 번호는 : ");
//	      for(int i=0; i<6; i++)
//	         System.out.print(lotto[i]+", ");
//	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
//	      //6
	      int[] lotto = new int[6];
	      //랜덤번호 생성
	      for(int i=0; i<lotto.length; i++) {
	         lotto[i] = (int)(Math.random()*45)+1;
	         //중복번호 제거
	         for(int j=0; j<i; j++) {
	            if(lotto[i]==lotto[j]) {
	               i--;
	            }
	         }
	      
	      }
	      //랜덤번호 출력
	      System.out.print("이번주 로또 번호는 :");
//	      for(int i = 0; i < lotto.length; i++)
//	         System.out.print( ", "+lotto[i]);
	      System.out.println(Arrays.toString(lotto));
	      
	      
	      
	      
	}

}
