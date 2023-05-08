package ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(5, "Kim");
		map.put(10, "Park");
		map.put(9, "Lee");
		map.put(10, "Hong");
		map.put(8, "Park");
		map.put(1, "Kim");
		
		
		System.out.println(map);
		System.out.println(map.get(9));
//		map.clear();
//		map.remove(9);
		System.out.println(map);
		System.out.println("-------------");
		
		Set<Integer> set = map.keySet();
		for(int n : set) {
			System.out.println(n);
		}
		System.out.println("-----------------");
		for(int n : set) {
			System.out.println(map.get(n));
		}
	}

}
