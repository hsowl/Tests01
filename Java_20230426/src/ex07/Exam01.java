package ex07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam01 {

	public static void main(String[] args) throws IOException {
		
		String filePath = "C:/data/sample.txt";
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String line = null;
			
			while( (line = reader.readLine()) != null ) {
				System.out.println(line);
			}
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
