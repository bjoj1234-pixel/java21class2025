package classpart08;

import java.util.Scanner;

public class MainClass11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassEx11 ex11 = new ClassEx11();
		boolean run = true;
		
		while(run) {
			System.out.println("=== 메가IT 고등학교 ===");
			System.out.println("1. 전교생 성적확인");
			System.out.println("2. 1등학생 성적확인");
			System.out.println("3. 꼴등학생 성적확인");
			System.out.println("4. (학번을 입력받아)성적확인하기");
			System.out.println("5. 종료하기");
			System.out.println("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel==1) {//전교생 성적확인
				ex11.choice1();
				System.out.println();
			}else if(sel==2) {//1등학생 성적확인
				ex11.choice2();
				System.out.println("1등 학생 = "+ex11.arHakbun[ex11.choice2()]+"학번("+ex11.arScore[ex11.choice2()]+")");
				System.out.println();
			}else if(sel==3) {//꼴등학생 성적확인
				ex11.choice3();
				System.out.println("꼴등 학생 = "+ex11.arHakbun[ex11.choice3()]+"학번("+ex11.arScore[ex11.choice3()]+")");
				System.out.println();
			}else if(sel==4) {//성적확인하기
				System.out.println("학번을 입력하세요 : ");
				int check = scan.nextInt();
				
				if(ex11.choice4(check) == -1) {
					System.out.println("입력한 학번이 존재하지 않습니다.");
				}else {
					System.out.println("점수 :" + ex11.choice4(check)+"점");
				}
				
			}else if(sel==5) {
				System.out.println("프로그램 종료");
				run = false;
			}else {
				System.out.println("다시 입력해주세요.");
			}
			
			
			
			
			
		}
		

	}

}
