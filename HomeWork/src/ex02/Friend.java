package ex02;

import java.util.Scanner;

public class Friend {
   private String name;
   private int age;
   Scanner sc = new Scanner(System.in);
   
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
      while(true) {
      if(name.matches("^[ㄱ-ㅎ가-힣]*$")) {
         break;
      }
      else {
         System.out.println("이름은 한국어이여야 합니다.");
         System.out.println("이름을 다시입력하여주세요");
         System.out.print("이름 :");
         name = sc.next();
      }
   }
      this.name = name;
   }   
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      while (true) {
           if (age < 0 || age > 100) {
               System.out.println("나이는 0살 이상 100살 미만이여야 합니다.");
               System.out.println("나이를 다시 입력해주세요.");
               System.out.print("나이 : ");
               age = sc.nextInt();
           } else {
               this.age = age;
               break;
           }
       }
   }
}