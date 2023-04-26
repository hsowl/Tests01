package ex08;

class Value{
	int value;
	String name;
	
	public Value(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "["+name + ","+ value + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(this.value == ((Value)obj).value)
			return true;
		else
			return false;
		
//		return this.value == ((Value)obj).value ? true : false;
	}


public class EqualsEx1 {

	public static void main(String[] args) {
		Value v1 = new Value("KIM",10);
		Value v2 = new Value("PARK",10);
		
		System.out.println(v1.value == v2.value);
		System.out.println(v1.equals(v2));
		
	}

}
