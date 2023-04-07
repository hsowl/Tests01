package ex01;

public class SpecialCharEx {

	public static void main(String[] args) {
		System.out.println('\''); //'''처럼 할 수 없다
		System.out.println("abc\t123\b456"); // \b에 의해 3이 지워진다.
		System.out.println('\n'); // 개행문자 출력하고 개행
		System.out.println("\"Hello\""); //큰따옴표를 출력하고 싶으면 이렇게한다.
		System.out.println("c;\\"); //파일 경로표시
		System.out.println("\uac63"); // 표준코드
	}

}
