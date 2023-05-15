package ex07;

public class Algorithm {

	public static void main(String[] args) {
		int num = 5;
		
		int result = factoral(num);
		System.out.println(result);
		
		int x = 14;
		if (x>10&&x<20) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
	}
	
	public static int factoral(int num) {
		int answer = 0;
		if(num==1) {
			return 1;
			
		}
		return factoral(num-1)*num;
		
	}
	
	
}
