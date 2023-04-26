package ex01;

public interface Calculation {
	int calculate (int x, int y);
}

class Add implements Calculation{
	@Override
	public int calculate(int x, int y) {
		return x+y;
	}
}

class Subtract implements Calculation{
	@Override
	public int calculate(int x, int y) {
		return x-y;
	}
}

class Multiplication implements Calculation{
	@Override
	public int calculate(int x, int y) {
		return x*y;
	}
}

class Division implements Calculation{
	@Override
	public int calculate(int x, int y) {
		return x/y;
	}
	
}



