package bookMax;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<privateEx01> pt = new ArrayList<privateEx01>();
		
		privateEx01 pt01 = new privateEx01();
		privateEx01 pt02 = new privateEx01();
		privateEx01 pt03 = new privateEx01();
		
		pt01.setTitle("자바의 정석");
		pt02.setTitle("이펙티브 자바");
		pt03.setTitle("클린 코드");
		pt01.setAuthor("남궁성");
		pt02.setAuthor("조슈아 블로크");
		pt03.setAuthor("로버트 마팀");
		pt01.setPrice(30000);
		pt02.setPrice(36000);
		pt03.setPrice(29000);
		
		pt.add(pt01);
		pt.add(pt02);
		pt.add(pt03);
		
		System.out.println("======== 책목록 ========");
		//책목록 출력
		for(privateEx01 p : pt) {
			p.bookPrint();
		}
		System.out.println("======== 가장비싼책 ========");

		//가장 비싼책
		String title2=""; 
		String author2="";
		int price2 = 0;
		
		for(privateEx01 p : pt) {
			if(price2 < p.getPrice()) {
				price2 = p.getPrice();
				title2 = p.getTitle();
				author2 = p.getAuthor();
			}
		}
		System.out.println("제목: "+title2+"\t저자: "+author2+"\t가격: "+price2+"원");
	}

}
