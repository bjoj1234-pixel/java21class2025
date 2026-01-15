package abstractTest;

//같은 파일 안에는 public 클래스가 하나만 있어야되서 뺌
class define {
	public static final int MIN = 1;
	public static final int MAX = 9999;
	public static final int ENG = 1001;
	public static final int MATH = 2001;
	public static final double PI = 3.14;
	public static final String GOOD_MORNING = "good morning";
}

public class FinalTest {

	public static void main(String[] args) {
		// Final 예약어
		// final 변수는 값이 변경될 수 없는 상수이다.(=const와 비슷한 개념)
		// 예) public static final double pi = 3.14
		// 재할당할 수 없다. pi = 3.0 (X)
		// final a = 20;
		// final 메소드는 하위 클래스에 재정의 할 수 없다.
		// final 클래스는 상속되지 않는다.
		// final 선언과 동시에 할당하거나 또는 생성자에서 한번만 할당가능
		
		//static 키워드로 작성된 변수는 인스턴스하지않고 접근가능함.
		System.out.println(define.GOOD_MORNING);
		System.out.println("영어과목 코드는 "+define.ENG+"입니다.");
		System.out.println("수학과목 코드는 "+define.MATH+"입니다.");
		
		//define.PI = 3.1; X
		//final로 선언되었기때문에 재할당이 안됨
		
		double num = define.PI * 1000;
		System.out.println(num);

	}

}
