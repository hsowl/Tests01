package ex08;

public class CalExam01 {

	public static void main(String[] args) {
		Calculable cal = new Calculable() {public void calculate(int x, int y) {}};
		cal.calculate(10, 5);
		
		// ---> 람다식
		cal = (x,y) -> System.out.println("x-y = "+ (x-y));
		cal.calculate(15, 8);
		
		cal = (x,y) -> System.out.println("x-y : "+(x-y));
		cal.calculate(5, 7);

		cal = (x,y) -> System.out.println("x*y : "+(x*y));
		cal.calculate(10, 3);
		
		
		
	}

}
