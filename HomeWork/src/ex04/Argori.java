package ex04;

public class Argori {

	public static void main(String[] args) {
		int[] a = {5,10,73,2,-5,42};
		
		System.out.print("정렬 전 : ");
		for(int arr : a)
			System.out.print(arr + ", ");
		
		reverse(a);
		
		System.out.println();
		
		System.out.print("정렬 후 :");
		for(int arr : a)
			System.out.print(arr + ", ");
		
		
		
		
	}
	static void reverse (int[] a) {
		
		int[] tmp = new int[a.length];
		
		for(int i = 0; i<a.length;i++) {
			tmp[i] = a[a.length-i-1];
		}
		for(int i = 0;i<a.length;i++) {
			a[i] = tmp[i];
		}
	}
	
}
