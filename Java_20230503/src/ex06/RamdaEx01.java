package ex06;

interface MyFunction{
	int max(int a, int b);	//추상메소드
}

//class MyMax implements MyFunction{
//
//	@Override
//	public int max(int a, int b) {
//		return a>b? a : b;
//	}
//	
//}

public class RamdaEx01 {

	public static void main(String[] args) {
		MyFunction m = new MyFunction() {     //익명객체
			
			@Override
			public int max(int a, int b) {
				return a>b ? a:b;
			}
			
		};
		System.out.println("max : "+m.max(10, 20));
	
	
	}

}
