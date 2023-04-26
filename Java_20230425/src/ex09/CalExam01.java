package ex09;

public class CalExam01 {

	public static void main(String[] args) {
		
		//인터페이스 구현
		Calculable cal1 = new Test();
		System.out.println(cal1.calculate(6));
		
		//익명구현객체
		Calculable cal2 = new Calculable() {
			@Override
			public int calculate(int x) {
				return x*x*x;
			}
		};
		cal2.calculate(2);
		
		//람다식
		Calculable cal = x ->  x*x*x;
		System.out.println(cal.calculate(5));
	}

}
