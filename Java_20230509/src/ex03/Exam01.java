package ex03;

interface Printable{
	void print();
}

class Mydocument implements Printable{
	
	String Title;
	String Author;
	String Content;
	
	
	
	public Mydocument(String title, String author, String content) {
		super();
		Title = title;
		Author = author;
		Content = content;
	}

	@Override
	public void print() {
		System.out.println("Title : "+Title);
		System.out.println("Author : "+Author);
		System.out.println("Content : "+Content);
	}
	
}

public class Exam01 {

	public static void main(String[] args) {
		Mydocument doc = new Mydocument("My document","박종진","몰류");
		doc.print();
		
		
	}

}
