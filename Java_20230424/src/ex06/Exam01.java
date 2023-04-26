package ex06;

interface Animal {
	void eat();
	void sleep();
}

class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("고양이는 먹는다");
	}

	@Override
	public void sleep() {
		System.out.println("고양이는 잔다");
	}
	
}

class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("강아지는 먹는다");
	}

	@Override
	public void sleep() {
		System.out.println("강아지는 잔다");
	}
	
}

public class Exam01 {
   public static void main(String[] args) {
	   Dog d = new Dog();
	   d.eat();
      }
   }