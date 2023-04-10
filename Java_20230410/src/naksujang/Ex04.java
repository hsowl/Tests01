package naksujang;

public class Ex04 {

	public static void main(String[] args) {

//		3이상 4462 이하에서 짝수인 정수의 합
		
		int total = 0;
		
		for(int num = 3; num<=4462; num++)
			if(num%2 == 0)
				total += num;
		System.out.println(total);
		
	}

}
