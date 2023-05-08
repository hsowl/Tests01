package ex01;

class Taxi implements Meter{

	final int FARE = 20000;
	@Override
	public void start() {
		System.out.println("운행을 시작합니다.");
	}

	@Override
	public int stop(int distance) {
		System.out.print("운행을 종료합니다.");
		int total = 0;
		total = FARE + (distance*2);
		System.out.println("요금은 "+total+"입니다.");
		return total;
	}
	
}


interface Meter{
	void start();
	int stop(int distance);
}

public class MyFatherTaxiDriver {

	public static void main(String[] args) {
		Taxi taxi = new Taxi();
	     taxi.start();
	     taxi.stop(10000);
	
	}

}
