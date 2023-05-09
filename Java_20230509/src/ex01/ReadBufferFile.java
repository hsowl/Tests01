package ex01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBufferFile {

	public static void main(String[] args) throws IOException {

		String path = "c:/data/data.txt";
		String message = null;
		int byteread = 0;
		byte[] data = new byte[1024];
		
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(path));
		while((byteread = in.read(data)) != -1) {
			message = new String(data,0,byteread);
			System.out.println(message);
			
		}
		
	
	}

}
