package ex01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntFile {

	public static void main(String[] args) throws IOException {

		String path = "c:/data/data.txt";
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream(path));
		out.writeInt(35);
		out.writeDouble(3.14);
		out.close();
	}

}
