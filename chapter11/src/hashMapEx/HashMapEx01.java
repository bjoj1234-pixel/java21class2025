package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx01 {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		
				
		System.out.println("나라 이름과 인구를 입력하세요.(예: korea 5000)");
		boolean run = true;
		
		while(run) {			
			System.out.println("나라 이름, 인구 >>");
			
			String inputText = scan.nextLine();//문장전체를 스캔
			
			if(inputText.equals("그만")) {
				run=false;
				break;
			}else {
				StringTokenizer info = new StringTokenizer(inputText);
				String info1 = info.nextToken();
				String info2 = info.nextToken().trim();
				
				//Integer 데이터 타입으로 파싱한다(형변환을 의미)
				//파싱은 반드시 클래스이어야 한다. 고로, 래퍼클래스로 진행한다.
				Integer info2_parse = Integer.parseInt(info2);
					
				nations.put(info1,info2_parse);
			}
		}
			
		boolean run2 = true;
		
		while(run2) {
			System.out.println("인구 검색 >>");
			
			String inputText2 = scan.next();
			
			if(inputText2.equals("그만")) {
				System.out.println("인구검색 종료");
				run2=false;
				break;
			}
			
			if(!nations.containsKey(inputText2)) {
				System.out.println("해당 나라가 존재하지 않습니다.");
				continue;
			}
			
			System.out.println(inputText2+"의 인구는 "+nations.get(inputText2));
		
		}
			
			
		
	}



}
