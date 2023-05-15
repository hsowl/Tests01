package ex01;

public class Exam_01 {

	public static void main(String[] args) {

		//1번
		int x = 11;
		if(x>10 || x<20)
			System.out.println(true);
		else
			System.out.println(false);
		
		//2번
		char ch = ' ';
		if(ch != ' ')
			System.out.println(true);
		else
			System.out.println(false);
		
		//3번
		char ch1 = 'x';
		if(ch1 == 'x' || ch1 == 'X')
			System.out.println(true);
		else
			System.out.println(false);
		
		//4번
		char ch2 = '1';
//		if(ch2 == "^[0-9]*$")
			
		//5번
		char ch3;
		
		//6번
		int year = 400;
		if(year%400 != 0 && year%4 !=0 && year%100 != 0)
			System.out.println(true);
		else
			System.out.println(false);
		
		//7번
		boolean powerOn = false;
		if(powerOn == false)
			System.out.println(true);
		else
			System.out.println(false);
		
		//8번
		String str = "yes";
		if(str.equals("yes"))
			System.out.println(true);
		else
			System.out.println(false);
		
	}

}
