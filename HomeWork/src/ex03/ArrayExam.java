package ex03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ArrayExam {

	public static void main(String[] args) {
		
		int[] arr1 = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
		
		removeDuplicate(arr1);
		removeDuplicate(arr2);
		
		
	}

static void removeDuplicate(int[] arr) {
//	LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();
//	for(int i = 0; i<arr.length; i++) {
//		hashSet.add(arr[i]);
//	}
//	System.out.println(hashSet);
	
	Queue<Integer> q = new LinkedList<>();
	Queue<Integer> p = new LinkedList<>();
	for(int i = 0; i<arr.length; i++) {
		if(arr[i] != )
		q.add(arr[i]);
	}
	System.out.println(p);
	
	}
	
	
}
	
	

