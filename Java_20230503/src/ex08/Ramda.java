package ex08;

interface Myfunction {
	int square(int a);
}
interface Myfunction2{
	void printVar (String name, int i);
}


public class Ramda {

	public static void main(String[] args) {
		Myfunction m = x -> x*x;
		System.out.println(m.square(10));
	
		Myfunction2 m2 = (name,i) -> System.out.println(name+"="+i);
		m2.printVar("박종진", 25);
	}
	

}
