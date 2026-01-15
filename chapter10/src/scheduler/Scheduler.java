package scheduler;

public interface Scheduler {
	void getNextCall(); //다음 고객의 call을 가져오는 메소드
	void sendCallToAgent();//상담원에게 call을 배분하는 메소드
	void getLunch();//
}
