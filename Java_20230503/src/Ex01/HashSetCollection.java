package Ex01;

import java.util.HashSet;
import java.util.Set;

class Num{
	private int num;

	public Num(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}
	@Override
	public int hashCode() {
		return num%3;
	}
	@Override
	public boolean equals(Object obj) {
			return num == ((Num)obj).num ? true : false;
	}
	
	
}

public class HashSetCollection {

	public static void main(String[] args) {
		
		Set<Num> set = new HashSet();
		
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(20));
		set.add(new Num(20));
		
		for (Num s : set)
			System.out.println(s);
		
		Set<Integer> set2 = new HashSet<>();
		for(int i = 0; set2.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set2.add(num);
		}
		for (int s : set2)
			System.out.print(s+ ", ");
		
		
	}

}
