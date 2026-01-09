package arrayListEx01;

import java.util.ArrayList;

public class Cart {
	//현재 작성한 Product 클래스는 데이터 타입이다.
	//cart에서 하고싶은 기능:
	//상품추가, 상품삭제, 상품출력, 상품총계
	
	//ArrayList<>이용해서 장바구니에 담는 역할을 해야한다.
	ArrayList<Product> pro = new ArrayList<Product>();

	public Cart() {};
	//상품추가
	//매개변수로 Product p의미 => 현재 Product 클래스에
	//멤버변수,생성자,메소드에 p로 접근할 수 있다.
	//예)p.itemName, p.itemPrice...
	
	public void addProduct(Product p) {
		pro.add(p);
	}
	//상품삭제
	//ArrayList<>에서 remove(index)는 반드시 index가 필수이다.
	public void removeProduct(int index) {
		pro.remove(index);
	}
	//장바구니 목록출력
	public void showList() {
		for(Product p:pro) {
			p.list();
		}
	}
	
	//총 금액 계산
	public int total() {
		int total = 0;
		for(Product p : pro) {
			total += p.price;
		}
		return total;		
	}
	
	
}
