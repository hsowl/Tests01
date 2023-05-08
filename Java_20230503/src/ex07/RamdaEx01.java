package ex07;

interface MyFunction{
	int max(int a, int b);	
}

public class RamdaEx01 {

	public static void main(String[] args) {
		MyFunction m = (a, b) -> a>b ? a:b;
		
		
		System.out.println("max : "+m.max(10, 20)); 
	
	
	}

}
