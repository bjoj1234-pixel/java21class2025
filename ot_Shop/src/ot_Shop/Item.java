package ot_Shop;
//DTO클래스 : 매개변수(데이터) 및 해당 매개변수 출력 메소드만 기입
public class Item {
	//멤버 변수
	String name;//카테고리 item 이름
	int price;//item 가격
	String category;//카테고리 : 육류, 과저, 어류, 음료수
	
	//디폴트 생성자
	public Item() {};
	
	//매개변수 생성자
	public Item(String name, int price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	};
	
	//출력 메소드
//	@Override
//	public String toString() {
//		return "["+ //이런형태로 쓸수있음.
//	}
	
	public void printInfo() {
		System.out.println("["+name+"]"+"["+price+"]"+"["+category+"]");//this.name, this.price.. (this)를 써도됨.
	}
}
