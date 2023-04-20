package ex01;

import java.util.Scanner;

class Bank {
	String 계좌번호;
	String 계좌주;
	int 입금액;
	int 출금액;
	int 총금액;
	int count = 0;
	int 초기입금액;
 }
public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bk = new Bank();
		Bank[] bkArr = new Bank[100];
		
		for(int i=0; i<100;i++)
			bkArr[i] = new Bank();
		
		int num = 0;
		boolean flag = true;
		
		while(flag) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			System.out.println("선택>");
			num = sc.nextInt();
			
			switch (num) {
			case 1 : 
					 System.out.println("------");
					 System.out.println("계좌생성");
					 System.out.println("------");
					 System.out.print("계좌번호 : ");
					 bkArr[bk.count].계좌번호 = sc.next();
					 System.out.print("계좌주 : ");
					 bkArr[bk.count].계좌주 = sc.next();
					 System.out.print("초기입금액 : ");
					 bkArr[bk.count].초기입금액 = sc.nextInt();
					 bkArr[bk.count].총금액 += bkArr[bk.count].초기입금액;
					 bk.count++;
					 System.out.println("결과 : 계좌가 생성되었습니다.");
					 break;
			
			
			case 2 : 
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");
				for(int i=0; i<bk.count; i++) {
					System.out.println("계좌번호 : "+bkArr[i].계좌번호);
					System.out.println("예금액 : "+bkArr[i].총금액);
				}
				break;
				
			case 3 :
				System.out.println("------");
				System.out.println("예금");
				System.out.println("------");
				System.out.print("계좌번호 : ");
				String acNum = sc.next();
				for(int i =0;i<bk.count;i++) {
					if(acNum.equals(bkArr[i].계좌번호)) {
						System.out.print("예금액 : ");
						bkArr[i].입금액 = sc.nextInt();
						bkArr[i].총금액 += bkArr[i].입금액;
						break;
					}
				}		
				break;
			
			case 4 : 
				System.out.println("------");
				System.out.println("출금");
				System.out.println("------");
				System.out.print("계좌번호 : ");
				String acNum2 = sc.next();
				for(int i =0;i<bk.count;i++) {
					if(acNum2.equals(bkArr[i].계좌번호)) {
						System.out.print("출금액 : ");
						bkArr[i].출금액 = sc.nextInt();
						bkArr[i].총금액 -= bkArr[i].출금액;
						break;
					}
				}		
				break;
				
			case 5 : 
				System.out.println("프로그램종료");
				flag = false;
				break;
			}
		}
		
		
		
		
		
	}

}
