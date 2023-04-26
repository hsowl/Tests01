package ex06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class Exam01 {

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
		

		String filePath1 = "C:/data/sample1.txt"; // 생성할 파일의 경로와 파일 이름
		String content = line; // 새로운 내용
		        
		   try (FileWriter writer = new FileWriter(filePath1, true)) { // FileWriter 객체를 사용하여 파일을 쓰기 모드로 열고, true로 설정하여 파일 끝에 내용 추가
		            writer.write(content); // 파일에 내용 쓰기
		            writer.write(System.lineSeparator()); // 줄바꿈
		            System.out.println("Successfully wrote to the file."); // 성공적으로 파일에 쓰였음을 출력
		 } catch (IOException e) {
		            System.out.println("An error occurred."); // 파일 쓰기 실패시 오류 메시지 출력
		            e.printStackTrace();
		 }
	}
		
}


