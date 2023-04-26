package ex05;

//중첩 인터페이스 : 해당 클래스와 밀접한 관계를 맺는 구현 객체를 만들기 위해서이다.
public class Button {

	public static interface ClickListener{
		void onClick();
	}
		
	private ClickListener clickListener;
	
	public void setClickListener (ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {     //Button이 클릭되었을 때 실행되는 메소드 선언
		this.clickListener.onClick();
	}
	
	
	
}
