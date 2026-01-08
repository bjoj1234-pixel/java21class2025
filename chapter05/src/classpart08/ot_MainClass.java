package classpart08;

import java.util.Scanner;

public class ot_MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//스캔
		ot_ClassEx08 ex8 =  new ot_ClassEx08();//객체화
		boolean run = true; //프로그램 실행
		ex8.name = "Mega Bank";
		
		while(run) {
			System.out.println("----------------------");
			System.out.println("계좌번호\t비밀번호\t계좌잔액");
			System.out.println("----------------------");
			for(int i=0;i<ex8.count;i++) {
				System.out.println(ex8.arAcc[i]+"\t"+ex8.arPw[i]+"\t"+ex8.arMoney[i]);
			}
			System.out.println("----------------------");
			System.out.println("\n["+ex8.name+"]");
			//상태함수 호출함
			ex8.printStatus();//
						
			System.out.println("[1]회원가입");
			System.out.println("[2]로그인");
			System.out.println("[3]로그아웃");
			System.out.println("[4]입금");
			System.out.println("[5]이체");
			System.out.println("[6]잔액조회");
			System.out.println("[0]종료");

			
			System.out.println("선택 : ");
			int sel = scan.nextInt();//선택입력
			
			if(sel==1) {//회원가입
				System.out.println("계좌 : ");
				String acc = scan.next();
				System.out.println("비번 : ");
				String pw = scan.next();
				System.out.println("금액 : ");
				int money = scan.nextInt();
				
				//회원가입
				System.out.println(ex8.join(acc,pw,money) ? "가입성공" : "중복계좌");
								
			}else if(sel==2) {//로그인
				System.out.println("계좌 : ");
				String acc = scan.next();
				System.out.println("비번 : ");
				String pw = scan.next();
				//로그인 함수
				System.out.println(ex8.login(acc,pw) ? "로그인 성공" : "로그인 실패");
			}else if(sel==3) {//로그아웃
				ex8.logout();
				System.out.println("로그아웃");
			}else if(sel==4) { //입금
				//입금 함수 호출
				if(ex8.isLogin()) continue;
				System.out.println("입금액 : ");
				int money = scan.nextInt();
				ex8.deposit(money);//입금
				System.out.println("입금완료");
				
			}else if(sel==5) { //이체
				if(ex8.isLogin()) continue;
				System.out.println("상대계좌 : ");
				String acc = scan.next();
				System.out.println("금액 : ");
				int money = scan.nextInt();
				
				System.out.println(ex8.transfer(acc,money)?"이체 성공":"이체 실패");
				
			}else if(sel==6) {
				//잔액조회 함수 호출
				//로그인 상태에서만 잔액조회 가능
				if(ex8.isLogin()) continue;
				System.out.println("잔액 : "+ex8.getBalance());					
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
