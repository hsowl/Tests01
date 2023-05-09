package ex05;

import java.util.function.Function;

public class Example {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	public static double avg(Function<Student, Integer> f)  {
		double average = 0;
		double total = 0;
		for(Student student : students)
			total += f.apply(student);
		
		average = total/students.length;
		
		return average;
	}
	

	public static void main(String[] args) {
		
		
		
		double englishAvg = avg( s-> s.getEnglishScore());
		System.out.println("영어 평균 점수 : "+englishAvg);
		
		double mathAvg = avg( s-> s.getMathScore());
		System.out.println("수학 평균 점수 :"+mathAvg);
		
	}

}
