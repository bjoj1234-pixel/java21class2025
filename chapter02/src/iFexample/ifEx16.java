package iFexample;

import java.util.Random;
import java.util.Scanner;

public class ifEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		//int question = ran.nextInt(150,250)+1;
		int question = ran.nextInt(100)+150;
		
		//가운데 숫자
		int centerNum = (question % 100)/10; 
	
		System.out.printf("문제 = %d%n",question);
		System.out.println("가운데 숫자를 입력하세요:");
		int num = scan.nextInt();
		
		if(num == centerNum) {System.out.println("정답!");
		}else {System.out.println("오답!");
		}
		
		
		
		
		
		
	}

}
