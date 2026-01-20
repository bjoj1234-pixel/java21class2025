package diExample03;

public class Main {

	public static void main(String[] args) {
		PaymentProcessor pay = new PaymentProcessor();
		pay.print("신용카드", new CreditCardPayment());
		pay.print("카카오페이", new KakaoPayPayment());
		pay.print("네이버페이", new NaverPayPayment());
		

	}

}
