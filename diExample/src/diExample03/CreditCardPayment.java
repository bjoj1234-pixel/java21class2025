package diExample03;

public class CreditCardPayment implements Payment {
	@Override
	public String payment(String payment) {
		String msg = payment+"로 10000원 결제 완료";
		return msg;
	};


}
