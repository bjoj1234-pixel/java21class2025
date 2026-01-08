package classpart07;


public class ClassEx07 {
	//멤버변수, 생성자, 기능 메서드 작성, while문은 메인클래스에서 작성
	int[] arPrice = {2500, 3800, 1500, 1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜 라"};
	int[] arCount = new int[4]; //각 메뉴별 개수
	int total = 0;
	
	public ClassEx07() {}
	public void addMenu(int index) {//갯수증가
		arCount[index]++;		
	}
	public void total() {//총 금액
		total=0;
		for(int i=0; i<arCount.length; i++) {
			total += arCount[i]*arPrice[i];
		}
		System.out.printf("총 금액은 %d원 입니다. 돈을 입력하세요 : %n",total);
		System.out.println();	
	}
	
	public void Calc(int money) {//돈 계산
		System.out.println("	맘스터치	  ");
		System.out.println("---------------");
		System.out.println("ITEM	QTY		AMT");
		for(int i=0; i<arCount.length; i++) {
			System.out.printf("%s	 %d	   %d%n",arMenu[i],arCount[i],arPrice[i]);
		}
		System.out.println("---------------");
		System.out.printf("합계금액 		%d%n",total);
		System.out.printf("받은금액 		%d%n",money);
		System.out.println("---------------");
		if(money>=total) {
			System.out.printf("잔   돈 		%d%n",money-total);
		}else {
			System.out.printf("금액이	%d원 모자랍니다.%n",-(money-total));
		}
		System.out.println();
	}
	
	public void menuSel() {//메뉴출력
		System.out.println("[맘스터치 햄버거]");
		for(int i=0; i<arPrice.length;i++) {
			System.out.printf("%d. %s	%d원%n",i+1,arMenu[i],arPrice[i]);
		}
		System.out.printf("%d. 주문하기%n",arPrice.length+1);
		System.out.println("---------------");
	}
}
