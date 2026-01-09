package arrayListEx01;

public class Product {
	String name;
	int price;
	
	public Product() {};
	
	public Product(String name,int price) {
		this.name = name;
		this.price = price;
	};
	
	//장바구니 목록 출력
	public void list() {
		System.out.printf("%s : %d원%n",name,price);
	}
	
}
