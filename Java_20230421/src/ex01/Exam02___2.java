package ex01;

class Buyer{
   int money = 1000;
   Product[] cart = new Product[3];
   int i = 0;
   
   void buy(Product p) {
      if(money < p.price) {
    	  
      }
   }
   
   void add(Product p) {
   }
   
   void summary() {
   }
}

class Product{
   int price;
   public Product(int price) {
      this.price = price;
   }
}

class Tv extends Product{
   public Tv() { super(100);   }
   public String toString() { return "Tv";}
}
class Computer extends Product{
   public Computer() {super(200);}
   public String toString() { return "Computer";}
   
}
class Audio extends Product{
   public Audio() {super(50);}
   public String toString() { return "Audio";}
}


public class Exam02___2 {

   public static void main(String[] args) {
      Buyer b = new Buyer();
      b.buy(new Tv());
      b.buy(new Computer());
      b.buy(new Audio());
   }

}