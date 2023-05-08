package ex02;

public class YongBuildTest {
	private String name;
	private int age;
	public YongBuildTest(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getInfo() {
		return "이름 : "+ name+ "나이 : "+age;
	}
	
	
}
