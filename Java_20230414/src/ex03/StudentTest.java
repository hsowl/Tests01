package ex03;

class Student {
	String name;
	String address;
	int age;
	static int count;
	
	
	void displayInfo() {
		count++;
		System.out.println(name+" , "+age+ " ,"+ address + "현재 학생 수 : "+ count);
	}
	
	
}

public class StudentTest {

	public static void main(String[] args) {
		
		Student kim = new Student();
		kim.name = "김씨요";
		kim.age = 20;
		kim.address = "수원이요";
		
		
		Student park = new Student();
		park.name = "박씨요";
		park.age = 200;
		park.address = "안산이요";
		
		Student lee = new Student();
		Student hong = new Student();
		
		kim.displayInfo();
		park.displayInfo();
		lee.displayInfo();
		hong.displayInfo();
		
		
	}

}
