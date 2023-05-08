package Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AsListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
//		list.add("Toy");
//		list.add("Box");
//		list.add("Robot");
//		list.add("Box");
		
		List<String> list2 = Arrays.asList("Toy","Box","Robot","Box");
//		list2.add("ggg"); / asList 사용시 add 불가능
		List<String> is = new ArrayList(list2); // ArrayList 객체 생성 후 추가
		is.add("ggg");
		List<String> is2 = new ArrayList(is); // ArrayList 객체 생성 후 추가
		is2.add("ttt");
		for (String str : is2) 
			System.out.println(str);
	}
}

