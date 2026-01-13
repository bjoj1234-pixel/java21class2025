package bookMax;

public class MainClass {

	public static void main(String[] args) {
		
		privateEx01 prv = new privateEx01();
				
		prv.addData("자바의 정석", "남궁성", 30000);
		prv.addData("이펙티브 자바", "조슈아 블로크", 36000);
		prv.addData("클린 코드", "로버트 마팀", 29000);
		
		//책목록 출력
		System.out.println("======== 책목록 ========");
		
		prv.bookInfo();
		
		//가장 비싼책
		System.out.println("======== 가장 비싼 책 ========");

		prv.expensive();
		
	}

}
