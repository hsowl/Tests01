package ex01;

//RemoteControl 인터페이스 구현
public class Television implements RemoteControl, Searchable{

	@Override
	public void turnOn() {
		System.out.println("TV를 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void search(String ur1) {
		System.out.println(ur1+"를 검색합니다.");
	}
	
	

}

