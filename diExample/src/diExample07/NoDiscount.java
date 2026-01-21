package diExample07;

public class NoDiscount implements Discount {
	
	public NoDiscount() {}

	@Override
	public String applyDiscount(int price) {
		int result = price; //원가 그대로
		
		String msg = "원가: "+ price +"원, 할인가: "+ result +"원";
		
		return msg;
	}
}
