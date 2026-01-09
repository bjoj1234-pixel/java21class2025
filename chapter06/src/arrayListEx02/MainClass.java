package arrayListEx02;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {		
		Scanner scan =  new Scanner(System.in);
		//Student클래스를 ArrayList<>로 생성한다.
		ArrayList<Student> list = new ArrayList<Student>();
		
		int cnt = 0;//while문 돌리기위한 변수
		
		while(cnt<3) {
			Student sName = new Student();
			System.out.println("학생이름을 입력하세요");
			//Student 클래스의 name멤버 변수에 접근
			sName.name = scan.next();
			
			//과목2개 입력
			for(int i=0;i<2;i++) {
				//subject 클래스를 인스턴스화하여 멤버변수에 접근
				Subject subject = new Subject();
				
				System.out.println("과목명 입력: ");
				subject.sub = scan.next();
				
				System.out.println("점수 입력: ");
				subject.score = scan.nextInt();
				
				//입력받은 과목,점수를 Student 클래스에 add
				sName.sublist.add(subject);
				
			}
			//list에 학생 추가되어야함
			list.add(sName);
			cnt++;
		}	
		//출력
		System.out.println("===== 학생 성적 출력 =====");
		for(int i=0;i<list.size();i++) {
			//Student s : 데이터타입이 Student
			Student s = list.get(i);
			System.out.println("학생이름: "+s.name);
			
			for(int j=0;j<s.sublist.size();j++) {
				Subject sub = s.sublist.get(j);
				System.out.println("과목명 : "+sub.sub+"점수 : "+sub.score);
			}
			System.out.println();

		}
	}

}

