package ex01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyFirstStream {

	public static void main(String[] args) {

		int[] arr = {1,2,2,3,4,5,5,6};
		
		//배열의 홀수의 갯수 구하기 (단, 중복제거)
		IntStream stm1 = Arrays.stream(arr);
		long count = stm1.distinct().filter(n -> n%2 != 0).count();
		System.out.println(count);
		
		
		
//		//배열의 짝수 합을 구하기 (단, 중복제거)
//		IntStream stm1 = Arrays.stream(arr);  // -> 배열 arr로부터 스트림 생성
//		//			     중복제거		짝수					최종연산
//		int total = stm1.distinct().filter(n -> n%2 == 0).sum(); 
//		System.out.println(total);
		
		String[] names = {"kim","park","hong","lee","kor","eng","math"};
		
		// 1. 이름출력
		Stream<String> stm2 = Arrays.stream(names);
		stm2.forEach(str -> System.out.println(str));
		System.out.println("------------------------------");
		stm2 = Arrays.stream(names);
		stm2.sorted().forEach(str -> System.out.println(str));
		
		// 2. 첫글자가 k만 출력
		System.out.println("------------------------------");
		stm2 = Arrays.stream(names);
		stm2.filter(name -> name.startsWith("k")).forEach(str -> System.out.println(str));
		
		// 3. 글자수가 4자 이상만 출력
		System.out.println("------------------------------");
		stm2 = Arrays.stream(names);
		stm2.filter(name -> name.length() >= 4).forEach(str -> System.out.println(str));
		
		
		List<String> list = Arrays.asList("Toy","Box","Robot");
		
		//1. 리스트를 스트림으로 변환 후 출력
		System.out.println("------------------------------");
		Stream<String> stream = list.stream();
		stream.forEach(n -> System.out.println(n));
		
		//2. 리스트를 스트림으로 변환 후 글자 갯수합을 출력
		System.out.println("------------------------------");
		stream = list.stream();
		long count2 = stream.map(n -> n.length()).count();
		System.out.println("글자수 : "+count2);
		
		System.out.println("------------------------------");
		stream = list.stream();
		int sum = stream.mapToInt(n -> n.length()).sum();
		System.out.println("글자 수 합 : "+sum);
		
	}
}