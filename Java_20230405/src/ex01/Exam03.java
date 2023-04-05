package ex01;

public class Exam03 {

	public static void main(String[] args) {
		int num = 10;
		int sum = 0;
		int tmp = 0;
		
		
//		num = num + 1;   밑줄과 같은 의미 |||| 밑줄은 간단히 쓰기 위함임
//		num += 1;        8~11번째 줄까지 같은 의미
//		num++;
//		++num;			 
		
//		num = num-1;
//		num -= 1;
		
		tmp = --num;
		sum = num--;
		
//		sum = ++num;
		
//		tmp = ++num;
//		tmp = num++;
		
		System.out.println("tmp : " + sum);
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
	}

}
