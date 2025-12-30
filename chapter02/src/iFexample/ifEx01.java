package iFexample;

import java.util.Scanner;

public class ifEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 입력하세요");
		String id = sc.next();
		System.out.println("비밀번호를 입력하세요");
		String pw = sc.next();
		
		
		//db아이디,pw
		//String은 dbid="1234" 값이 저장된 힙메모리의 주소가 dbid에 존재하기때문에 값을 직접 비교할 수 없다.
		//이런경우 문자를 비교할때는 반드시 equals()메서드를 이용해서 힙메모리의 값을 직접 비교해야 한다.
		String dbId = "1234";
		String dbPw = "1111";
		//equals가 들어갈때는 !(부정)이 앞에 붙는다
		//int 기본 데이터 타입은 변수에 값이 저장되어있으므로 ==(같다)만가지고도 값을 비교할수있다.
		if(dbId.equals(id) && dbPw.equals(pw)) {
			System.out.println("로그인실패");
		}else {
			System.out.printf("ID입력: %s %nPw입력: %s %n",id,pw);
			System.out.println("로그인성공");
		}
	}

}
