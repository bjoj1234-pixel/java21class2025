package example;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
//		문제1) 10부터 50까지 arr배열에 저장
//		정답1) 10 20 30 40 50
		
		int[] num01 = {10,20,30,40,50};
		System.out.println(Arrays.toString(num01));
		System.out.println("-------------");

//		문제2) 4의 배수만 출력
//		정답2) 20 40	
		
		for(int i=0; i<num01.length; i++) {
			
			if(num01[i]%4==0) {
				System.out.printf("%d%n",num01[i]);
			}
		}		
		System.out.println("-------------");
//		문제3) 4의 배수의 합 출력
//		정답3) 60
		int total=0;
		for(int i=0; i<num01.length; i++) {
			
			if(num01[i]%4==0) {
				total += num01[i];
			}
		}	
		System.out.println("4의 배수 합은 "+total+"개");
		System.out.println("-------------");

//		문제4) 4의 배수의 개수 출력
//		정답4) 2
		int count = 0;
		
		for(int i=0; i<num01.length; i++) {
			
			if(num01[i]%4==0) {
				count++;
			}
		}	
		System.out.println("4의 배수는 "+count+"개");
		System.out.println("-------------");

//		문제5) 짝수의 개수 출력
//		정답5)
		
		int count02 = 0;
		
		for(int i=0; i<num01.length; i++) {
			
			if(num01[i]%2==0) {
				count02++;
			}
		}	
		System.out.println("짝수는 "+count02+"개");


	}

}
