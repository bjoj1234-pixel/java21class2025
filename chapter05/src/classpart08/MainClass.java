package classpart08;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//스캔
		ClassEx07 ex7 =  new ClassEx07();//객체화
		boolean run = true; //프로그램 실행
		
		while(run) {
			ex7.print(); //계좌,비번,잔액출력
			
			ex7.bankName = "Mega Bank";
			System.out.println("["+ex7.bankName+"]");//은행이름출력
			
			//로그인,아웃에 따라 출력
			if(ex7.loginCheck == -1) {
				System.out.println("상태 : 로그아웃");
			}else {
				System.out.println("상태 :"+ex7.loginAcc+"로그인 중");
			}
			//메뉴출력
			ex7.menu();
			
			System.out.println("선택 : ");
			int sel = scan.nextInt();//선택입력
			
			if(sel==1) {//회원가입
				System.out.println("계좌 : ");
				String acc = scan.next();
				System.out.println("비번 : ");
				String accPw = scan.next();
				System.out.println("금액 : ");
				int accMoney = scan.nextInt();
				
				//회원가입
				ex7.join(acc,accPw,accMoney);
				
				System.out.println("가입 성공");	
				
			}else if(sel==2) {//로그인
				if(ex7.loginCheck == -1) {
					
					System.out.println("계좌 : ");
					String acc2 = scan.next();
					System.out.println("비번 : ");
					String accPw2 = scan.next();
					
					//로그인
					ex7.login(acc2,accPw2);
					continue;
				}else {
					System.out.println("이미 로그인 되어있습니다.");
					continue;
				}				
			}else if(sel==3) {//로그아웃
				if(ex7.loginCheck == 0) {
					ex7.loginCheck = -1;
					ex7.loginAcc = null;
					System.out.println("로그아웃 되었습니다.");
				}else {
					System.out.println("이미 로그아웃 되어있습니다.");
					continue;
				}
			}else if(sel==4) { //입금
				if(ex7.loginCheck == 0) {
					System.out.println("입금액 : ");
					int money = scan.nextInt();
					ex7.deposit(money);//입금
					System.out.println("입금완료");
				}else {
					System.out.println("로그인 후 이용가능합니다.");
				}
			}else if(sel==5) { //이체
				if(ex7.loginCheck == 0) {
					System.out.println("상대계좌 : ");
					String oppoAcc = scan.next();
					System.out.println("금액 : ");
					int money2 = scan.nextInt();
					ex7.transfer(oppoAcc,money2);					
					System.out.println("이체 성공");
				}else {
					System.out.println("로그인 후 이용가능합니다.");
				}
			}else if(sel==6) {
				if(ex7.loginCheck == 0) {
					System.out.println("잔액 : "+ex7.arMoney[ex7.loginIndex]);					
				}else {
					System.out.println("로그인 후 이용가능합니다.");
				}
			}else if(sel==0) {//프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				run=false;
			}else{
				System.out.println("메뉴를 다시 선택해주세요.");
				continue;
			}
		}


	}

}
