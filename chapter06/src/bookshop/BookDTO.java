package bookshop;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookDTO {
	// DB의 데이터를 임시로 저장하는 공간으로 만들어놓은 클래스
	// 멤버변수 필수

	String Booktitle; //도서명
	String Author; // 저자
	String publisher; // 출판사
	Date Date; // 출판일
	int Price; // 가격

	//디폴트 생성사
	public BookDTO() {};

	//매개변수 생성자
	public BookDTO(String b,String a,String pb,Date d,int pr) {
		this.Booktitle = b; //도서명
		this.Author = a; // 저자
		this.publisher = pb; // 출판사
		this.Date = d; // 출판일
		this.Price = pr; // 가격		
	}	
	
	//출력메소드
	public void showBook() {
		//DecimalFormat을 사용해서 숫자의 형식을 변경하여 
		//출력하면 문자가 됨을 주의하자!!
		DecimalFormat de = new DecimalFormat("#,##0원");
		//SimpleDateFormat을 이용하여 날짜의 형식을 변경하여 출력
		//SimpleDateFormat을 이용해 변경한 날짜는 문자이다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
		
		System.out.printf("%s\t%s\t%s\t%s\t%s%n",Booktitle,Author,publisher,sdf.format(Date),de.format(Price));
	}
	
}
