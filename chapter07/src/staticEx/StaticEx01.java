package staticEx;

public class StaticEx01 {
	static int atm = 0;
	
	String name;
	int account;
	
	public StaticEx01() {}
	//오버로딩이란 staticEx01의 기본 생성자를 재정의하여 사용하는 것을 말한다.
	//따라서, 아래와 같이 매개변수가 존재하는 생성자의 매개변수를 입력해야 한다.
	public StaticEx01(String name) {
		this.name = name;		
	};
	
	//입금
	public void moneyIn(int money) {
		atm += money;
		System.out.println("atm : "+atm);
	};
	
	//출금
	public void moneyOut(int money) {
		atm -= money;
		System.out.println("atm : "+atm);
	};
	
	//출력
	public void getBankInfo() {
		System.out.println("name : "+this.name);
		System.out.println("atm : "+atm);
	}
	
	
}
