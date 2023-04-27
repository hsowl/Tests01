package ex07;

class Box<T>{
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class BoxFactory{
	public static <T extends Number> Box<T> makeBox(T o){
		Box<T> box = new Box<T>();
		box.set(o);
		
		System.out.println("Boxed Data : "+o.intValue());
		return box;
	}
}

class Unboxer{
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println("Unboxed Data : "+box.get().intValue());
		return box.get();
	}
}

public class BoundedGenericMethod {

	public static void main(String[] args) {
		Box<Double> sBox = BoxFactory.makeBox(new Double(7.77));
		Double n = Unboxer.openBox(sBox);
		System.out.println("n : "+n);
	}
}
