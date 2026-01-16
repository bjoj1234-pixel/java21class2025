package hashMapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Map<String, Location> list = new HashMap<String, Location>();
		
		int run = 0;
		
		System.out.println("도시, 경도, 위도를 입력 하시오.");
		
		while(run<4) {
			System.out.println(">>");
			
			String inputText = scan.nextLine();
			
			StringTokenizer st = new StringTokenizer(inputText,",");
			
			//나라이름: 문자
			String city = st.nextToken().trim();
			//경도위도: 숫자이기에 파싱한다.
			//파싱은 래퍼클래스(Integer)를 사용한다.
			//래퍼클래스 쓸때는 데이터타입도 Integer로 해줘야됨.
			//
			Integer latitude = Integer.parseInt(st.nextToken().trim());
			Integer longitude = Integer.parseInt(st.nextToken().trim());
			
			Location locate = new Location(city,latitude,longitude);
			
			list.put(locate.getCity(), locate);
			
			run++;
		}
		System.out.println("--------------------");
		
		for(String l : list.keySet()) {
			// Location 객체를 데이터 타입으로
			// locate2 참조변수에
			// 나라이름, 위도, 경도 값을 저장
			Location locate2 = list.get(l);
			
			//System.out.println(locate2);
			System.out.println(locate2.toString());
			//객체 데이터 타입을 지정한 경우 출력할때 내부적으로 자동 toString()메소드를 호출한다.
		}
		
		System.out.println("--------------------");
		
		boolean run2 = true;

		//정보검색
		while(run2) {
			System.out.println("도시이름 >> ");
			
			String inputText = scan.next();
			
			if(inputText.equals("그만")) {
				System.out.println("정보검색종료");
				break;
			}
			if(!list.containsKey(inputText)) {
				System.out.println(inputText+"는 없습니다.");
				continue;
			}
			
			System.out.println(list.get(inputText));
		}

		scan.close();
		
		
		
		

	}

}
