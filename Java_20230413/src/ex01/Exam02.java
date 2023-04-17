package ex01;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {

//		arrNum의 배열크기가 5개라서 부족하다..10개로 증가하고 싶다.
		
		int[] arrNum = {10,20,30,40,50};
		System.out.println(Arrays.toString(arrNum));
		
		int[] arrNum2 = new int [10];
		
		for(int i = 0; i<arrNum.length; i++)
			arrNum2[i] = arrNum[i];
		
		System.out.println(Arrays.toString(arrNum2));
		
		arrNum = arrNum2;
		System.out.println(Arrays.toString(arrNum));
		
		
		int[] tmp = new int[10];
		
		
		tmp = arrNum; // arrNum의 주소값을 tmp의 복사
					  // 따라서 arrNum와 tmp는 같은 배열 공간을 참조
					  // 같은 배열의 공간을 참조하기 때문에 밑에서 arrNum[?]의 값을 바꿔도 tmp의 값이 같이 바뀐다 
		
		arrNum[3] = 100;
		
		System.out.println(Arrays.toString(tmp));
		System.out.println(Arrays.toString(arrNum));
		System.out.println(tmp);
		System.out.println(arrNum);
		System.out.println("--------------------------------------");
	
		int[] arr = {10,20,30,40,50};
		int[] arr2 = new int[10];
		System.arraycopy(arr, 0, arr2, 3, arr.length);
		System.out.println(Arrays.toString(arr2));
	
	
	}

}
