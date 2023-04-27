package ex05;

class Apple{
	public String toString() {
		return "I am an apple";
	}
}

class Orange{
	public String toString() {
		return "I am an orange";
	}
}

class Box<T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}

public class FruitAndBox {

	public static void main(String[] args) {

		Box<Apple> aBox = new Box();	//사과
		Box<Orange> oBox = new Box();	//오렌지
		
		
		aBox.setObj(new Apple()); //사과 저장
		oBox.setObj(new Orange());	//오렌지 저장
		
		Apple ap = aBox.getObj();	//꺼내기
		Orange or = oBox.getObj();
		
		System.out.println(ap);
		System.out.println(or);
		
	}

}
