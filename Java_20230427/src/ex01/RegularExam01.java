package ex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam01 {

	public static void main(String[] args) {

		String str = "1234567890";
		
		Pattern p = Pattern.compile("^[0-9]*$"); //정규식
		Matcher m = p.matcher(str); //str이 정규표현식과 일치하는지 판단.
		System.out.println(m.find());

		System.out.println("-----------------------------------------");
		
		String str2 = "123abc";
		Pattern p2 = Pattern.compile("^[0-9A-z]{6}$");
		Matcher m2 = p2.matcher(str2);
		System.out.println(m2.find());
		
		System.out.println("-----------------------------------------");
		
		String str3 = "aaaaaaa@111122222com";
		Pattern p3 = Pattern.compile("[\\w]*@[\\w]*.com$");
		Matcher m3 = p3.matcher(str3);
		System.out.println(m3.find());
	
		System.out.println("-----------------------------------------");
		
		String str4 = "c77";
		Pattern p4 = Pattern.compile("^[b|c].{2}$");
		Matcher m4 = p4.matcher(str4);
		System.out.println(m4.find());
	
		System.out.println("-----------------------------------------");
		
		String str5 = "c77";
		Pattern p5 = Pattern.compile("^[b|c].{2}$");
		Matcher m5 = p5.matcher(str5);
		System.out.println(m5.find());
	
	}

}
