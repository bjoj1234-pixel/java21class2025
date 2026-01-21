package diExample07;

public class FixedDiscount implements Discount{

	final int fixPrice = 5000;//고정할인가
	
	public FixedDiscount() {}

	@Override
	public String applyDiscount(int price) {
		int result = price-fixPrice; //5000원 뺀 할인가
		
		String msg = "원가: "+ price +"원, 할인가: "+ result +"원";
		
		return msg;
	}
}
