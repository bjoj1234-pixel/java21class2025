package multiExample;

import java.util.Scanner;

public class shoppingmall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111", "2222", "3333"};
		String[] items = {"사과", "바나나", "딸기"};
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		boolean program = true; //프로그램 실행
		String log = "로그아웃"; //로그인 상태
		int count = 0; //상품 담는 갯수
		int idx=0;//회원인덱스 저장
		
		while(program) {
			System.out.println("----------");
			System.out.printf("상태 : %s%n",log);
			System.out.println("----------");
			System.out.println("[GREEN MART]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종료");
			System.out.println("메뉴 선택 : ");
			//System.out.println(idx);
			int menu = scan.nextInt();
			
			
			if(menu==1) {
				System.out.println("ID입력 : ");
				String id = scan.next();
				System.out.println("PW입력 : ");
				String pw = scan.next();
				
				
				for(int i=0; i<ids.length; i++) {
					if(ids[i].equals(id) && pws[i].equals(pw)) {
						System.out.printf("%s님, 환영합니다.%n",ids[i]);
						log = ids[i];
						idx = i;
					}
//					if(!(ids[i].equals(id)) || !(pws[i].equals(pw))) {
//						System.out.println("id와 비밀번호를 다시 입력해주세요.");
//						continue;
//					}					
				}
				
			}else if(menu==2) {
				if(log == "로그아웃") {
					System.out.println("이미 로그아웃 되어있습니다.");
				}else {
					System.out.println("로그아웃 되었습니다.");
					log = "로그아웃";
					idx = 0;
				}
			}else if(menu==3) {
				if(log == "로그아웃") {
					System.out.println("로그인을 해주세요.");
				}else {
					boolean product = true;
					while(product) {
						System.out.println("[상품목록]");
						System.out.println("[1]사과");
						System.out.println("[2]바나나");
						System.out.println("[3]딸기");
						System.out.println("[4]뒤로가기");
						System.out.println("상품번호를 선택하세요.");
						int shopNum = scan.nextInt();
						
						if(shopNum >= 1 && shopNum <= 3) {
							jang[count][0] = idx;
							jang[count][1] = shopNum-1;
							count++;
						}else if(shopNum == 4) {
							product = false;
							//continue;
						}else {
							System.out.println("상품번호를 다시 입력하세요");
						}
					}
				}				
			}else if(menu==4) {
				if(log == "로그아웃") {
					System.out.println("로그인을 해주세요.");
				}else{
					int cartMax = items.length;
					int[][] cart = new int[cartMax][2];
					
					for(int k=0; k<cart.length; k++) {
						cart[k][1] = 0;
					}
					
					System.out.println("--- 내 장바구니 목록 ---");
					for(int i=0; i<jang.length; i++) {
						for(int k=0; k<cart.length; k++) {
							
							if(cart[k][0] !=  jang[i][0]) {
								cart[k][0] = jang[i][0];
								cart[k][1]++;
							}
						}
					}
					for(int k=0; k<cart.length; k++) {
						System.out.printf("%s : %d개 %n",items[cart[k][0]],cart[k][1]);
					}			
					
				}
				
			}else if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				program=false;//프로그램 종료
				scan.close();
			}else {
				System.out.println("메뉴를 다시 입력해주세요");
			}
		}		
	}

}
