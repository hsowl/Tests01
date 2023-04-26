package ex06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exam04 {

	public static void main(String[] args) throws IOException {
		
		String filePath = "C:/data/data.txt";
		String filePath2 = "C:/data/sample.txt";
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			reader = new BufferedReader(new FileReader(filePath2));
			writer = new BufferedWriter(new FileWriter(filePath));
			String line = null;
			
			while( (line = reader.readLine()) != null) {
				writer.write(line+"\r\n");
				
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			reader.close();
			writer.close();
		}
		
		
	}

}
