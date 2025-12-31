package example;

import java.util.Scanner;

public class LoopEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		// while(조건) => true는 무한루프 돈다는 의미,
		// -100과같은 숫자를 넣게되면 그때만 while이 돌기때문에 안됨
		
		while(run == true) {
			System.out.println("숫자를 입력하세요");
			int num = scan.nextInt();
			if(num == -100) {
				System.out.println("종료");
				run= false;
			}
		}
		
		
	}

}
