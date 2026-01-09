package arrayListEx03;

import java.util.Scanner;

public class Player {
	
	String name;
	
	public Player() {};
	
	
	public Player(String name) {
		this.name = name;
	};
 
	//자신의 차례의 단어 입력하는 scanner 메소드
	public String sayWord(Scanner scan) {
		System.out.println(name + " >> ");
		return scan.next();
	}
	
}
