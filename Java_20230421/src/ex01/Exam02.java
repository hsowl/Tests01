package ex01;

import java.util.Arrays;

public class Exam02 {
   
   public static void main(String[] args) {
      Buyer b = new Buyer();
      b.buy(new Tv());
      b.buy(new Computer());
      b.buy(new Tv());
      b.buy(new Audio());
      b.buy(new Computer());
      b.buy(new Computer());
      b.buy(new Computer());
      
      b.summary();
   }
}
class Buyer {
   int money = 1000;
   Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
   int i = 0; //Product배열 cart에 사욜될 index
   
   void buy(Product P) {
      if(money >= P.price) {
    	  money -= P.price;
    	  add(P);
      }else
    	  System.out.println("잔액이 부족하여 살 수 없습니다.");
   }
   
   void add(Product P) {
	   if( i>= cart.length) {                          // i 값이 장바구니의 크기보다 같거나 크면
           Product[] tmp= new Product[cart.length*2];      // 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다
           System.arraycopy(cart,0,tmp,0,cart.length );  //  기존의 장바구니의 내용을 새로운 배열에 복사 
           cart = tmp;                                    // 새로운 장바구니와 기존의 장바구니를 바꾼다
                                        // 물건을 장바구니에 저장한다 그리고 i값을 i 증가시킨다
           } else {
              
           i++;
           }
   
   
   }
   
   void summary() {
	   System.out.println("장바구니에 담긴 물건 : "+Arrays.toString(cart));
	   System.out.println("장바구니에 담긴 물건들의 가격 총합 : ");
	   System.out.println("물건을 사고 남은 금액 : "+money);
   }
}

class Product {
   int price;
   
   Product(int price){
      this.price = price;
   }
}

class Tv extends Product {
   Tv() { super(100); }
   
   public String toString() { return "Tv";}
}

class Computer extends Product {
   Computer() { super (200); }
   
   public String toString() { return "computer";}
}

class Audio extends Product {
   Audio () { super (50); }
   
   public String toString () { return "Audio"; }
}

