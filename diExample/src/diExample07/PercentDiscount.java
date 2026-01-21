package diExample07;

public class PercentDiscount implements Discount{
	
	final double tenper = 0.1;

	public PercentDiscount() {}

	@Override
	public String applyDiscount(int price) {
		int result = (int) (price-(price * tenper)); //10%할인
		
		String msg = "원가: "+ price +"원, 할인가: "+ result +"원";
		
		return msg;
	}
}
