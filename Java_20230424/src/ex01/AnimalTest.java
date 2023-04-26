package ex01;

class Cat{
	void sound() {
		System.out.println("미야오오오오옹~");
	}
}

class Dog {
	void makeSound() {
		System.out.println("월월ㅇ러월어ㅜ월월월월월");
	}
}

class Pig {
	void sound() {
		System.out.println("꿀꿀꿀");
	}
}

class Rabbit {
	void makeSound() {
		System.out.println("토끼~토끼~");
	}
}

public class AnimalTest {
	// 고양이, 강아지, 돼지 짖는 소리

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		
		Dog dog = new Dog();
		dog.makeSound();
		
		Pig pig = new Pig();
		pig.sound();
		
		Rabbit rabbit = new Rabbit();
		rabbit.makeSound();
		
	}
}
