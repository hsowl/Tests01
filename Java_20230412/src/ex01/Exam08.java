package ex01;

public class Exam08 {

	public static void main(String[] args) {

//		1~45 난수 추출하고 로또처럼 6개 번호 추출
		
	        int[] lotto = new int[6];
	        int[] numberArr = new int[45];

	        for (int i = 0; i < numberArr.length; i++)
	            numberArr[i] = i + 1;

	        //랜덤번호 생성
	        for (int i = 0; i < lotto.length; i++) {
	            int num = (int)(Math.random() * 45);

	            // 중복 숫자 제거
	            while (numberArr[num] == 0)
	                num = (int)(Math.random() * 45);

	            lotto[i] = numberArr[num];
	            
	            // 사용한 놈은 0으로 제거
	            numberArr[num] = 0;
	        }

	        //랜덤번호 출력
	        System.out.print("이번주 로또 번호는 :");
	        for (int i = 0; i < lotto.length; i++)
	            System.out.print(", " + lotto[i]);

	    }
		
		
		
		
		
}
