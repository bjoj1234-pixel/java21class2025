package iFexample;

import java.util.Scanner;

public class ifEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이용할 정거장 수를 입력하세요:");
		int num = scan.nextInt();
		int price = 0;
		 
		if(num>0 && num<=5) {
			price = 500;
		}else if(num>=6 && num<=10) {
			price = 600;
		}else{
			if(num % 2 == 1) {
				//홀수역일때
				price=600;
				int priceAdd = (num-10)/2 * 50;
				//홀수일때 50원이 적게 계산되므로
				price = price + priceAdd + 50;
			}else if(num % 2 == 0) {
				//짝수역일떄
				price=600;
				int priceAdd = (num-10)/2 * 50;
				price = price + priceAdd;
				
			}
		}
		
		System.out.println("요금 ="+price+"원");
		
		
	}

}
