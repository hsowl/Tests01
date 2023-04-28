package ex01;

class Box {
	private Object ob;

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}
	
}

class Unboxer{
	public static Object openBox(Box box) {
		return box.getOb();
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		Box box = new Box();
		box.setOb(123);
		
		//Unboxer클래스 openBox를 이용해서 ob를 꺼내서 변수에 담아서 출력해보자.
		System.out.println(box.getOb());
		
		
	}
}
