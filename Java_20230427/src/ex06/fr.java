package ex06;

import java.util.ArrayList;

class Fruit 			  { public String toString() {return "Fruit";}}
class Apple extends Fruit {	public String toString() {return "Apple";}}
class Grape extends Fruit {	public String toString() {return "Grape";}}
class Toy 				  {	public String toString() {return "Toy";}}

class Box<T> {
	ArrayList<T> List = new ArrayList<T>();
	void add (T item) {	List.add(item);	}
	T get (int i) {	return List.get(i);	}
	int size() {return List.size();}
	public String toString() {return List.toString();}
	}

public class fr {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		
		appleBox.add(new Apple());
		
		toyBox.add(new Toy());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
		
	}

}