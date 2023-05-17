package ex09;

public class BinarySearch {

	public static void main(String[] args) {

		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int target = 5;

		int index = binarySearch(array, target);

		if (index != -1) {
			System.out.println("The target value is found at index " + index);
		} else {
			System.out.println("The target value is not found");
		}
		
		
	}

private static int binarySearch(int[] array, int target) {
		
		int answer = 0;
		
		int left = 0;
		int right = array.length;
		int mid;
		
		while(left <= right) {
			mid = (left+right)/2;
			
			
		}

		return answer;
	}
}
