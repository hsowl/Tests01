package ex01;

import java.util.Scanner;

class BankApplication{
	int 출금액;
	int 입금액;
	int 선택;
	int 초기입금액;
	int 총금액 = 0;
	int count = 0;
	String 계좌목록;
	String 계좌번호;
	String 계좌주;
}

public class WeJarang {

	public static void main(String[] args) {
		
		BankApplication bc = new BankApplication();
		BankApplication[] bcArr = new BankApplication[100];
		for(int i = 0; i<100; i++) {
			bcArr[i] = new BankApplication();
		}
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		boolean flag = true;
		
		while (flag) {
		
		System.out.println("---------------------------------");
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		System.out.println("---------------------------------");
		System.out.println("선택 >");
		num = sc.nextInt();
		
		switch (num) {
	      case 1 : 
	    	  System.out.println("------");
	    	  System.out.println("계좌생성");
	    	  System.out.println("------");
	    	  System.out.print("계좌번호 : ");
	    	  bcArr[bc.count].계좌번호 = sc.next();
	    	  System.out.print("계좌주 : ");
	    	  bcArr[bc.count].계좌주 = sc.next();
	    	  System.out.print("초기입금액 : ");
	    	  bcArr[bc.count].초기입금액 = sc.nextInt();
	    	  bcArr[bc.count].총금액 += bcArr[bc.count].초기입금액;
	    	  System.out.println("결과 : 계좌가 생성되었습니다.");
	    	  bc.count++;
	    	  break;
	      case 2 : 
	    	  System.out.println("------");
	    	  System.out.println("계좌목록");
	    	  System.out.println("------");
	    	  for(int i =0; i<bc.count; i++) {
	    		  System.out.println(bcArr[i].계좌번호+"   "+bcArr[i].계좌주+"   "+bcArr[i].총금액+"   ");
	    	  }
	    	  break;
	      case 3 :
	    	  System.out.println("------");
	    	  System.out.println("예금");
	    	  System.out.println("------");
	    	  System.out.print("계좌번호 : ");
	    	  String acNum = sc.next();
	    	  for(int i = 0; i<bc.count; i++) {
	    		  if(acNum.equals(bcArr[i].계좌번호))
	    			  System.out.println("계좌번호 : "+ bcArr[i].계좌번호);
	    			  System.out.println("예금액 : ");
	    			  bcArr[i].입금액 = sc.nextInt();
	    			  bcArr[i].총금액 += bcArr[i].입금액;
	    			  break;
	    	  }
	    	  break;
	      case 4 :
	    	  System.out.println("------");
	    	  System.out.println("출금");
	    	  System.out.println("------");
	    	  System.out.print("계좌번호 : ");
	    	  String acNum2 = sc.next();
	    	  for(int i = 0; i<bc.count; i++) {
	    		  if(acNum2.equals(bcArr[i].계좌번호))
	    			  System.out.println("계좌번호 : "+ bcArr[i].계좌번호);
	    		  System.out.println("출금액 : ");
	    		  bcArr[i].출금액 = sc.nextInt();
	    		  bcArr[i].총금액 -= bcArr[i].출금액;
	    		  break;
	    	  }
	    	  break;
	      case 5 :
	         System.out.println("프로그램 종료");
	         flag = false;
	         break;
		}  
		}
	}
}