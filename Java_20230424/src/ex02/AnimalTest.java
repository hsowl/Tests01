package ex02;

abstract class Animal{      //추상클래스   ---> 추상클래스로 더이상 객체 생성을 하지마
	abstract void makeSound(); //추상메소드
	}


// 추상메소드가 있는 클래스를 상속받는 클래스는 반드시 추상메소드를 오버라이딩하여 사용해야한다.
// 추상클래스로 제약이 걸린 상위 class는 객체 생성이 안되기 때문에

class Cat extends Animal{
	void makeSound() {
		System.out.println("미야오오오오옹~");
	}
}

class Dog extends Animal{
	
	@Override // 어노테이션 --> 붙이는 것을 권장
	// Override --> 상위클래스는 재정의 하겠다는 적극적 표헌?
	//어노테이션을 붙임으로 사용자의 실수를 줄일 수 있음
	void makeSound() {
		System.out.println("월월ㅇ러월어ㅜ월월월월월");
	}
}

class Pig extends Animal{
	void makeSound() {
		System.out.println("꿀꿀꿀");
	}
}

class Rabbit extends Animal{
	void makeSound() {
		System.out.println("토끼~토끼~");
	}
}



public class AnimalTest {
	// 고양이, 강아지, 돼지 짖는 소리

	public static void main(String[] args) {
		Animal[] animals = {new Cat(), new Dog(), new Pig(), new Rabbit()};
		
		for(int i = 0; i<animals.length; i++)
			animals[i].makeSound();
		
		for(Animal an : animals)   //향상된 For문
			an.makeSound();
		
		Dog d= new Dog();
		d.makeSound();
		
	}
}
