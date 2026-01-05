package multiExample;

import java.util.Scanner;

public class ot_String_example05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] items = new String[100][2];
		//null값을 해결하기위해 공백으로 초기화 함
		for(int i=0; i<items.length;i++) {
			for(int j=0; j<items[i].length;j++) {
				items[i][j] = "";
			}
		}
		
		boolean program = true;
		int itemCount=0;//아이템 개수
		
		while(program) {
		
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아이템 관리");
			System.out.println("[3]전체품목 출력");
			System.out.println("[0]종료");
			
			System.out.println("관리자 모드를 선택 : ");
			int admin = scan.nextInt();
			
			//0~3번 선택시
			if(admin >=0 && admin <=3) {
			
				if(admin == 1) {//카테고리 관리
					System.out.println("추가할 카테고리 입력 : ");
					String cate = scan.next();
					
					//int count = 0;
							
					items[itemCount][0] = cate;
					//count++;
					itemCount++;
				
				}else if(admin == 2) {
					//[0]과일류 출력하는 코드
					for(int i=0; i<items.length; i++) {	
						if(items[i][0] != null && items[i][0] != "") {
							System.out.printf("[%d] %s%n",i,items[i][0]);
						}
					}
					System.out.println("카테고리를 선택하세요 : ");
					int cateNum = scan.nextInt();
					System.out.println("추가할 아이템을 입력하세요 : ");
					String itemName = scan.next();
					
					items[cateNum][1] += itemName;
					items[cateNum][1] += "/";
				
					
				}else if(admin == 3) {//전체출력
					
					for(int i=0; i<itemCount; i++) {
						if(items[i][0] != null) {
							System.out.printf("%s : %s%n",items[i][0],items[i][1]);
						}
					}
					
					
				}else {
					//종료
					System.out.println("프로그램 종료");
					program=false;
				}
			}else {
				//0~3번 외 선택시
				System.out.println("다시 선택해주세요");
			}
		}
		scan.close();
	}

}
