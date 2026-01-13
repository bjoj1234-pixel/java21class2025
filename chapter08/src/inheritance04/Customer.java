package inheritance04;

public class Customer {
	protected String customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	double sale;
	int salePrice;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		sale=0.0;
	};
	
	public Customer(String id,String name) {
		this.customerID = id;
		this.customerName = name;
		//매개변수가 없으면 this 안써도 됨(멤버변수에 있기때문)
		customerGrade = "SILVER"; //자식클래스의 오버로딩떄문에 한번더 넣어줌
		bonusRatio = 0.01;
		sale=0.0;
	};
	
	
	//지불금액 계산반환
	public int calcPrice(int price) {
		salePrice = (int) (price-(price*sale)); //할인
		bonusPoint += price*bonusRatio; //1%적립
		return salePrice; //원가 그대로 반환
	}
	//고객정보 출력
	public String showCustomerInfo() {
		return "지불금액은 "+salePrice+"원이고,"+customerName+"님의 등급은 "+customerGrade+"이며, 보너스포인트는 "+bonusPoint+"입니다.";
	}
	

}
