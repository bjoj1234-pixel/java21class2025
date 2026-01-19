package ot_Shop;
//DTO클래스 : 매개변수(데이터) 및 해당 매개변수 출력 메소드만 기입
public class User {
	String[] id = {"mmm","kkk","ccc","ddd","eee","fff"};
	String[] pw = {"123","111","222","333","444","555"};
	
	// -1 : 현재 로그아웃 상태
	// 0 이상 : 로그인한 user의 index
	int log = -1;
}
