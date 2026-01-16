package capitalGame;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RunMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);				
		//System.out.println(Arrays.toString(game.getNation()));
		//[프랑스, 일본, 브라질, 캐나다, 호주, 이집트, 케냐, 스웨덴]
		
		System.out.println("*** 수도 맞추기게임을시작합니다. ***");
		
		while(true) {
			Game game = new Game();
			
			System.out.println("입력: 1,  퀴즈: 2,  종료: 3 >>");
			int inputNum = scan.nextInt();
			
			if(inputNum == 1) { //입력
				int nationNum = game.list.size(); //나라와 수도의 입력 수				
				System.out.println("현재 "+nationNum+"개 나라의 수도가 입력되어 있습니다.");
				
				int i=1;
				
				while(true) {
					Scanner scan2 = new Scanner(System.in);	
					
					System.out.println("나라와 수도 입력 "+(nationNum+i)+" >>");
					
					String NationAndCity = scan2.nextLine();
			
					
					if(NationAndCity.equals("그만")){
						break;
					}
					
					StringTokenizer st = new StringTokenizer(NationAndCity);
					String nNation = st.nextToken().trim();
					String nCity = st.nextToken().trim();
					
					if(game.list.containsKey(nNation)) {
						System.out.println(nNation+"은 이미 있습니다.");
					}else {
						//나라이름, 수도 추가
						game.list.put(nNation,nCity);						
					}	
					i++;
				}
			}else if(inputNum == 2) {//퀴즈
				System.out.println(game.list);
				for(String n : game.list.keySet()) {
				
					//System.out.println(game1.list.get(n));	
					
					System.out.println(n+"의 수도는?");
					String inputCity = scan.next();
					
					if(inputCity.equals("그만")) {
						break;
					}else if(game.list.get(n).equals(inputCity)) {
						System.out.println("정답!!");
					}else {
						System.out.println("아닙니다!");
					}

				}
				
			}else if(inputNum == 3) {//종료
				System.out.println("게임을 종료합니다.");
				break;
			}else {
				System.out.println("번호를 잘못입력했습니다. 다시 입력바랍니다.");
				continue;
			}			
			
		}	

	}

}
