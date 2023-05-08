package ex04;

enum Animal{
	DOG,CAT
}
enum Person{
	MAN,WOMAN
}

public class simpleEnum2 {

	public static void main(String[] args) {
		who(Person.MAN);
		who(Person.WOMAN);
//		who(Animal.CAT);
	
	}

	public static void who(Person p) {
		switch(p) {
		case MAN :
			System.out.println("남성");
			break;
		case WOMAN : 
			System.out.println("여성");
			break;
		}
	}
	
	
}
