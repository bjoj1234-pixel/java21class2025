package diExample03;

public class KakaoPayPayment implements Payment{
	@Override
	public String payment(String payment) {
		String msg = payment+"로 20000원 결제 완료";
		return msg;
	};

}
