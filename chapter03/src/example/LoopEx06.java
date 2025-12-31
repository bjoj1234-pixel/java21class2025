package example;

import java.util.Scanner;

public class LoopEx06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int food1 = 8700;
		int food2 = 6200;
		int food3 = 1500;
		
		int food1_num = 0;
		int food2_num = 0;
		int food3_num = 0;
		System.out.println("=== 롯데리아 ===");
		System.out.printf("1. 불고기 버거 : %d원%n",food1);
		System.out.printf("2. 새우 버거 : %d원%n",food2);
		System.out.printf("3. 콜라 : %d원%n",food3);
		
		int count = 0;
		
		while(count<5) {
			System.out.println("메뉴 선택 : ");
			int menu = scan.nextInt();
			
			if(menu==1) { food1_num++;
			}else if(menu==2) { food2_num++;
			}else {food3_num++;}
			
			count++;
		}
		//총금액
		int totalPrice = food1 * food1_num + food2 * food2_num + food3 * food3_num;
		
		System.out.printf("총금액 = %d원%n",totalPrice);
		System.out.println("현금 입력 : ");
		//현금
		int cash = scan.nextInt();
		//잔액
		int charge = cash-totalPrice;
		
		if(charge>0) {
			System.out.println("=== 롯데리아 영수증 ===");
			System.out.printf("1. 불고기 버거 : %d개%n",food1_num);
			System.out.printf("2. 새우 버거 : %d개%n",food2_num);
			System.out.printf("3. 콜라 : %d개%n",food3_num);
			System.out.printf("4. 총금액 : %d원%n",totalPrice);
			System.out.printf("5. 잔돈 : %d원%n",charge);
		}else {
			System.out.println("현금이 부족합니다.");
		}
		
		

	}

}
