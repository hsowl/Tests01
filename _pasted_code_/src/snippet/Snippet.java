package snippet;

public class Snippet {
	public static void main(String[] args) {
		 if( i>= cart.length) {                          // i 값이 장바구니의 크기보다 같거나 크면
		             Product[] tmp= new Product[cart.length*2];      // 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다
		             System.arraycopy(cart,0,tmp,0,cart.length );  //  기존의 장바구니의 내용을 새로운 배열에 복사 
		             cart = tmp;                                    // 새로운 장바구니와 기존의 장바구니를 바꾼다
		                                          // 물건을 장바구니에 저장한다 그리고 i값을 i 증가시킨다
		             } else {
		                
		             i++;
		
	}
}

