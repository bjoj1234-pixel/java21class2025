package arrayListEx01;

import java.util.Scanner;

public class CartMain {

	public static void main(String[] args) {
		//UI부분
		//계산 로직, 저장로직.. 사용절제
		Scanner scan = new Scanner(System.in);
		//인스턴스화 해야하는 클래스는 cart이다.
		Cart cart = new Cart();
		//기본 장바구니 상품 목록 추가
		//위의 pro 참조변수안에 => 아래의 cart 상품들이 담겨있다.
		//--------------
		// | name: 사과
		// | price: 1000
		//--------------
		cart.addProduct(new Product("사과",1000));
		cart.addProduct(new Product("바나나",2000));
		cart.addProduct(new Product("망고",5000));
		cart.addProduct(new Product("포고",8000));
		cart.addProduct(new Product("수박",10000));
		
		
		//장바구니 목록 출력
		System.out.println("[장바구니 목록]");
		cart.showList();
		//총금액 출력
		System.out.println("총 금액 : "+cart.total());
		
		System.out.println("삭제할 상품을 입력하세요:");
		int del = scan.nextInt();
		//삭제
		cart.removeProduct(del);
		System.out.println("[삭제한 후 장바구니 목록]");
		cart.showList();
		System.out.println("--------------------");
		
		System.out.println("추가할 상품을 입력하세요:");
		String add = scan.next();
		System.out.println("추가할 상품의 가격을 입력하세요:");
		int addPrice = scan.nextInt();
		//추가
		cart.addProduct(new Product(add, addPrice));
		System.out.println("[추가한 후 장바구니 목록]");
		cart.showList();
		System.out.println("--------------------");
		

	}

}
