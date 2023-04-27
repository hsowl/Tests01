package ex04;

import java.io.IOException;

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

class Box{
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}


public class FruitAndBox {

	public static void main(String[] args) {

		Box aBox = new Box();	//사과
		Box oBox = new Box();	//오렌지
		
		aBox.setObj(new Apple()); //사과 저장
		oBox.setObj(new Orange());	//오렌지 저장
		
		Apple ap = (Apple)aBox.getObj();	//꺼내기
		Orange op = (Orange)oBox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
