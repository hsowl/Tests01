package ex04;

enum Scale{
	DO, RE, Mi, FA
}

public class simpleEnum {

	public static void main(String[] args) {
		System.out.println(Scale.DO.ordinal());
		System.out.println(Scale.DO.name());
	}

}
