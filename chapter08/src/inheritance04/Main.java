package inheritance04;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//VIP v = new VIP("kkd","김길동",1010);
		//Customer vip = new VIP("kys","김유신",1234);
		//상속을 받은 하위클래스는 상위클래스를 데이터타입으로 인스턴스화 할수있다.
		
		ArrayList<Customer> cst = new ArrayList<Customer>();
		
		//add를 함으로서 업캐스팅됨(모든 데이터타입이 arrayList의 "Customer"형태로 저장됨)
		cst.add(new Customer("lss","이순신"));
		cst.add(new Customer("ssid","신사임당"));
		cst.add(new GoldCustomer("hgd","홍길동"));
		cst.add(new GoldCustomer("lyg","이율곡"));
		cst.add(new VIP("kys","김유신",1234));
		
		
		System.out.println("======= 고객정보출력 =======");
		//고객정보출력
		for(Customer c : cst) {
			System.out.println(c.showCustomerInfo());
		}
		
		System.out.println();
		
		System.out.println("======= 보너스 포인트와 할인율 결과 =======");
		//보너스 포인트와 할인율 출력
		for(Customer c : cst) {
			//지불할 원가 입력후
			c.calcPrice(10000);
			//보너스와 할인율 결과 출력
			System.out.printf(c.showBonusSale());
		}
			
	}
	

}
