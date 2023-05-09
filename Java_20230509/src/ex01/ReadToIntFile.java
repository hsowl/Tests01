package ex01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadToIntFile {

	public static void main(String[] args) throws IOException {

		String path = "c:/data/data.txt";
		
		DataInputStream in = new DataInputStream(new FileInputStream(path));
		System.out.println(in.readInt());
		System.out.println(in.readDouble());
		in.close();
		
	}

}
