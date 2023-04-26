package ex05;

import java.util.Calendar;

import java.util.Date;

class Sample {
	
}

class SingleTon{
	private static SingleTon instance;
	
	private SingleTon() {}
	
	public static SingleTon getInstance() {
		if(instance == null)
			instance = new SingleTon();
		
		return instance;
	}
}

public class SingleTonTests {

	public static void main(String[] args) {
		
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		System.out.println(s1 == s2);
		System.out.println("------------------------");
		
//		SingleTon sing1 = new SingleTon(); 에러 이유 설명? private 때문
		SingleTon sing1 = SingleTon.getInstance();
		SingleTon sing2 = SingleTon.getInstance();
		System.out.println(sing1 == sing2);
		
//		Calendar now = Calendar.getInstance();
		System.out.println(Calendar.getInstance().getTime());
		
	}

}
