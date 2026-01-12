package formatExample;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NumbEx {

	public static void main(String[] args) {
		// NumberFormat => 숫자를 원하는 형식으로 출력하는 클래스
		// NumberFormat는 new 예약어를 통한 객체를 생성하지 않는다.
		// 예)NumberFormat nf = NumberFormat.getInstance();
		//   => 결과는 천단위마다 ,(콤마)를 출력하는 메소드이다.
		Scanner scan = new Scanner(System.in);
		double number;
		
		NumberFormat num1 = NumberFormat.getInstance(); //인스턴스화
		
		System.out.println("값을 입력 :");
		number = scan.nextDouble();
		// 출력방식 num1.format(입력받은값)
		System.out.println(num1.format(number));
		// NumberFormat의 값 출력 메소드는 : 참조변수.format(값)
		System.out.println(num1);
		//java.text.DecimalFormat@674dc => 현재 num1의 참조주소 => Heap주소 => Heap안에 값이 존재함
		//반드시 접근할 수 있는 메소드를 선택해야 한다.
		
		
		NumberFormat num2 = NumberFormat.getNumberInstance();
		NumberFormat num3 = NumberFormat.getCurrencyInstance(Locale.KOREA);
		NumberFormat num4 = NumberFormat.getPercentInstance();
		NumberFormat num5 = NumberFormat.getIntegerInstance();
		
		//천단위마다 구분기호 ,(콤마)를 출력
		System.out.println(num2.format(number));
		//통화기호 ￦와 .(콤마)를 출력
		System.out.println(num3.format(number));
		//백분율로 출력 단 1200이면 => 120,000%
		System.out.println(num4.format(number));
		//실수를 반올림하여 정수로 출력 
		System.out.println(num5.format(number));
		

	}

}
