package ex01;

public class CalExam {

	public static void main(String[] args) {
		
		//인터페이스 구현
		System.out.println("---------------인터페이스 구현----------------");
		Calculation add = new Add();
		Calculation substract = new Subtract();
		Calculation multiplication = new Multiplication();
		Calculation division = new Division();
		
		System.out.println(add.calculate(10, 5));
		System.out.println(substract.calculate(10, 5));
		System.out.println(multiplication.calculate(10, 5));
		System.out.println(division.calculate(10, 5));
		System.out.println("---------------익명구현객체----------------");
		
		//익명구현객체
		Calculation add2 = new Calculation() {
			@Override
			public int calculate(int x, int y) {
				return x+y;
			}
		};
		System.out.println(add2.calculate(10, 5));
		
		Calculation substract2 = new Calculation() {
			@Override
			public int calculate(int x, int y) {
				return x-y;
			}
		};
		System.out.println(substract2.calculate(10, 5));	
		
		Calculation multiplication2 = new Calculation() {
			@Override
			public int calculate(int x, int y) {
				return x*y;
			}
		};
		System.out.println(multiplication2.calculate(10, 5));	
		
		Calculation division2 = new Calculation() {
			@Override
			public int calculate(int x, int y) {
				return x/y;
			}
		};
		System.out.println(division2.calculate(10, 5));	
		
		System.out.println("--------------람다식-----------------");
		
		
		//람다식
		Calculation add3 = (x,y) -> (x+y);
		System.out.println(add3.calculate(10, 5));
		
		Calculation substract3 = (x,y) -> (x-y);
		System.out.println(substract3.calculate(10, 5));
		
		Calculation multiplication3 = (x,y) -> (x*y);
		System.out.println(multiplication3.calculate(10, 5));
		
		Calculation division3 = (x,y) -> (x+y);
		System.out.println(division.calculate(10, 5));
	}

}
