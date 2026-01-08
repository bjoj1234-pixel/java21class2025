package classpart07;

import java.util.Scanner;

public class MainClass {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassEx07 ex01 = new ClassEx07();
		boolean run = true;
		
		while(run) {		
			ex01.menuSel();//메뉴목록 보여주기
			
			int sel = scan.nextInt(); //메뉴선택
			
			if(sel>=1 && sel<=4) { //1~4선택
				ex01.addMenu(sel-1);//갯수누적
			}else if(sel==5) {//5번(주문하기)선택
				ex01.total();
				int money = scan.nextInt();
				ex01.Calc(money);//돈계산
			}else {
				System.out.println("다시 선택해주세요.");
				System.out.println();
			}
		}
	}

}
