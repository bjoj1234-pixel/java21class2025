package staticEx;

import java.util.Scanner;

public class MainClass01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		StaticEx01 park = new StaticEx01("박찬호");
		
		park.moneyIn(100);
		park.getBankInfo();		
		
		System.out.println(park.atm);
		System.out.println("-----------------");
		
		StaticEx01 lee = new StaticEx01("이승엽");
		lee.moneyIn(200);
		lee.getBankInfo();
		lee.moneyOut(100);
		System.out.println(lee.atm);
	}

}
