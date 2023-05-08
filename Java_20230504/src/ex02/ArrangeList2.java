package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class JustSort {
	public void sort(List<?> list) {
		Collections.reverse(list);
	}
}

class A implements Consumer<List<Integer>>{

	@Override
	public void accept(List<Integer> t) {
		JustSort ju = new JustSort();
		ju.sort(t);
	}
	
}

public class ArrangeList2 {

	public static void main(String[] args) {
		List<Integer> is = Arrays.asList(1,3,5,7,9);
		is = new ArrayList<>(is);
		System.out.println(is);
		
		
		
		JustSort ju = new JustSort();
		Consumer<List<Integer>> c = ju::sort;
		c.accept(is);
//		A a = new A();
//		a.accept(is);
//		System.out.println(is);
	}

}
