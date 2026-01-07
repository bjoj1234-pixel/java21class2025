package classpart07;


public class ClassEx07 {
	//멤버변수, 생성자, 기능 메서드 작성, while문은 메인클래스에서 작성
	int[] arPrice = { 2500, 3800, 1500, 1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜 라"};
	int[] arCount = new int[4]; //각 메뉴별 개수
	int total = 0;
	
	public ClassEx07() {}
	public ClassEx07(int index) {//갯수증가
		for(int i=0;i<arMenu.length;i++) {
			if(index == i) {
				arCount[i]++;
			}
		}
		
	}
	
	public void menuSel() {
		System.out.println("[맘스터치 햄버거]");
		for(int i=0; i<arPrice.length;i++) {
			System.out.printf("%d. %s		%d원%n",i+1,arMenu[i],arPrice[i]);
		}
		System.out.printf("%d. 주문하기%n",arPrice.length+1);
		System.out.println("-----------------------");
	}
}
