package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx04 {
	
	public static void main(String[] args) {
		HashMap<String, Integer> cli = new HashMap<String, Integer>();
		
		System.out.println("** 포인트 관리프로그램입니다. **");
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println();
			System.out.println("이름과 포인트 입력 >>");
			String client = scan.nextLine();//입력
			
			//예외처리
			if(client.equals("그만")) {
				System.out.println("포인트 관리 종료");
				break;
			}			
			
			StringTokenizer st = new StringTokenizer(client);
			
			String name = st.nextToken().trim();//이름
			Integer point = Integer.parseInt(st.nextToken().trim());//포인트
			
			//int check = 0;
			
			//만약 기존에 저장된 이름이 있으면 포인트 누적
//			for(String c: cli.keySet()) {
//				if(name.equals(c)) {
//					Integer clipoint = cli.get(c);
//					clipoint += point;
//					cli.replace(c,clipoint); //변경
//					check++;
//					break;
//				}
//			}
			
//			if(check == 0) {//만약 기존에 저장된 이름이 없으면 새로 저장
//			cli.put(name, point);
			//		}
			
			//만약 기존에 저장된 이름이 있으면 포인트 누적
			if(cli.containsKey(name)) {
				point += cli.get(name);
			}
				
			cli.put(name, point);	

			// 출력
			for(String c: cli.keySet()) {
				Integer clipoint = cli.get(c);//값
				System.out.print("("+c+","+clipoint+") ");
			}		
			
		}

	}

}
