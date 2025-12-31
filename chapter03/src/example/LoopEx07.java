package example;

import java.util.Scanner;

public class LoopEx07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		boolean program = true; //프로그램 실행 종료 여부
		boolean login = false; // 로그인 여부
		
		while(program == true) {
			System.out.println("1. 로그인");
			System.out.println("2. 로그아웃");
			System.out.println("0. 종료");
			System.out.println("메뉴 선택 : ");		
			
			int menu = scan.nextInt();

			if(menu==1 && login == false) {
				System.out.println("계좌번호 입력 : ");
				int acc = scan.nextInt();
				System.out.println("비밀번호 입력 : ");
				int pw = scan.nextInt();
				
				if(acc == dbAcc1 && pw == dbPw1) {
					System.out.printf("%d님, 환영합니다.%n",acc);
					login = true;
				}else if(acc == dbAcc2 && pw == dbPw2) {
					System.out.printf("%d님, 환영합니다.%n",acc);
					login = true;
				}else {
					System.out.println("아이디와 비밀번호를 다시 확인해주세요.");
					login = false;
				}
			}else if(menu==1 && login == true) {
				System.out.println("이미 로그인이 되어있습니다.");				
			}else if(menu==2 && login == true) {
				System.out.println("로그아웃 되었습니다.");	
				login = false;
			}else if(menu==2 && login == false) {
				System.out.println("이미 로그아웃 되었습니다.");				
			}else if(menu==0) {
				System.out.println("프로그램 종료%n");
				program = false;
			}
		}


	}

}
