package ex01;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface A{
	int max (int a, int b);
}

@FunctionalInterface
interface B {
	void printVar (String name, int i);
}

@FunctionalInterface
interface C {
	int square (int x);
}

@FunctionalInterface
interface D {
	int roll();
}

@FunctionalInterface
interface E {
	int sumArr(int[] Arr);
}


public class Exam01 {

	public static void main(String[] args) {
		A aa = (a,b) -> a>b ? a:b;
		System.out.println("최대값 : "+aa.max(10, 20));
		
		BiFunction<Integer, Integer, Integer> bf = (a, b) -> a>b ? a:b;
		System.out.println("최대값 : "+bf.apply(10, 20));

		B bb = (name,i) -> {System.out.println(name+"="+i); };
		bb.printVar("박종진", 10);
		BiConsumer<String, Integer> bc = (name, age) -> {System.out.println(name+"="+age);};
		bc.accept("박종진", 20);
		
		
		
		
		C cc = x -> x*x;
		System.out.println(cc.square((int)(Math.random()*10)+1));
		
		
		
		D dd = () -> (int)(Math.random()*6);
		System.out.println(dd.roll());
		System.out.println("-------------------");
		Supplier<Integer> s = () -> (int)(Math.random()*6);
		System.out.println(s.get());
		
		
		E ee = Arr -> {int sum=0; for(int i : Arr) sum += i; return sum; };
		System.out.println(ee.sumArr(new int[] {10,20,30,40}));
		
		
		
		
		
		Function<int[], Integer> f = arr -> {int sum=0; for (int i : arr) sum += i; return sum; };
		System.out.println(f.apply(new int[] {10,20,30,40,50}));
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력하세요 : ");
//		String name = sc.next();
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		
//		BiFunction<String, Integer, String> bf2 = (name1 ,i) -> "이름은 "+name1+"이고 나이는 "+i+"세 입니다.";
//		System.out.println(bf2.apply(name, age));
		
	}

}
