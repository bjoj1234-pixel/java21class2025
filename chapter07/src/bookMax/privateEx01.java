package bookMax;

import java.util.ArrayList;

public class privateEx01 {
	ArrayList<bookDTO> bookArray = new ArrayList<bookDTO>();

	//책정보 저장	
	public void addData(String title,String author,int price) {
		bookDTO dto = new bookDTO();
		
		dto.setTitle(title);
		dto.setAuthor(author);
		dto.setPrice(price);
		
		bookArray.add(dto);
	};
	
	//책목록 출력
	public void bookInfo() {
		for(bookDTO b:bookArray) {
			b.bookPrint();
		}		
	}
	
	//가장 비싼책
	public void expensive() {
		String title=""; 
		String author="";
		int price = 0;
		
		for(bookDTO b : bookArray) {
			if(price < b.getPrice()) {
				price = b.getPrice();
				title = b.getTitle();
				author = b.getAuthor();
			}
		}
		System.out.println("제목: "+title+"\t저자: "+author+"\t가격: "+price+"원");
	}

	
	
}
