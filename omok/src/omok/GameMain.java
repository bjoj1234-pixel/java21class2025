package omok;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Game game = new Game(); //Game 로직 인스턴스화 
		
		boolean play = true; // 프로그램 구동여부
		
		while(play) {
			System.out.println();
			System.out.println("[ 오목 ]");
			System.out.println("[1]게임시작");
			System.out.println("[2]전적확인");
			System.out.println("[0]종료");
			System.out.println("메뉴선택: ");
			
			int menuSel = scan.nextInt();
			
			if(menuSel == 1) {//게임시작
				//게임시작 메소드
				game.GameStart();
			}else if(menuSel == 2) {//전적확인
				//전적확인 메소드
				game.record();
			}else if(menuSel == 0) { //종료
				System.out.println("게임을 종료합니다.");
				play=false;
			}else {//메뉴 잘못선택
				System.out.println("잘못입력했습니다. 다시 입력해주세요.");
			}			
		
		}

	}

}
