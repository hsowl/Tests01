package ex09;

public class BinarySearch {

	public static void main(String[] args) {

		int[] array = {5, 2, 3, 4, 12, 6, 7, 8, 9, 10};
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
			answer = array[mid];
			if(target == answer) {
				return answer;
			}
			else
				right = right-1;
			
		}

		return answer;
	}
}
