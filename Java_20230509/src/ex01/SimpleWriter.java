package ex01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class SimpleWriter {

	public static void main(String[] args) throws IOException {
		
		
		String path = "c:/data/data1.txt";
		
//		Writer writer =  new FileWriter(path);
//		writer.write(path, 3, 7);
//		writer.close();
		
		Reader reader = new FileReader(path);
		
		int ch;
		
		while(true) {
			ch = reader.read();
			if(ch == -1) break;
			System.out.print((char)ch);
		}
		
		
	}

}
