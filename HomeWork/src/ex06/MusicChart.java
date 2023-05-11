package ex06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
	public int[] solution(String[] genres, int[] plays) {
		int answer = 0;
		int[] k = new int[10];
		return k;
	}

	public void solution(String string, int i) {
		
	}
}


public class MusicChart {

	public static void main(String[] args) {
		
		String[] genres = new String[100];
		int[] plays = new int[100];
		
		Map<String, Integer> map = new HashMap<>();
		genres[0] = "pop";
		genres[1] = "classic";
		genres[2] = "classic";
		genres[3] = "classic";
		genres[4] = "pop";
		
		plays[0] = 400;
		plays[1] = 100;
		plays[2] = 300;
		plays[3] = 1100;
		plays[4] = 500;
		
		for(int i = 0; i<5; i++) {
			map.put(genres[i], plays[i]);
		}
		
		
		
		
//		for(int i =0; i<plays.length;i++) {
//			plays[i] = (int)(Math.random()*100+1);
//		}
//		
//		genres[0] = "pop";
//		genres[1] = "pop";
//		
//		Map<String, List<Integer>> listMap = new HashMap<>();
//		List<Integer> list = new ArrayList<>();
//		list.add(plays[0]);
//		list.add(plays[1]);
//		
//		listMap.put(genres[0], list);
//		listMap.put(genres[1], list);
//		System.out.println(listMap.get(genres[0]));
//		System.out.println(listMap.get(genres[1]));
		
	}

}
