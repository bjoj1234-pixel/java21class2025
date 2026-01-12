package privateEx;

public class MainClass {

	public static void main(String[] args) {
		PrivateTest pt = new PrivateTest();
		
		//먼저 set() => 값을 수정
//		pt.setDay(10);
//		pt.setMonth(20);
//		pt.setYear(2005);
		
		pt.setYear(2005);
		pt.setMonth(2);
		pt.setDay(30);//2월에 30일을 set하면 오류
		
		
		//get()으로 값을 출력
		System.out.println(pt.getDay());
		System.out.println(pt.getMonth());
		System.out.println(pt.getYear());
	}

}
