package multiExample;

import java.util.Scanner;

public class ot_shoppingmall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111", "2222", "3333"};
		String[] items = {"사과", "바나나", "딸기"};
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		// 회원별, 상품별 개수를 담는 변수
		// int[] = new int[3] => 초기값은 모두 0
		int[][] cartCount = new int[ids.length][items.length];
		int log = -1; //로그인 체크
		int count = 0; //상품 담는 갯수
		
		boolean run = true;
		while(run) {
			System.out.println("----------");
			System.out.print("상태 : ");
			if(log==-1) {
				System.out.println("로그아웃");
			}else {
				System.out.println(ids[log]);
			}
			System.out.println("----------");
			System.out.println("[GREEN MART]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종료");
			System.out.println("메뉴 선택 : ");
			//System.out.println(idx);
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("ID입력:");
				String myId = scan.next();
				System.out.println("PW입력:");
				String myPw = scan.next();
				//로그인 성공 boolean
				boolean loginSuccess = false;
				
				for(int i=0; i<ids.length; i++) {
					if(ids[i].equals(myId) && pws[i].equals(myPw)
							&& ids[i].isEmpty() == true && pws[i].isEmpty() == true) {//아이디,비번이 비어있을때 예외처리 추가
						log = i;
						loginSuccess = true;
						break;
					}
				}
				if(loginSuccess) {
					System.out.println(ids[log]+"님 환영합니다.");
				}else {
					System.out.println("아이디와 비밀번호를 확인해주세요.");
				}
				
			}else if(sel == 2) {//로그아웃
				log = -1;
				System.out.println("로그아웃 되었습니다.");
			}else if(sel == 3) { //쇼핑
				//쇼핑몰 출력 => 반드시 로그인 후 장바구니 확인
				if(log == -1) {
					System.out.println("로그인 후 이용가능");
					continue;
				}
				//쇼핑몰 반복 [1]사과 [2]바나나 [3]딸기 [4]뒤로가기 =>반복출력
				//while()문 이용한다.
				while(run) {
					System.out.println("[상품목록]");
					for(int i=0; i<items.length; i++) {
						System.out.printf("[%d]%s%n",(i+1),items[i]);
					}
					System.out.println("[4]뒤로가기");
					System.out.println("상품번호를 선택하세요:");
					int itemNum = scan.nextInt();
					if(itemNum == 4) {
						//뒤로가기
						break;
					}					
					//max_size 100이 넘어가면 예외처리하기
					if(count == MAX_SIZE) {
						System.out.println("장바구니가 찼습니다.");
						break;
					}
					//ids별 쇼핑한 items별들의 개수를 cartCount에 담는다.
					//장바구니 0번째열에 log인한 index번호를 담는다.
					jang[count][0] = log;
					//장바구니 1번째열에 내가 산 item index 번호를 담는다.
					jang[count][1] = itemNum-1; 
					//id별 쇼핑한 item들의 개수를 item별로 cartCount 담는다.
					cartCount[log][itemNum-1]++;
					count++;
				}			
			}else if(sel == 4) {//장바구니
				//내 잘바구니는 로그인 상태에서만 출력 가능
				if(log == -1) {
					System.out.println("로그인 후 이용가능");
				}else {
					System.out.println("-- 내 장바구니 목록 --");
					for(int i=0; i<items.length; i++) {
						if(cartCount[log][i]!=0) {
							System.out.println(items[i]+": "+cartCount[log][i]+"개");
						}
					}
					
				}
				
			}else {
				//프로그램 종료
				run=false;
				System.out.println("프로그램 종료");				
			}			
		}
		scan.close();
	}

}
