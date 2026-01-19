package exceTest;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		//Exception 및 하위 클래스를 이용해서 예외처리를
		//다양하게 할 수 있다.
		Scanner scan = new Scanner(System.in);
		
		int i=0;
		int j=0;
		// 자료구조 => 선형 자료구조(자료를 가로로 저장..)
		int[] iarr = new int[5];
		// ArrayList<>는 List<> 하위클래스이다.
		// 고로 List<>로 업캐스팅 할 수 있다.
		// 자료구조 => 선형자료구조
		List<Integer> list = new ArrayList<Integer>();
		
		//try{} catch(){} catch(){} .. finally{}
		
		try{
			//실행구문
			System.out.println("input i:");
			i = scan.nextInt();
			System.out.println("input j:");
			j = scan.nextInt();
			System.out.println("(i/j) :"+(i/j));
			
			for(int k=0; k<6; k++) {
				System.out.println("iarr["+k+"]"+iarr[k]);
			}
			System.out.println("List size :"+list.size());
			
		//실행구문 오류가 있을때 catch()로 넘겨라
		}catch(InputMismatchException e){			
			e.printStackTrace(); //빨간색으로 에러에 해당하는 줄 링크까지 제공
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e); // 에러명과 에러내용만 출력해줌
			System.out.println(e.getMessage()); //에러내용만 출력해줌
//			System.out.println("배열의 길이 오류");
			//--> 이런식으로 본인이 알아듣게 적어줘도됨
		}catch(Exception e){
			// Exception은 최상위 클래스로서,
			// catch() 하나일때는 사용가능
			// 단,catch() 구문이 여러개일때는 맨아래 써줘야됨
			e.printStackTrace();
			System.out.println("숫자를 입력하세요");			
		}finally{
			//오류의 존재 유무와 상관없이 무조건 출력됨
			System.out.println("end");
		}
		
		

	}

}
