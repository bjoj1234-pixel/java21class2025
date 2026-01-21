package diExample07;

public class DiscountCalculator{
	public void print(int price,Discount dis) {
		String msg = dis.applyDiscount(price);
		System.out.println(msg);
	}	
}
