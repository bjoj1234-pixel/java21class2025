package classpart05;

import java.util.Random;

public class ClassEx05 {
	Random ran = new Random();
	//정답
	int[] answer = {1,3,4,2,5};
	//hgd
	int[] hgd = new int[5];
	//채점배열
	String[] mark = new String[5];

	//객체화
	public ClassEx05() {};
	
	//hgd배열 랜덤저장
	public int[] random() {
		for(int i=0; i<hgd.length; i++) {
			hgd[i] = ran.nextInt(5)+1;//1~5숫자 랜덤저장
		}
		return hgd;//hgd 배열 저장후 반환
	}
	
	//채점
	public String[] mark() {
		for(int i=0; i<answer.length; i++) {
			if(answer[i]==hgd[i]) {
				mark[i] = "O";
			}else {
				mark[i] = "X";
			}
		}
		return mark; //정오표 배열 반환
	}
	
	//성적계산(하나에 20점)
	public int score() {
		int score = 0; //성적
		
		for(int i=0; i<mark.length; i++) {
			if(mark[i]=="O") {
				score += 20;
			}
		}
		return score;
	}
	
		//확장 for문 
		//for(자료형 변수 :배열){실행문;}
		//확장 for문의 장점
		//1.index를 사용하지 않는다
		//2.코드가 짧다
		//3.요소를 하나씩 처리한다
		
		//int[] answer = {1,3,4,2,5};
		//answer 배열에서 값을 하나 꺼내서 n에 담고 출력
		//배열이 끝날때까지 계속 순회한다.
		//단,index를 가져올수 없기때문에 배열방의 값을
		//비교할때는 사용불가한다.
		
//		for(int n : answer)
//			System.out.print(n+" ");
		
	
	
}
