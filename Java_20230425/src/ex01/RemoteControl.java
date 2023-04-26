package ex01;

//인터페이스 선언
public interface RemoteControl {
	//상수(public static final 생략가능)
	int MAX_VOLUME = 10;    
	int MIX_VOLUME = 10;
	
	//추상메소드 -> Body 없음
	public void turnOn();
	public void turnOff();
	
	//디폴트 메소드 ---> 인터페이스에서 사용 : 구현클래스에서 재정의 선택 가능
	default void setMute (boolean mute) {
		if(mute) 
			System.out.println("무음처리합니다.");
		else 
			System.out.println("무음처리를 해제합니다.");
	}
	
	//정적메소드 ---> public 생략 가능
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
	
	
	
	
}
