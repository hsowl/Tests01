package ex01;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

//      몇 개의 숫자를 받을지 물어보는 코드를 작성하고,
//      숫자를 받아서 짝수의 값만 합해서 나오는 코드를 작성하시오.
//      소수점이나 문자를 받으면 다시 쓰라고 해야 하며 일을 끝내야함
      
      Scanner sc = new Scanner(System.in);
      System.out.println("몇 개의 숫자를 입력하실래용? :");
      int count = sc.nextInt();
      
      int sum = 0;
      int num;
      
      for(int i = 1; i <=count; i++) {
         System.out.println(i+"번쨰의 숫자를 입력해용");
         if (sc.hasNextInt()) {
            num = sc.nextInt();
            if(num%2==0)
               sum +=num;
            
         }else {
            System.out.println("에러 : 다시 숫자를 입력해용");
            sc.next();
            i--;
      
         }
      }
      System.out.println("짝수의 총합은"+sum+"입니다.");

		
		
	}

}
