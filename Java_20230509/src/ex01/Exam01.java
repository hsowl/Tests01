package ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam01 {

	public static void main(String[] args) throws IOException {
		
//		String path = "c:\\data\\data.txt";
		String path = "c:/data/data.dat";
		String message = "Hello, Java";
		
		OutputStream out = new FileOutputStream(path);
		
//		byte[] data = message.getBytes(); 
//		out.write('A');
		out.write(data);
		System.out.println("파일을 정상적으로 저장했슴둥");
		out.close();
		
		
		
		
		
		
		
		
		
	}
 }