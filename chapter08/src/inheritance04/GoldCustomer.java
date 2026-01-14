package inheritance04;

public class GoldCustomer extends Customer {	
	
	public GoldCustomer() {};
	
	public GoldCustomer(String id,String name) {
		super(id,name);
		super.customerGrade = "Gold";
		super.bonusRatio = 0.02;
		super.sale = 0.1;
	};
	

}
