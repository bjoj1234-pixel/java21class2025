package classpart08;

import java.util.Scanner;

public class ot_MainClass11 {

	public static void main(String[] args) {
		// 객체화(=인스턴스화)
		// 참조변수 : scan
		Scanner scan = new Scanner(System.in);
		ot_ClassEx11 e11 = new ot_ClassEx11();
		e11.name = "메가IT 고등학교";
		boolean run = true;
		
		while(run) {
			System.out.println("======="+e11.name+"=======");
			System.out.printf("1. 전교생 성적확인%n2. 1등학생 성적확인%n3. 꼴등학생 성적확인%n4. (학번을 입력받아)성적확인하기%n5. 종료하기%n");
			System.out.println("메뉴 선택 : ");
			int sel = scan.nextInt();
			if(sel==1) {
				e11.choice1();
			}else if(sel==2) {
				e11.choice2();
			}else if(sel==3) {
				e11.choice3();
			}else if(sel==4) {
				System.out.println("학번 입력");
				int hakbun = scan.nextInt();
				e11.choice4(hakbun);
			}else {
				run=false;
				System.out.println("프로그램 종료");
			}
		}	
		
		
		
	}

}
