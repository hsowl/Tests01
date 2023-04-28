package ex05;

class Box<T> {
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
}

class Unboxer{
//	public static void peekBox(Box<? extends Number> box) { //상한 제한....Number에게 상속 받고 있는 애들은 다된다.
	public static void peekBox(Box<? super Integer> box) { //하한 제한....
		System.out.println(box.getOb());
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		Box<Integer> iBox = new Box<> ();
		iBox.setOb(123);
		
		Box<Double> dBox = new Box<>();
		dBox.setOb(123.124);
		
		Box<String> sBox = new Box<>();
		sBox.setOb("kor");
		
		Unboxer.peekBox(iBox);
		Unboxer.peekBox(dBox);
//		Unboxer.peekBox(sBox);
		
		
	}
	


}
