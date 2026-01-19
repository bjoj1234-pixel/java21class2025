package ot_Shop;
//DTO클래스 : 매개변수(데이터) 및 해당 매개변수 출력 메소드만 기입
public class Cart {
	//멤버변수
	String userId; //구매한 유저 id
	String itemName; //구매한 아이템 이름
	int price; //구매한 아이템 가격
	int Quantity; //구매한 아이템 수량
	
	//디폴트 생성자
	public Cart() {};
	//매개변수 생성자
	public Cart(String itemName,int price) {
		this.itemName = itemName;
		this.price = price;
	};
	
	//cart 출력메소드
	public void printCart() {
		System.out.println("["+ userId+"]"+"항목 :"+itemName+", 금액 :"+price+", 수량 :"+Quantity+"개");
	}
	
	
}
