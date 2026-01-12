package bookshop;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BookMain {

	public static void main(String[] args) throws ParseException {
		//객체화 해야되는 대상 : BookList 클래스를 객체화 한다.
		BookList bookData = new BookList();

		//출력용 날짜형식
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd(E)");
		//입력용 날짜형식
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		DecimalFormat de = new DecimalFormat("\u00A4#,##0원");
		
		//BookDTO에 데이터를 객체화하여 삽입한다.
		bookData.addBook(new BookDTO("Java","홍길동","코리아출판사",sdf2.parse("2026-01-12"),35000));
		bookData.addBook(new BookDTO("React","김길동","코리아출판사",sdf2.parse("2025-02-12"),45000));
		bookData.addBook(new BookDTO("Spring","최길동","코리아출판사",sdf2.parse("2020-03-12"),15000));
		bookData.addBook(new BookDTO("HTML","박길동","코리아출판사",sdf2.parse("2023-01-12"),75000));
		bookData.addBook(new BookDTO("MySQL","오길동","코리아출판사",sdf2.parse("2021-04-12"),25000));

		bookData.bookInfo();

		System.out.println("합계 : " + de.format(bookData.priceSum()));
			

	}

}
