package multiExample;

import java.util.Scanner;

public class String_example05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] items = new String[100][2];
		boolean program = true;
		
		while(program) {
		
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아이템 관리");
			System.out.println("[3]전체품목 출력");
			System.out.println("[0]종료");
			
			System.out.println("관리자 모드를 선택 : ");
			int admin = scan.nextInt();
		
		
			if(admin == 1) {//카테고리 관리
				System.out.println("추가할 카테고리 입력 : ");
				String cate = scan.next();
				
				int min = 0;
				
				for(int i=0; i<items.length; i++) {
					min = 0;
					
					if(items[i][0]==null) {
						if(min>=i) {
							min = i;
						}
					}					
				}
				items[min][0] = cate;
			
			}else if(admin == 2) {
				for(int i=0; i<items.length; i++) {
					if(items[i][0]!=null) {
						System.out.printf("[%d] %s",i,items[i][0]);
					}					
				}
				System.out.println("카테고리를 선택하세요 : ");
				int cateNum = scan.nextInt();
				System.out.println("추가할 아이템을 입력하세요 : ");
				String itemName = scan.next();

				if(items[cateNum][1] == null) {
					items[cateNum][1] = itemName+"/";
				}else {
					items[cateNum][1] += items[cateNum][1]+"/";
				}			
				
				
			}else if(admin == 3) {
				for(int i=0; i<items.length; i++) {
					for(int j=0; j<items[i].length; j++) {
						if(items[i][0] != null) {
							System.out.printf("%s : %s%n",items[i][0],items[i][1]);
						}
						
					}
				}
				
				
			}else {
				//종료
				System.out.println("프로그램 종료");
				program=false;
			}
		}
		scan.close();
	}

}
