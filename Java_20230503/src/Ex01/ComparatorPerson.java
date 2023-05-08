package Ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person implements Comparable<Person> {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + ", " + age;
	}
	@Override
	public int compareTo(Person p) {
		return p.age - this.age;
	}
}
class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.age - o2.age;
	}
	
}

public class ComparatorPerson {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("yoon",26));
		list.add(new Person("park",21));
		list.add(new Person("kim",35));
		list.add(new Person("lee",32));
		
		Collections.sort(list, new PersonComparator());
//		Collections.sort(list, (o1,o2) -> o1.age - o2.age); // 람다식 age 오름차순
//		Collections.sort(list, (o1,o2) -> o1.name.length() - o2.name.length()); // 람다식 name 오름차순
		
		for (Person p : list)
			System.out.println(p);

	}

}
