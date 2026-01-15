package scheduler;

import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) {
		//Scanner 입력 L,P,R		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("전화 상담 배분 방식을 선택하세요 : R,L,P");
		// R 또는 r, P 또는 p, L 또는 l 입력시 대소문자 상관없이 실행
		String ch = scan.next();
		
		Scheduler sch = null; //업캐스팅
		
		if("R".equals(ch) || "r".equals(ch)) {
			sch = new RoundRobin();
		}else if("P".equals(ch) || "p".equals(ch)) {
			sch = new priorityAllocation();
		}else if("L".equals(ch) || "l".equals(ch)) {
			sch = new LeastJob();
		}else {
			System.out.println("지원하지 않는 기능");
			return;
		}
		
		sch.getNextCall();
		sch.sendCallToAgent();
		sch.getLunch();
	}

}
