package bookshop;

import java.util.ArrayList;

public class BookList {
	//BookDTO를 ArrayList<>에 넣어야 하는 이유 => 크기가 가변 길이이다.
	//=>BookDTO[] book = new BookDTO[100] 이런식으로 하면 100개까지밖에 못넣기때문에 가변길이로 해주기위해서
	
	//멤버변수
	ArrayList<BookDTO> book = new ArrayList<BookDTO>();
	// book[0] = {Booktitle:~,Author:~,publisher:~,Date:~,Price:~}
	// book[1] = {Booktitle:~,Author:~,publisher:~,Date:~,Price:~}
	// book[2] = {Booktitle:~,Author:~,publisher:~,Date:~,Price:~}
	
	//책 추가 메소드
	public void addBook(BookDTO bdto){
		//bdto.Booktitle로 접근할수 있는 상태가 됨
		book.add(bdto);
	};
	
	//총계 구하는 메소드
	public int priceSum() {
		int total = 0;
		
		for(BookDTO b : book) {						
			total += b.Price;	
		}
		
		return total;
	}
	
	//출력 메소드 => main에 작성해도 무방함
	public void bookInfo() {
		System.out.println("====================================");	
		System.out.println("도서명\t저자\t출판사\t출판일\t가격");	
		System.out.println("====================================");
		
		for(BookDTO b: book) {
			b.showBook();
		}
		System.out.println("====================================");
	}
	
}
