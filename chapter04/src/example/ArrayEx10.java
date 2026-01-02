package example;
import java.util.*;


public class ArrayEx10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] seat = new int[7];//좌석 배열
		for(int i=0; i<seat.length; i++) {
			seat[i] = 0; //좌석배열 초기화
		}
		System.out.println(Arrays.toString(seat));
		boolean program = true; //프로그램 구동여부
		int impossible = 0; //불가능 좌석번호
		
		while(program==true) {
			System.out.println("= 메가 영화관 =");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");
			System.out.println("메뉴 선택 : ");
			int menu = scan.nextInt(); //메뉴 입력
			int count = 0;//누적 예약인원
			
			if(menu==1) {
				System.out.printf("예매 인원을 입력하세요[1~%d]%n",seat.length);
				int headCount = scan.nextInt();//예매 인원
				
				if(headCount > seat.length || headCount < 1) { //마지막 좌석번호보다 크거나 1보다 작게 입력했을때
					System.out.printf("예매인원은 1~%d이하의 숫자를 입력해주세요%n",seat.length);
				}else if(headCount-count==1){ //예매인원이 한명일때
					for(int i=0; i<seat.length; i++) {
						if(i%2 = 0) {
							seat[i]=3;
						}
						if(seat[i]==0){
							System.out.print("[ ]"); //예매가능							
						}else if(seat[i]==2) {
							System.out.print("[X]"); //예매완료						
						}else if(seat[i]==3) {
							System.out.print("[!]"); //예매불가능							
						}else {
							System.out.print("[O]"); //예매선택
						}
					}
					System.out.println(Arrays.toString(seat));

				}
			}else if(menu==2){
				System.out.println("= 메가 영화관 =");
			}else {
				System.out.println("메뉴를 입력하였습니다. 다시 입력해주세요.");
			}
		}
		
	}

}
