package ex01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadBufferFileExam {

	public static void main(String[] args) throws IOException {

		String path = "c:/data/data.txt";
		
//		DataInputStream in = new DataInputStream(new FileInputStream(path));
//		for(int i = 0; i<100; i++) {
//			System.out.println(in.readInt());
//		}
//		in.close();
		
		Reader in = new FileReader(path);
		
		for(int i = 0; i<100; i++) {
//			String data = Integer.toString(i);
			String data = in.read();
			System.out.println(data);
		}
		
		
		
	}

}
