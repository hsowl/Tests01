package ex06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam02 {

	public static void main(String[] args) throws IOException {
		
		String filePath = "C:/data/sample.txt";
		String line = null;
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filePath));
			line = null;
			
			while( (line = reader.readLine()) != null ) {
				System.out.println(line);
			}
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			reader.close();
		}
		String filePath2 = "C:/data/sample2.txt";
		
		BufferedReader reader1 = null;
		try {
			reader1 = new BufferedReader(new FileReader(filePath2));
			line = null;
			
			while( (line = reader1.readLine()) != null ) {
				System.out.println(line);
			}
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			reader1.close();
		}
		
		
		
	}

}
