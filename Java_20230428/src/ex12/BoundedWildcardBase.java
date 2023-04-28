package ex12;

class Box<T>{
   private T ob;
   public T getOb() {
      return ob;
   }
   public void setOb(T ob) {
      this.ob = ob;
   }
}

class Toy {
   public String toString() {
      return "I am a Toy()";
   }
}

class BoxHandler {
   public static void outBox(Box<? extends Toy> box) {
      Toy toy = box.getOb();     //꺼내는 역할
      box.setOb(toy); // 넣는역할을 할 수 없다 ---> extends Toy를 넣음으로써
      System.out.println(toy);
   }
   public static void inBox(Box<? super Toy> box, Toy n) {   
      box.setOb(n);   // 넣는 역할
      Toy a = box.getOb();
   
   }
}

public class BoundedWildcardBase {

   public static void main(String[] args) {
      
      Box<Toy> box = new Box<>();
      BoxHandler.inBox(box, new Toy());
      BoxHandler.outBox(box);
      
   }
}