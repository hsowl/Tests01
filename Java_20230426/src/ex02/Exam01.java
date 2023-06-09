package ex02;

public class Exam01 {

	public static void main(String[] args) {
	
		System.out.println("[프로그램 시작]");
		printLength("This is Java");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}

	private static void printLength(String data) {
		int result = 0;
		try {
			result = data.length();
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}finally {
			System.out.println("문자수 : "+ result);
		}
	}

}
