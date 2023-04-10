package naksujang;

public class Ex07 {

	public static void main(String[] args) {
//		1+(-2) + 3 + (-4) + ....이런식으로 더해나갈 때, 몇까지 더해야 총합이 100이상 될까?
//		이 때 num값하고 총합을 출력
		
		int total = 0;
		int num = 0;
		
		for(num = 1; ; num++) {
			if(num%2 == 1)
				total += num;
			else
				total -= num;
			if(total>=100); break;}
				
		System.out.println(total);
		System.out.println(num);
		
	}

}
