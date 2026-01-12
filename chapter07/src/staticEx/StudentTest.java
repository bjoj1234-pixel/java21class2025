package staticEx;

import privateEx.PrivateTest;

public class StudentTest {

	public static void main(String[] args) {
		Student st01 = new Student();//인스턴스화
		//System.out.println(st01.serialNum);
		
		//System.out.println(Student.serialNum);
		// static으로 작성된 클래스 변수는 굳이 클래스(st01)를 지정하지 않고
		// 데이터타입(Student)를 지정하면 쓸수있다.(인스턴스 하지 않아도 됨)
		
		Student st02 = new Student();
		//st02.serialNum++; //1증가
		
		//아무리 st02 참조변수 생성 다음에 serialNum을 누적해도
		// 데이터 메모리 영역에서 값을 모든 참조변수에 공유하고 있다.
		
		//System.out.println(st01.serialNum);
		//System.out.println(st02.serialNum); //01과 02 둘다 증가함
		System.out.println("st03 참조변수 ====");
		
		Student st03 = new Student();
		System.out.println(st01.studentId);
		System.out.println(st02.studentId);
		System.out.println(st03.studentId);
		
		System.out.println("serialNum 값은 공유됨");
		System.out.println(st01.serialNum);
		System.out.println(st02.serialNum);
		System.out.println(st03.serialNum);
		//static 변수인 serialNum은 1씩 증가하여 st01,02,03이 모두 동일하나, studentId는 각각 다름
		
		
		//static 클래스 변수는 인스턴스화 하지 않아도 접근 할 수 있다.
		System.out.println(Student.serialNum);	
		
		PrivateTest pit = new PrivateTest();
		System.out.println(pit.day = 10);
		
		
	}

}
