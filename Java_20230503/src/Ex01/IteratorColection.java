package Ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorColection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		Iterator<String> it = list.iterator(); // 반복자...다시 출력하고 싶으면 다시 입력
		while (it.hasNext()) {
			String st = it.next(); 
			System.out.println(st);
		}
		it = list.iterator();
		while (it.hasNext()) {
			String st = it.next();
			if (st.equals("Box"))
				it.remove();
		}
		it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

