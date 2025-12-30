package iFexample;

import java.util.Scanner;

public class ifEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//db아이디,비번
		int dbId1 = 0;
		int dbPw1 = 0;
		
		System.out.println("---회원가입---");
		System.out.println("가입할 아이디입력");
		int id = scan.nextInt();
		dbId1= id;
		System.out.println("가입할 아이디의 비번입력");
		int pw = scan.nextInt();
		dbPw1= pw;
		System.out.println("가입을 축하합니다.");
		
		System.out.println("---로그인---");
		System.out.println("ID입력:");
		int loginId = scan.nextInt();
		System.out.println("비번입력:");
		int loginPw = scan.nextInt();
		
		if(dbId1 == loginId && dbPw1 == loginPw) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		
		
	}

}
