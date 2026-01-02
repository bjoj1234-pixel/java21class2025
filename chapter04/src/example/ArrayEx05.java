package example;

import java.util.*;

public class ArrayEx05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = {87, 11, 45, 98, 23};
		
		System.out.println("학번입력: ");
		int num = scan.nextInt();
		//체크 키
		int check=-1;
		
		for(int i=0;i<hakbuns.length;i++) {
			if(num == hakbuns[i]) {
				check = i;
			}
		}
		
		if(check != -1) {
			System.out.println(hakbuns[check]);
		}else {
			System.out.println("존재하지 않는 학점");
		}
		
	}

}
