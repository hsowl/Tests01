package ex01;

// Tv 클래스 설계    예) int num, int kor
class Tv {
//	멤버변수, 필드
	String color;
	boolean power;
	int channel;
	
//	메서드, 함수
	void power( ) {power = !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
	
}


public class Exam01 {

	public static void main(String[] args) {

		Tv tv = new Tv();
		tv.color = "빨강";
		tv.channelUp();
		tv.channelUp();
		
		System.out.println(tv.color);
		System.out.println(tv.channel);
	
		
		
		Tv lgTv = new Tv();
		lgTv.color = "흰색";
		System.out.println(lgTv.color);
		System.out.println(lgTv.channel);
		
		
		
	}

}
