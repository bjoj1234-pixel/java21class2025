package mapTest;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		// StringTokenizer 클래스는 문자와 문자 사이의 구분자를
		//기준으로 문자를 분리하는 클래스이다.
		String str1 = "java android";
		String str2 = "java!android";
		String str3 = "java!andr oid-fun";
		
		//StringTokenizer도 객체이므로 반드시 import해야함 
		StringTokenizer st1 = new StringTokenizer(str1);//공백을 기준으로 분리시켜 출력함
		
		System.out.println(st1.nextToken());
		System.out.println(st1.nextToken());
		
		System.out.println("-----------");

		StringTokenizer st2 = new StringTokenizer(str2,"!");//"!"를 기준으로 분리시켜 출력함
		for(int i=0; i<2; i++) {
			System.out.println(st2.nextToken());
		}
		System.out.println("-----------");
		
		StringTokenizer st3 = new StringTokenizer(str3,"! -");//"!"와 공백과 "-"를 기준으로 분리시켜 출력함 
		for(int i=0; i<3; i++) {
			System.out.println(st3.nextToken());
		}
		System.out.println("-----------");
		
		StringTokenizer st4 = new StringTokenizer(str2,"!",true); //"!"를 제외하지않고 출력함 
		for(int i=0; i<3; i++) {
			System.out.println(st4.nextToken());
		}
		System.out.println("-----------");
		
		
		
	}

}
