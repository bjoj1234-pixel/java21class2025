package diExample03;

public class NaverPayPayment implements Payment{
	@Override
	public String payment(String payment) {
		String msg = payment+"로 5000원 결제 완료";
		return msg;
	};
}
