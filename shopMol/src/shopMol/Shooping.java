package shopMol;

import java.util.Scanner;

public class Shooping extends UserMenu{
	Scanner scan = new Scanner(System.in);		
	
	boolean run = true;//메뉴 실행
	
	//메뉴
	public void menu() {
		
		while(run) {
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[0]종료");
			System.out.println("메뉴선택: ");
		
			//메뉴 출력
			int menuSel = scan.nextInt();
			
			if(menuSel==1) {//로그인 선택시
				System.out.println("ID입력: ");
				String userId = scan.next();
				System.out.println("PW입력: ");
				String userPw = scan.next();

				//로그인 메소드
				login(userId,userPw);
				
			}else if(menuSel==2) {//로그아웃 선택시
				if(super.log == -1) {
					System.out.println("이미 로그아웃 되있습니다.");
				}else {
					//로그아웃 메소드
					logout();
					System.out.println("로그아웃 되있습니다.");
				}
			}else if(menuSel==3) {//쇼핑메뉴 선택시
				boolean shopmenu = true; 
				
				while(shopmenu) {
					shopMenu();//쇼핑 메뉴출력
					int shopSel = scan.nextInt();
					
					if(shopSel==1) {//카테고리 목록
						ItemManager itemManager = new ItemManager();
						// 카테고리 출력 메서드
						itemManager.printCategory();
						
						System.out.println("쇼핑목록 선택: [뒤로가기 -1]");
						int shopList = scan.nextInt();
						
						if(shopList == -1) {//뒤로가기 눌렀을때
							continue;
						}else if(shopList >= 0 && shopList < itemManager.category.size()){//쇼핑목록 선택했을때
							//아이템 출력 메서드
							itemManager.printItemList(shopList);
						}else {
							System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
						}		
						
					}else if(shopSel==2) {//장바구니 목록
						
					}else if(shopSel==0) {//뒤로가기
						continue;
					}else {
						System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
					}								
				}							
			}else if(menuSel==0) {//종료 선택시
				System.out.println("종료됩니다");
				run = false;
				
			}else {//메뉴에 없는번호 입력시
				System.out.println("메뉴를 다시 입력해주세요");
			}
		
		}
	};
	
	//쇼핑메뉴
	public void shopMenu() {
		System.out.println("[1]쇼핑목록");
		System.out.println("[2]장바구니");
		System.out.println("[0]뒤로가기");
		System.out.println("메뉴선택: ");	
	};
	
	//로그인 메서드
	public void login(String userId, String userPw) {
		//로그인 상태이면
		if(super.log != -1) { 
			System.out.println("이미 로그인 되어있습니다.");
		}
		//아이디 비번 일치 체크
		for(int i=0;i<super.id.length;i++) {
			if(userId == super.id[i] && userPw == super.pw[i]) {
				super.log++;
				System.out.println("["+userId+"]님, 환영합니다.");
				break;				
			}
		}
		//일치하지 않으면(log가 증가하지 X)
		if(super.log == -1){
			System.out.println("아이디 혹은 비밀번호가 맞지 않습니다.");
		}		
	};
	
	//로그아웃 메서드
	public void logout() {
		super.log = -1;
	};
}
