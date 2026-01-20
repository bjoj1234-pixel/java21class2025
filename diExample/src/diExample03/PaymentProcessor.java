package diExample03;

public class PaymentProcessor {
	public void print(String payment,Payment pay) {
		String msg = pay.payment(payment);
		System.out.println(msg);
	}
}
