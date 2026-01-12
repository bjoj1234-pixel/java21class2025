package formatExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleEX {

	public static void main(String[] args) throws ParseException {
		// SimpleDateFormat 클래스는 날짜를 특정 형식의 문자열로
		// 출력하거나 문자열로 변환할때 사용한다.
		// 출력할때 : SimpleDateFormat.format()
		// 변경할때 : SimpleDateFormat.parse()
		// SimpleDateFormat 클래스도 new 예약어로 객체 생성한다.
		// SimpleDateFormat.format("yyyy-mm-dd") => 따옴표 안에 변경할 날짜 형식 입력
		
		
		Scanner scan = new Scanner(System.in);
		
		//현재 날짜/시간 객체
		//타입이 Date인 now 객체를 생성한 것이다.
		Date now = new Date();
		
		//날짜 포맷
		// MM=> 날짜 , mm => 분
		// yy는 소문자로 써야함 
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일(E)");		
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH:mm:ss a");		
		
		System.out.println(now);
		System.out.println(sdf1.format(now));
		System.out.println(sdf2.format(now));
		System.out.println(sdf3.format(now));
		System.out.println(sdf4.format(now));
		System.out.println(sdf1.parse("2026-02-03"));
		//public static void main(String[] args) throws ParseException
		//메인에 위 예외처리를 하여 출력가능
		System.out.println(sdf3.format(sdf1.parse("2026-02-03")));
		//요일까지 출력위에서는 위와같이 써줌


	}

}








