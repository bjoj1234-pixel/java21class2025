package inheritance04;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer("lsk","이성계");
		//VIP v = new VIP("kkd","김길동",1010);
		Customer v = new VIP("kkd","김길동",1010);
		//상속을 받은 하위클래스는 상위클래스를 데이터타입으로 인스턴스화 할수있다.
		
		
		c.calcPrice(10000);
		v.calcPrice(10000);
		
		System.out.println(c.showCustomerInfo());
		System.out.println(v.showCustomerInfo());
		
	}

}
