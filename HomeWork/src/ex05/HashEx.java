package ex05;

import java.util.HashMap;

public class HashEx {

	public static void main(String[] args) {
		
		String[] phone_book = new String[3];
		
		phone_book[0] = "119, 97674223,  1195524421";  //필요시에 trim() 써보는 연습해보며 좋을듯 합니다.
		phone_book[1] = "123,456,789";
		phone_book[2] = "12, 123, 1235, 567, 88";

		phoneNumList(phone_book);
		
	}
	
	private static boolean phoneNumList(String[] phone_book) {
		boolean answer = true;
		
		HashMap<String,String> hashMap = new HashMap<>();
		
		for(int i = 0; i<phone_book.length; i++) {
			phone_book[i].trim().split(",");
		
		
		}
		
		return answer;
	}
	
	
}
