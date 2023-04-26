package ex04;

public class Exam01 {
	
	public static void main(String[] args) {

		String[] arr = {"100", "kor", "300"};
		
		for(int i = 0; i<arr.length+1; i++) {
			try {
				int vaule = Integer.parseInt(arr[i]);
				System.out.println(vaule);
			}catch(NumberFormatException e) {
				e.printStackTrace();
				System.out.println("숫자가 아닌 문자열은 숫자로 변환이 불가합니다.");
			}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("배열의 크기를 벗어났습니다.");
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("예외 처리");
			}finally {
				System.out.println("예외가 발생하든 발생하지 않든 무조건 처리해야 되는 문장을 여기다 기입");
			}
		}
	System.out.println("프로그램 종료");
		
	}
}
