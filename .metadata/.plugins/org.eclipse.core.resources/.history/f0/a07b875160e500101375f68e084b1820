package iFexample;

import java.util.Scanner;

public class ifEx14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cash = 20000; // 입금시 감소 , 출금시 증가
		int balance = 30000; // 입금시 증가 , 출금시 감소 
		int account = 11111; // 로그인시 사용
		int password = 1234; // 로그인시 사용 
		
		System.out.println("===MEGA ATM===");
		System.out.println("1.로그인 2.종료");
		int login = scan.nextInt();
		if(login == 2) {
			System.out.println("종료");
			return;
		}
		System.out.println("계좌와 비밀번호를 입력하세요");
		int acc = scan.nextInt();
		int pw = scan.nextInt();
		
		if(acc != account || pw != password) {
			System.out.println("아이디와 패스워드를 확인해주세요");
			return;
		}
		
		System.out.println("1.입금 2.출금 3.조회");
		int action = scan.nextInt();
		
		int case1=1,case2=2,case3=3;
		int money = 0;


		if(action == case1) {
			System.out.println("입금할 금액을 입력하세요");
			money = scan.nextInt();
			
			if(money>cash) {
				System.out.println("통장잔액이 부족합니다");
			}else {
				cash -= money;
				balance += money;
				System.out.printf("입금 후 통장잔액: %d원%n입금 후 현금잔액: %d원",balance,cash);
			}
		}
		if(action == case2) {
			System.out.println("출금할 금액을 입력하세요");
			money = scan.nextInt();
			
			if(money>cash) {
				System.out.println("통장잔액이 부족합니다");
			}else {
				cash += money;
				balance -= money;
				System.out.printf("출금 후 통장잔액: %d원%n출금 후 현금잔액: %d원",balance,cash);
			}
		}
		if(action == case3){
			System.out.printf("내 통장잔액: %d원%n내 현금잔액: %d원",balance,cash);
		}		
		
	}

}
