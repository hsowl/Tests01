package ex01;

import java.util.Scanner;

public class RealMajimak {

	
	public static void main(String[] args) {	

//      1~45 난수 추출하고 로또처럼 6개 번호 추출
	      
//      변수 지정
      Scanner sc = new Scanner(System.in);
      int[] lotto = new int[6];   // 로또 넘버 랜덤 지정을 위해 사용
      int[] numberArr = new int[45];  //로또 넘버 랜덤 지정을 위해 사용
//      int user = 0;       // 왜 넣었는지 까머금 필요 없음
      int[] user1 = new int[6]; // 내가 입력한 값을 받기 위해 배열 배정
      int count = 0;   // 내가 입력한 값과 로또 값이 맞은 갯수를 세기 위해 사용
      int bonus = 0;   // 보너스 번호를 난수로 정하기 위해 사용
      int userBonus = 0;   // 보너스 번호를 입력받기 위해 사용
//      "검증하기 위해 사용"
//-------------------------------------------------------------------
//      for(int i = 0 ; i < num.length ; i++)
//      num[i] = i+1;
//      
//      for(int i = 0; i<num.length; i++) {
//         int num2 = (int)(Math.random()*45);
//         int tmp = num[i];
//         num[i] = num[num2];
//         num[num2] = tmp;
//      }
//   
//         bonus = (int)(Math.random()*45);
//   
//         System.out.println();
//         System.out.println("이번주 로또 번호는 : ");
//         for(int i=0; i<6; i++)
//            System.out.print(num[i]+ " ,");
//         System.out.print("이며 보너스 번호는 : "+bonus+"입니다.");
//--------------------------------------------------------------
//      검증하기 위해 사용은 여기까지입니다.
      
//      user가 입력한 값을 저장하고 내보내기 위한 코드   
         
      System.out.println("원하시는 로또 번호 6개를 입력하세요. (1~45만 가능)");
      for(int i = 0 ; i < 6 ; i++) {
         while(true) {
            user1[i] = sc.nextInt();
            if (user1[i] > 45 || user1[i] <=0) { 
               System.out.println(i+1+"번째 번호 입력이 잘못되었습니다. 다시입력하여주세요");
            }else {
               break;
            }
      }
      }
//      bonus 번호를 입력받고 저장하기 위해 사용
      
      System.out.println("보너스 번호를 입력하세요 (1~45만 가능)");
      while (true) {
         userBonus = sc.nextInt();
         if (userBonus > 45 || userBonus <=0) {
            System.out.println("보너스번호 입력이 잘못되었습니다. 다시입력하여주세요.");}
          else {
            break;
      }
      }
      
//      입력 값들을 내보냄
      
      System.out.print("당신이 입력한 로또 번호는 : "+user1[0]+ " ,");
      System.out.print(user1[1]+ " ,");
      System.out.print(user1[2]+ " ,");
      System.out.print(user1[3]+ " ,");
      System.out.print(user1[4]+ " ,");
      System.out.print(user1[5]+ " , 이며, 보너스 번호는 : ");
      System.out.print(userBonus+"입니다.");
      
//      로또번호 난수와 보너스번호 난수를 저장하고 내보내기 위해 사용 1 : 다른분이 알려준 방법
      
      for (int i = 0; i < numberArr.length; i++)
         numberArr[i] = i + 1;
      
      for (int i = 0; i < lotto.length; i++) {
         int num = (int)(Math.random()*45);
         
         //중복 숫자 제거
         while (numberArr[num] == 0)
            num = (int)(Math.random()*45);
         
         lotto[i] = numberArr[num];
         
         //사용한 숫자는 0으로 설정해서 제거
         numberArr[num] = 0;
      }
      
      bonus = (int)(Math.random()*45);

//      로또번호 난수와 보너스번호 난수를 저장하고 내보내기 위해 사용 2 : 선생님이 알려준 방법
//      for(int i = 0 ; i < lotto.length ; i++) 
//         lotto[i] = i+1;
//      
//      for(int i = 0; i<lotto.length; i++) {
//         int num2 = (int)(Math.random()*45);
//         int tmp = lotto[i];
//         lotto[i] = lotto[num2];
//         lotto[num2] = tmp;
//      }
//      
//      bonus = (int)(Math.random()*45);
   
      System.out.println();
      System.out.println("이번주 로또 번호는 : ");
      for(int i=0; i<6; i++)
         System.out.print(lotto[i]+ " ,");
      System.out.print("이며 보너스 번호는 : "+bonus+"입니다.");
      
      
//      결과값을 출력하기 위한 코드
      
      System.out.println();
      for(int i = 0; i < 6; i++)
         if(lotto[i] == user1[i])
            count++;
      
      if(count == 6)
         System.out.println("당첨입니다.");
      else if (count == 3)
         System.out.println("5등입니다.");
      else if (count == 4)
         System.out.println("4등입니다.");
      else if (count == 5 && userBonus != bonus)
         System.out.println("3등입니다.");
      else if (count == 5 && userBonus == bonus)
         System.out.println("2등입니다.");
      else
         System.out.println("낙첨입니다.");
      
   }

}