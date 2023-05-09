package ex01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBufferFile {

	public static void main(String[] args) throws IOException {

		String path = "c:/data/data.txt";
		String message = "Hello, Java";
		
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(path));
		byte[] data = message.getBytes();
		out.write(data);
		System.out.println("파일을 저장했습니다.");
		out.close();
	
	
	}

}
