package bookMax;

public class bookDTO {
	private String title;
	private String author;
	private int price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//책목록 출력
	public void bookPrint() {
		System.out.println("제목: "+this.title+"\t저자: "+this.author+"\t가격: "+this.price+"원");
	}
	
}
