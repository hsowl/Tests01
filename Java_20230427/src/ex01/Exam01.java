package ex01;

class Card {
	void info() {
		System.out.println("Card()");
	}
}




public class Exam01 {

	public static void main(String[] args) throws ClassNotFoundException {
	
		char[] c = {'h', 'e', 'l', 'l', 'o'};
		String s = new String(c);
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Hello");
		String s1 = new String(sb);
		System.out.println(s1);
		
		System.out.println("aaa".compareTo("aaa"));
		System.out.println("aaa".compareTo("AAA"));
		String s2 = "Hello";
		String s3 = s2.concat(" World!!");
		System.out.println(s3);
		
		String ab = "AABBAABB";
		String r = ab.replaceAll("B", "K");
		System.out.println(r);
		
		String animals = "dog,pig,cat";
		String[] arr = animals.split(",");
		for(String ar : arr)
			System.out.println(ar);
			
		String s4 = "java.lang.Object";
		boolean b = s4.startsWith("jav");
		boolean b2 = s4.startsWith("lang");
		System.out.println(b);
		System.out.println(b2);
		
		String c1 = s4.substring(10);
		String p =  s4.substring(5,9);
		System.out.println(c1);
		System.out.println(p);
		
		
	}
}
