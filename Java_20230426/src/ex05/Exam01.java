package ex05;

public class Exam01 {

	public static void main(String[] args) throws ClassNotFoundException {

		findClass();
		
		
		System.out.println("프로그램 종료");
	}

	private static void findClass() throws ClassNotFoundException {
		
		
		Class.forName("java.lang.String2");
		
		
	}

}
