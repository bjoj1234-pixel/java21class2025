package classpart08;

import java.util.Scanner;

public class MainClass10 {

	public static void main(String[] args) {
		ClassEx10 ex10 = new ClassEx10();
		
		int[] x = new int[5];
		
		ex10.test(x);//학생점수

		System.out.println("학생총점: "+ex10.total(x));
		
		System.out.println("학생전체평균: "+ex10.avg(ex10.total(x),x.length));
		
		System.out.println("1등점수: "+ex10.first(x));
		
		System.out.println("꼴등점수: "+ex10.last(x));
		
		
	}

}
