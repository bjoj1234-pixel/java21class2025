package interfaceTest02;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cust = new Customer();
		Buy buy = cust;
		Sell sell = cust; //업캐스팅
		
		buy.buy();
		sell.sell();
		
		cust.order();
		buy.order();
		sell.order();

	}

}
