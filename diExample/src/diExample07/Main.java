package diExample07;

public class Main {

	public static void main(String[] args) {
		DiscountCalculator discount = new DiscountCalculator();
		
		discount.print(30000,new PercentDiscount());
		discount.print(80000,new FixedDiscount());
		discount.print(10000,new NoDiscount());
	}

}
