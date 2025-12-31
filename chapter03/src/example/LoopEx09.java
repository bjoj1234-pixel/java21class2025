package example;

import java.util.Scanner;

public class LoopEx09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		boolean program = true;	//프로그램 구동여부
		int userName = 0;//사용자이름
		String status = "로그아웃"; //현재상태
		boolean login = true; //로그인 여부
		
		
		while(program == true) {
			System.out.printf("dbMoney1 = %d원 %ndbMoney2 = %d원 %n",dbMoney1,dbMoney2);
			if(status != "로그아웃") {
				System.out.printf("* 상태 : %s %s %n",userName,status);
			}else{
				System.out.printf("* 상태 : %s %n",status);
			}
			
			System.out.printf("1.로그인%n2.로그아웃%n3.입금%n4.출금%n5.이체%n6.조회%n0.종료%n");
			System.out.println("메뉴 선택 : ");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				if(status == "로그아웃") {
					System.out.println("계좌 번호 입력 : ");
					int acc = scan.nextInt();
					System.out.println("비밀 번호 입력 : ");
					int pw = scan.nextInt();
					if(acc == dbAcc1 && pw == dbPw1) {
						userName = dbAcc1;
						status = "로그인";
						System.out.printf("%s님, 환영합니다.%n",dbAcc1);
					}else if(acc == dbAcc2 && pw == dbPw2) {
						userName = dbAcc2;
						status = "로그인";
						System.out.printf("%s님, 환영합니다.%n",dbAcc2);
					}else {
						System.out.println("아이디, 비밀번호를 다시 확인해주세요.");
					}		
				}else {
					System.out.println("이미 로그인 중...");
				}	
			}else if(menu == 2) {
				if(status == "로그인") {
					status = "로그아웃";
					System.out.println("로그아웃 되었습니다.");
				}else {
					System.out.println("이미 로그아웃 되어있습니다...");
				}
			}else if(menu == 3) {
				if(status == "로그인") {
					System.out.println("임금할 금액 입력 : ");
					int in = scan.nextInt();
					if(in > 0) {					
						System.out.println("임금을 완료하였습니다.");
						if(userName==1111) {
							dbMoney1 += in;
						}
						if(userName==2222) {
							dbMoney2 += in;
						}
					}else {
						System.out.println("임금할 금액을 잘못 입력했습니다.");
					}
				}else {
					System.out.println("로그인 후 이용가능");
				}				
			}else if(menu == 4) {
				if(status == "로그인") {
					System.out.println("출금할 금액 입력 : ");
					int out = scan.nextInt();
					if(out>0) {					
						System.out.println("출금을 완료하였습니다.");
						if(userName==1111) {
							dbMoney1 -= out;
						}
						if(userName==2222) {
							dbMoney2 -= out;
						}
					}else {
						System.out.println("출금할 금액을 잘못 입력했습니다.");
					}
				}else {
					System.out.println("로그인 후 이용가능");
				}	
			}else if(menu == 5) {
				if(status == "로그인") {
					System.out.println("이체할 계좌번호 입력 : ");
					int moveAcc = scan.nextInt();
					
					if(moveAcc == dbAcc1 || moveAcc == dbAcc2 ) {
						System.out.println("이체할 금액 입력 : ");
						int movePrice = scan.nextInt();
						
						if(movePrice>0) {					
							if(moveAcc==1111) {
								dbMoney1 += movePrice;
								dbMoney2 -= movePrice;
							}
							if(moveAcc==2222) {
								dbMoney2 += movePrice;
								dbMoney1 -= movePrice;
							}
							System.out.println("이체를 완료하였습니다.");
						}else {
							System.out.println("이체할 금액을 잘못 입력했습니다.");
						}
					}else {
						System.out.println("이체할 계좌를 잘못 입력했습니다.");
					}				
				}else {
					System.out.println("로그인 후 이용가능");
				}	
			}else if(menu == 6) {
				if(status == "로그인") {
					if(userName==1111) {
						System.out.printf("%d님 잔액: %d%n",userName,dbMoney1);
					}
					if(userName==2222) {
						System.out.printf("%d님 잔액: %d%n",userName,dbMoney2);
					}
				}else {
					System.out.println("로그인 후 이용가능");
				}	
			}else{
				System.out.println("프로그램 종료");
				scan.close();
				program = false;
			}			
								
		}

	}

}
