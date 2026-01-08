package classpart05;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		ClassEx05 ex5 = new ClassEx05();
		
		//정답 출력
		System.out.println("answer = "+ Arrays.toString(ex5.answer));
		//hgd 랜덤저장
		ex5.random();
		//hgd출력
		System.out.println("hgd = "+Arrays.toString(ex5.hgd));
		//채점(정오표)
		ex5.mark();
		//정오표 출력
		System.out.println("정오표 = "+Arrays.toString(ex5.mark));
		//성적계산
		ex5.score();
		//성적출력
		System.out.println("성적 : "+ex5.score());
		
	}

}
