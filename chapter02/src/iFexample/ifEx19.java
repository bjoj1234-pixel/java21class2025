package iFexample;

import java.util.Random;
import java.util.Scanner;

public class ifEx19 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		int ten1 = ran.nextInt(10)+1;
		int ten2 = ran.nextInt(10)+1;
		//계산결과값
		int result = 0;
		//answer의 역할
		int answer = ran.nextInt(4)+1;
	
		// +,-,*,% 구하는 식을 계산
		if(answer==1) {
			result = ten1+ten2;
		}else if(answer==2) {
			result = ten1-ten2;
		}else if(answer==2) {
			result = ten1*ten2;
		}else if(answer==4) {
			result = ten1%ten2;
		}
		
		System.out.printf("%d ? %d = %d %n",ten1,ten2,result);
		System.out.println("1)+ 2)- 3)* 4)%");
		System.out.print("번호를 선택하세요 :");
		int myAnswer = scan.nextInt();
		
		if(answer == myAnswer) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
		
		
	}

}
