package inheritance04;

public class VIP extends Customer{
	protected int charge;//담당 전문상담 번호	
	
	public VIP() {};
	
	public VIP(String id,String name,int charg) {
//		super.customerID = id;
//		super.customerName = name;
		super(id,name); //이게 위 두줄과 동일함. 알아서 인식된다함. 
		
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		super.sale = 0.1;
		this.charge = charg;
	};
	
	//고객정보 출력
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 전문 상담은 "+charge+"번입니다.";
	}
	//보너스와 할인율 출력
	@Override
	public String showBonusSale() {
		return super.showBonusSale() + "담당 전문 상담은 "+charge+"번입니다.";
	}
}
