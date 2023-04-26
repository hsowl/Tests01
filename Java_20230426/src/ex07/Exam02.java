package ex07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class Exam02 {

	public static void getHtml(String url) {
		try{
			URL targetUrl = new URL (url);
			BufferedReader reader = new BufferedReader(new InputStreamReader(targetUrl.openStream()));
			StringBuffer html = new StringBuffer();
			String tmp = "";
			
			while ((tmp = reader.readLine()) != null) {
				html.append(tmp);
			}
			reader.close(); // 이 부분 전에 예외가 발생하면 BufferedReader를 닫지 못하고 catch문으로 빠지는 문제
			return html.toString();
			
			} catch (MalformedInputException e) {
				reader.close(); // 초기에는 추가하지 않았던 코드
				e.printStackTrace();
				throw e;
			} catch (IOException e) {
				reader.close(); // 초기에는 추가하지 않았던 코드
				e.printStackTrace ();
				throw e;
			} catch (Exception e) {
				reader.close(); // 초기에는 추가하지 않았던 코드
				e.printStackTrace ();
				throw e;
		
		
	}
			}
		
		
		
		
		
	}
}