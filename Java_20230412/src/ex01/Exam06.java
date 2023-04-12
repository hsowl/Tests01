package ex01;


public class Exam06 {

	public static void main(String[] args) {

//		1. int 배열 10개 생성
//		2. 랜덤함수 이용해서 10개 설정
//		3. 최대값, 최소값 출력
		
		int[] num = new int [10];
		int max;
		int min;
		
		for (int i = 0; i<num.length;i++)
			num[i] = (int)(Math.random()*100+1);
		
		for(int i = 0; i<num.length; i++)
			System.out.print(num[i] + ",");
		System.out.println();
//	-----------------------------------------------------------	
		System.out.println("오름차순 정렬!!");
		
		for(int i = 0; i<num.length; i++)
			for(int j = i; j<num.length; j++)
				if(num[i]>num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}

		for(int i = 0; i<num.length; i++)
			System.out.print`(num[i]+" ,");
		
		
	}


	for(int j = 0;


	public static void main(String[] args) {
		= num [i]
	} j<num.length; j++)
	
	
	
}
