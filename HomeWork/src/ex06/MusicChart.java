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
		
		
		return plays;
	}

	public void solution(String string, int i) {
		
	}
}


public class MusicChart {

	public static void main(String[] args) {
		
		String[] genres = {"pop","classic","classic","classic","pop"};
		int[] plays = {400, 100, 300, 1100, 500};
		
		Map<String, List<Integer>> map = new HashMap<>();
//		Map<String, Integer> map = new HashMap<>();
		List<Integer> classicList = new ArrayList<>();
		List<Integer> popList = new ArrayList<>();
		
		for(int i = 0; i<genres.length; i++) {
			map.put(genres[i], null);
		}
		
		classicList.add(plays[1]);
		classicList.add(plays[2]);
		classicList.add(plays[3]);
		popList.add(plays[0]);
		popList.add(plays[4]);
		
		
		for(int i = 0; i<genres.length; i++) {
			if(map.containsKey(genres[i])) {
				map.put(genres[i], classicList);
			}else if(map.containsKey(genres[i])) {
				map.put(genres[i], popList);
			}
		}
		
//		for(int i = 1; i<genres.length; i++) {
//			if(map.containsKey(genres[i])) {
//				
//			}
//			map.put(genres[i], list.get(i));
//		
//		}
		System.out.println(map);
		
		
		
		
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


