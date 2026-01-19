package hashMapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//이름과 학점입력 => 이름은 데이터 타입 String, 학점은 3.2 Double
		//Map<key, value>의 데이터 타입은 반드시 클래스 또는 래퍼클래스이다.
		HashMap<String, Double> st = new HashMap<String, Double>();
		
		System.out.println("미래 장학금 관리 시스템입니다.");
		
		for(int i=0; i<5;) {
			System.out.println("이름과 학점 >>");
			String student = scan.nextLine();
			
			StringTokenizer tk = new StringTokenizer(student);
			
			String name = tk.nextToken().trim();
			Double score = Double.parseDouble(tk.nextToken().trim());
			
			//학점 0.0 ~ 4.5까지 만족하지 않을때 에러출력
			if(score < 0.0 || score > 4.5) {
				System.out.println("학점: 0.0 ~ 4.5 사이의 숫자를 입력하세요");
				continue;				
			}			
			st.put(name, score);
			i++; //i는 조건이 만족할때만 누적시킨다.
		}
		
		System.out.println("장학생 선발 학생 기준 입력 >>");
		//기본 데이터 타입인 double이다. 
		double scholar = scan.nextDouble();
		
		//기준학점 이상만 출력
		//확장 for문 이용 이유=> for(데이터 타입 작명 : 참조변수)
		for(String s : st.keySet()) {//현재 ~keySet()은 name
			double dou = st.get(s); //학점 4.3, 4.5 ....
			if(dou >= scholar) System.out.println(s);
			// if(st.get(s) >= scholar) System.out.println(s);
		}
		
		
		
	
		

	}

}
