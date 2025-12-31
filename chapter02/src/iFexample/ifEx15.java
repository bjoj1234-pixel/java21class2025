package iFexample;

import java.util.Random;
import java.util.Scanner;

public class ifEx15 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int r = ran.nextInt(100)+1; // +1안하면 0~99, 하면 1~100
		System.out.printf("문제[%d] %n",r);
		System.out.println("1.홀수");
		System.out.println("2.짝수");
		System.out.println("번호를 선택하세요:");
		
		int num = scan.nextInt();
		
		switch(num) {
			//홀수
			case 1:
				if(r%2==1) {System.out.println("정답!");
				}else {System.out.println("오답!");}			
				break;
			//짝수
			case 2:
				if(r%2==0) {System.out.println("정답!");
				}else {System.out.println("오답!");}			
				break;
			default: System.out.println("1 또는 2를 입력하세요");
			break;
		}
		
		// 좀더 간추린 식
//		int check = r%2;
//		if((num == 1 && check != 0)||(num == 2 && check == 0)) {
//			System.out.println("정답!");
//		}else {
//			System.out.println("오답!");
//		}
	}

}
