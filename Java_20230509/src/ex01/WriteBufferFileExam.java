package ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteBufferFileExam {

	public static void main(String[] args) throws IOException {

		String path = "c:/data/data.txt";
//		DataOutputStream out = new DataOutputStream(new FileOutputStream(path));
//		
//		for(int i = 1; i<=100; i++) {
//			out.writeInt(i);
//		}
//		System.out.println("파일을 저장했습니다.");
//		out.close();
		
		Writer out = new FileWriter(path);
		
		for(int i = 1; i<=100; i++) {
			String data = Integer.toString(i);
			out.write(data);
		}
		out.close();
		
	
	
	}

}
