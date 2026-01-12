package bookMax;

import java.util.ArrayList;

public class bookDTO {
	ArrayList<privateEx01> pt = new ArrayList<privateEx01>();

	privateEx01 pt01 = new privateEx01();
	privateEx01 pt02 = new privateEx01();
	privateEx01 pt03 = new privateEx01();
	
	
	
	pt
//	pt02.setTitle("이펙티브 자바");
//	pt03.setTitle("클린 코드");
//	pt01.setAuthor("남궁성");
//	pt02.setAuthor("조슈아 블로크");
//	pt03.setAuthor("로버트 마팀");
//	pt01.setPrice(30000);
//	pt02.setPrice(36000);
//	pt03.setPrice(29000);
	
	//책목록 출력
	public void bookPrint() {
		System.out.println("제목: "+pt.title+"\t저자: "+pt.author+"\t가격: "+pt.price+"원");
	}
	
}
