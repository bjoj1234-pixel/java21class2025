package example;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String[] name = {"홍길동", "개나리", "진달래","김백합","최동훈"};
		String txt1 = "의 점수를 입력하세요";
		String txt2 = "의 점수: ";
		int[] score = new int[5];
		
			
		for(int i=0; i<score.length; i++) {
			System.out.println(name[i]+txt1);
			score[i] = scan.nextInt();			
		}
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+txt2+score[i]);
		}
		
		double avg = 0.0;
		
		for(int i=0; i<score.length; i++) {
			avg += score[i];			
		}
		avg = avg/score.length;
		
		System.out.printf("평균: %.1f",avg);//소수점 첫번쨰짜리까지 출력(.1f)
		
		
	}

}
