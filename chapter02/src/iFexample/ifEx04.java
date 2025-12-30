package iFexample;

import java.util.Scanner;

public class ifEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키를 입력하세요");
		int tall = scan.nextInt();
		
		if(tall >=120) {
			System.out.println("놀이기구 이용가능합니다.");
		}else{
			System.out.println("부모님과 함께 오셨나요? yes:1, no:0");
			int parents = scan.nextInt();
			if(parents ==1 ) {
				System.out.println("놀이기구 이용가능합니다.");
			}else {
				System.out.println("놀이기구를 이용할 수 없습니다.");
			}
		}
		
	}

}
