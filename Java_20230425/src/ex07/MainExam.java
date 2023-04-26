package ex07;

public class MainExam {

	public static void main(String[] args) {
		Home home = new Home();
		home.use1();
		
		home.use2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("오디오 전원 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("오디오 전원 끕니다");
			}
		});
	}

}
