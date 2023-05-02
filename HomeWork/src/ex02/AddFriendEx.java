package ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class AddFriendEx {

   public static void main(String[] args) {
      
      FriendsInfo fi = new FriendsInfo();
      FriendsInfo[] fiArr = new FriendsInfo[100];
      for(int i = 0; i<fiArr.length; i++) {
         fiArr[i] = new FriendsInfo();
      }
//      ArrayList<FriendsInfo> fiArr2 = new ArrayList<>();
      
      Scanner sc = new Scanner(System.in);
      
      
      int num = 0;
      int count = 0;
      boolean flag = true;
      
      while (flag) {
         System.out.println("----------------------------");
         System.out.println("1.친구등록|2.친구삭제|3.친구목록|4.종료");
         System.out.println("----------------------------");
         System.out.print("선택 >");
         num = sc.nextInt();
      
      switch (num) {
      
      case 1 : 
         System.out.print("이름 : ");
         String name = sc.next();
         fiArr[count].setName(name);
         System.out.print("나이 : ");
         int age = sc.nextInt();
         fiArr[count].setAge(age);
         System.out.print("주소 : ");
         String address = sc.next();
         fiArr[count].setAddress(address);
         System.out.print("핸드폰번호 : ");
         String phoneNum = sc.next();
         fiArr[count].setPhoneNum(phoneNum);
         System.out.print("이메일주소 : ");
         String emailAddress = sc.next();
         fiArr[count].setEmailAddress(emailAddress);
         count++;
         break;
      
      case 2 :      
         for(int i = 0; i<count; i++) {
            System.out.println(i+1+"."+fiArr[i].getName());
         }
         System.out.print("삭제할 친구의 번호를 입력하여주세요");
         int friendNum = sc.nextInt();
         System.out.println(fiArr[friendNum-1].getName()+"을/를 삭제할까요?");
         System.out.print("확인은 y, 취소는 n을 입력하여주세요 >");
         String answer = sc.next();
         if(answer.equals("y")) {
            System.out.println("성공적으로 친구를 삭제하였습니다");
            fiArr[friendNum-1] = fiArr[friendNum];
            break;
            }
         else if (answer.equals("n")) {
            System.out.println("취소되었습니다");
            break;
         }
         else {
            System.out.println("y와 n중 하나를 골라주세요");
            break;
         }
      case 3 :
         int j = 0;
         if(count == 0) {
            System.out.println("등록된 친구가 없습니다");
            System.out.println("친구를 먼저 등록하여주세요");
         }
         System.out.println("-----------------------------------------------------------------------------------");
         System.out.println("\t이름\t|\t나이\t|\t주소\t|\t핸드폰번호\t|\t이메일주소\t|");
         System.out.println("-----------------------------------------------------------------------------------");
         for(int i = 0; i<count; i++) {
            System.out.printf("\t"+fiArr[i].getName()+"\t\t"+fiArr[i].getAge()+"\t\t"+fiArr[i].getAddress()+"\t"+fiArr[i].getPhoneNum()+"\t\t"+fiArr[i].getEmailAddress());
            System.out.println();
         }
         System.out.println("뒤로돌아가실려면 4번을 눌러주세요");
         int back = sc.nextInt();
         sc.nextLine();
         break;
      
      case 4 :    
         flag = false;
         System.out.println("프로그램 종료");
         
      }
         
      }
      
      
      
   }

}