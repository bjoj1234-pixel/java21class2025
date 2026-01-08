package classpart07;


public class ot_ClassEx07 {
	//멤버변수, 생성자, 기능 메서드 작성, while문은 메인클래스에서 작성
	// 멤버변수 이면서 전역 변수이다.
	int[] arPrice = {2500, 3800, 1500, 1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜 라"};
	int[] arCount = new int[4]; //각 메뉴별 개수
	int total = 0;
	String name;//가게이름
	
	//객체 생성시 초기화에 필요한 디폴트 생성자
	//생성자 반드시 클래스이름과 동일해야함
	
	public ot_ClassEx07() {}
	
	//메뉴출력함수
	//void는 반환할 값이 없는 메소드 생성시 사용 
	public void printMenu() {
		System.out.println("\n["+name+"]");
		for(int i=0; i<arMenu.length;i++) {
			System.out.println((i+1)+":"+arMenu[i]+"("+arPrice[i]+"원)");
		}
		System.out.println((arMenu.length+1)+":주문하기");
		System.out.println();
	}
	//주문 추가 함수
	public void order(int sel) {
		arCount[sel]++;
		System.out.println(arMenu[sel]+"추가됨");	
	}
	//총 금액 계산 함수
	public void calcTotal() {
		total=0;
		for(int i=0; i<arMenu.length; i++) {
			total += arCount[i]*arPrice[i];
		}
	}
	
	//주문여부를 확인하는 함수
	//return(반환값)이 있을때는 void대신 데이터 타입기재 
	public boolean hasOrder() {
		for(int i=0; i<arMenu.length; i++) {
			if(arCount[i]>0) {
				return true; //주문됨
				//for문안에 return은 완전히 종료시키는게 아니고, 메소드안에 return이 존재해야함.
			}
		}
		return false;//주문안됨
	}
	
	//영수증 출력하는 함수
	public void printReceipt(int money) {
		System.out.println("====== 영수증 ======");
		System.out.println("매장명 : "+name);
		System.out.println("-------------------");
		System.out.println("메뉴\t수량\t금액");
		
		for(int i=0; i<arMenu.length; i++) {
			if(arCount[i]>0) {
				System.out.println(arMenu[i]+"\t"+arCount[i]+"\t"+(arCount[i]*arPrice[i]));
			}
		}
		System.out.println("------------------");
		System.out.println("총 금액 : "+total);
		System.out.println("받은 돈 : "+money);
		System.out.println("잔  돈 : "+(money-total));
		System.out.println("------------------");
	}
	
	
}
