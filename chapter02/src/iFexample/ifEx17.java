package iFexample;

import java.util.Random;

public class ifEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		int ranNum = ran.nextInt(50)+1;
		//10의 자리
		int jjak1 = ranNum / 10;
		int jjak1_num = (ranNum / 10)%2;
		//1의 자리
		int jjak2 = ranNum % 10;
		int jjak2_num = (ranNum % 10)%2;
		
		
		System.out.printf("문제 = %d %n", ranNum);
		
		if(ranNum>=10 && (jjak1_num==0 && jjak2_num==0) && (jjak1 !=0 && jjak2 !=0)) {
			System.out.println("짝짝");
		}else if((ranNum>=10 && (jjak1_num==0 || jjak2_num==0) && (jjak1 !=0 && jjak2 !=0))||(ranNum<10 && jjak2_num==0 && jjak2 >0)) {
			System.out.println("짝");
		}else {
			System.out.println(ranNum);
		}
		
		
		
	}

}
