package omok;

import java.util.Scanner;

public class Game {
	Scanner scan = new Scanner(System.in);
	GameElements elem = new GameElements();//인스턴스
	
	int p1Win=0;//플레이어1 승 누적
	int p1Lose=0;//플레이어1 패 누적
	int p2Win=0;//플레이어2 승 누적
	int p2Lose=0;//플레이어2 패 누적
	
	
	public Game() {};
	
	//게임시작 메소드
	public void GameStart() {
		boolean playing = true; //게임실행여부
		int player = 0; //플레이어 순서
		
		
		while(playing) {
			System.out.println("플레이어 "+(player+1)+"차례 - 놓을 위치를 선택");
			System.out.println("세로(1~13) : ");
			int vertical = scan.nextInt();
			System.out.println("가로(1~13) : ");
			int horizon = scan.nextInt();
			
			//범위에서 벗어난건 예외처리
			if(vertical > 13 || vertical < 1 || horizon >13 || horizon < 1 ) {
				System.out.println("놓을 수 없는 자리입니다.");
				continue;
			}
			//돌이 놓여진 자리 예외처리
			if(elem.Otable[horizon-1][vertical-1] != "-") {
				System.out.println("이미 돌이 놓여진 자리입니다.");
				continue;
			}
			
			//플레이어 0 : 검은돌, 1: 흰돌저장
			if(player == 0) {
				elem.place(horizon-1, vertical-1, elem.black);
			}else {
				elem.place(horizon-1, vertical-1, elem.white);
			}
			//현재 놓여진 돌 보여주기
			for(int i=0;i<elem.Otable.length;i++) {
				for(int j=0;j<elem.Otable[i].length;j++) {
					System.out.print(elem.Otable[i][j]+" ");
					//가로 12번째마다 한줄띄기
					if(j==12) {
						System.out.println();
					}
				}			
			}
			
			int w_five = 0;//흰돌 누적
			int b_five = 0;//검은돌 누적
			
			//가로가 5개일때
			for(int i=0;i<elem.Otable.length;i++) {
				for(int j=0;j<elem.Otable[i].length-4;j++) {
					w_five = 0;
					b_five = 0;
					for(int k=0;k<5;k++) {
						if(elem.Otable[i][j+k].equals(elem.black)) {
							b_five++;
						}else if(elem.Otable[i][j+k].equals(elem.white)) {
							w_five++;
						}
						
						//승패 결과출력 & 전적누적 메소드(이긴사람 없으면 계속실행)
						result(b_five,w_five);
						
						//이긴사람 있으면 게임종료
						if(b_five==5 || w_five==5) {
							playing = false;
							return;
						}					
					}
				}			
			}
			
			w_five = 0;
			b_five = 0;			
		
			//세로가 5개일때
			for(int i=0;i<elem.Otable.length-4;i++) {
				for(int j=0;j<elem.Otable[i].length;j++) {
					w_five = 0;
					b_five = 0;
					for(int k=0;k<5;k++) {
						if(elem.Otable[i+k][j].equals(elem.black)) {
							b_five++;
						}else if(elem.Otable[i+k][j].equals(elem.white)) {
							w_five++;
						}else {
							break;
						}
						
						//승패 결과출력 & 전적누적 메소드(이긴사람 없으면 계속실행)
						result(b_five,w_five);
						
						//이긴사람 있으면 게임종료
						if(b_five==5 || w_five==5) {
							playing = false;
							return;
						}
					}
				}			
			}
						
			w_five = 0;
			b_five = 0;
						
			//가로,세로 대각선(내림)
			for(int i=0;i<elem.Otable.length-4;i++) {
				for(int j=0;j<elem.Otable[i].length-4;j++) {
					w_five = 0;
					b_five = 0;
					for(int k=0;k<5;k++) {
						if(elem.Otable[i+k][j+k].equals(elem.black)) {
							b_five++;
						}else if(elem.Otable[i+k][j+k].equals(elem.white)) {
							w_five++;
						}else {
							break;
						}
						
						//승패 결과출력 & 전적누적 메소드(이긴사람 없으면 계속실행)
						result(b_five,w_five);
						
						//이긴사람 있으면 게임종료
						if(b_five==5 || w_five==5) {
							playing = false;
							return;
						}
					}
				}			
			}
						
			w_five = 0;
			b_five = 0;
			
			//가로,세로 대각선(오름)
			for(int i=4;i<elem.Otable.length;i++) {
				for(int j=0;j<elem.Otable[i].length-4;j++) {
					for(int k=0;k<5;k++) {
						if(elem.Otable[i-k][j+k].equals(elem.black)) {
							b_five++;
						}else if(elem.Otable[i-k][j+k].equals(elem.white)) {
							w_five++;
						}else {
							break;
						}
						
						//승패 결과출력 & 전적누적 메소드(이긴사람 없으면 계속실행)
						result(b_five,w_five);
						
						//이긴사람 있으면 게임종료
						if(b_five==5 || w_five==5) {
							playing = false;
							return;
						}
					}
				}			
			}
					
			player++;
			
			//플레이어 순서바꿈
			if(player==2) {
				player=0;
			}			
		}		
	};
	
	//승패 결과출력 & 전적누적 메소드
	public void result(int b_five,int w_five) {
		if(b_five==5) {
			System.out.println("게임 끝 : 플레이어 1 승리");		
			p1Win++;
			p2Lose++;
		}else if(w_five==5) {
			System.out.println("게임 끝 : 플레이어 2 승리");
			p1Lose++;
			p2Win++;			
		}
	} 	
	
	//전적확인 메소드
	public void record() {
		System.out.println("플레이어 1 :"+ p1Win +"승" + p1Lose +"패");
		System.out.println("플레이어 2 :"+ p2Win +"승" + p2Lose +"패");
	}
	
	
}
