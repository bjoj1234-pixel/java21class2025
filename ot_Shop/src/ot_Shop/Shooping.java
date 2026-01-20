package ot_Shop;

import java.util.Scanner;

public class Shooping extends UserMenu {
	Scanner scan = new Scanner(System.in);
	//쇼핑메뉴 메소드
	//인스턴스화
	ItemManager it = new ItemManager();
	
	String menu = "[1]로그인\n[2]로그아웃\n[3]쇼핑\n[0]종료\n";
	String managerMenu = "[1]로그아웃\n[2][아이템관리]\n[3][장바구니리스트]\n"; 
	String itemMenu = "[1][item 추가]\n[2][item 삭제]\n[3][item 수정]\n[0]종료\n";
	
	//메뉴 ---------
	public void menu() {
		while(true) {
			System.out.println();
			System.out.print(menu);
			System.out.print("메뉴선택 :");
			int select = scan.nextInt();
			
			if(select == 1) {
				//로그인 메소드
				login();
				
				if(log == 0) {
					managerMenu();
				}
			}else if(select == 2) {
				//로그아웃 메소드
				logout();
			}else if(select == 3) {
				//쇼핑은 반드시 로그인 상태이어야 함
				if(log < 0) {
					//log = -1이면 로그아웃
					System.out.println("로그인 후 이용가능");					
				}else {
					//로그인 상태 : log > 0
					shopMenu();
				}
			}else {
				System.out.println("쇼핑몰 종료");
				break;
			}
		}		
	}
	
	//----------------------------------
	
	// shopMenu() 메소드
	public void shopMenu() {
		while(true) {
			System.out.println();
			System.out.println("[1]쇼핑목록\n[2]장바구니\n[0]뒤로가기\n");
			int select = scan.nextInt();
			
			if(select == 0) {
				break; //뒤로가기
			}else if(select == 1) {//쇼핑목록
				it.printCategory();
				System.out.println("쇼핑목록 선택 [뒤로가기 -1]");
				
				int caId = scan.nextInt();
				
				int n=0;
				
				for(int i=0; i<it.itemList.size();i++) {
					//카테고리 인덱스에 해당하는 상품이 존재하는지 비교
					
					//카테고리 인덱스 번호가 존재하지 않았을때 예외처리
					if(it.category.get(caId).equals(it.itemList.get(i).category)) {
						System.out.print("["+i+"]");
						it.itemList.get(i).printInfo();
					}
				}
				System.out.println("항목을 선택:");
				
				int itemId = scan.nextInt();
				//항목추가 => 장바구니 카드에 내가 산 항목추가
				it.addCart(super.id[log], caId, itemId);
			}else if(select == 2) {//장바구니
				System.out.println("========= 장바구니 =========");
				for(int i=0; i<it.jangList.size(); i++) {
					//로그인 한 id가 장바구니 id하고 같은지 에외처리
					//현재 jangList에 물건을 산 고객의 id별로 담겨있다.
					//[kkk] ~~~
					//[ddd] ~~~
					//[ccc] ~~~
					if(it.jangList.get(i).userId.equals(id[log])) {
						it.jangList.get(i).printCart();
					}
				}
				System.out.println("=====================");
			}
			
		}
	}
	
	//----------------------------------
	//관리자 메뉴 메소드
	public void managerMenu() {
		while(true) {
			System.out.println();
			System.out.print(managerMenu);
			System.out.println("메뉴 선택 : ");
			
			int select = scan.nextInt();
			
			if(select == 1) {//로그아웃
				logout();
				break;
			}else if(select == 2) {//아이템관리
				itemManage();
			}else{//장바구니리스트
				System.out.println("========= 장바구니 리스트 =========");
				it.printJang();
				System.out.println("==========================");
			}
			
		}
	}
	
	//아이템 관리 메뉴
	public void itemManage() {
		while(true) {
			System.out.println();
			System.out.println(itemMenu);
			System.out.println("메뉴 선택 : ");
			int select = scan.nextInt();
			
			if(select == 1) {//item추가
				System.out.println("추가할 item 이름 입력");
				String addname = scan.next();
				
				System.out.println("추가할 item 금액 입력");
				int addprice = scan.nextInt();
				
				System.out.println("추가할 item의 category 번호를 입력");
				int addcategory = scan.nextInt();
				
				//상품추가
				it.addItem02(addname, addprice, addcategory);	
				//상품목록 출력
				it.printItemList();		
				
			}else if(select == 2) {//item삭제
				System.out.println("삭제할 item 번호를 입력");
				int deleteindex = scan.nextInt();

				//삭제메소드
				it.delItem(deleteindex);
				//상품목록 출력
				it.printItemList();		
				
			}else if(select == 3) {//item수정
				System.out.println("수정할 item 번호를 입력");
				int indexNum = scan.nextInt();
				System.out.println("수정할 item의 이름을 입력");
				String updateName = scan.next();
				System.out.println("수정할 item의 가격을 입력");
				int updatePrice = scan.nextInt();
				
				//수정메소드
				it.updateItem(indexNum, updateName, updatePrice);
				//상품목록 출력
				it.printItemList();		
			}else{// 종료
				System.out.println("item 관리 종료");
				break;
			} 
		}
	}

	//-------------------------------
	//로그인 메소드
	public void login() {
		if(log > -1) {
			System.out.println("이미 로그인 중입니다.");
		}else {
			log = super.userLog();
		}
	}
	
	//로그아웃 메소드
	public void logout() {
		if(log < 0) {	
			System.out.println("이미 로그아웃 상태입니다.");
		}else {
			log = -1;
			System.out.println("안녕히 계세요.");
		}
	}
	
}












