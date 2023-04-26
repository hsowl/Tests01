package ex07;

public class Home {
	//		익명구현객체
	private RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("Tv를 켭니다");
		}
		
		@Override
		public void turnOff() {
			System.out.println("Tv를 끕니다");
		}
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
}
