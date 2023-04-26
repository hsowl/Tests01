package ex06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Exam03 {

   public static void main(String[] args) {

      try {
    	 FileReader reader = new FileReader("C:/data/sample.txt");
         FileWriter writer = new FileWriter("C:/data/data.txt");
         
          int character;
               while ((character = reader.read()) != -1) {
                   writer.write(character);
               }

               reader.close();
               writer.close();
               System.out.println("파일 복사가 완료되었습니다.");
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
   }
