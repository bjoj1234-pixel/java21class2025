package classpart08;

public class ClassEx11 {
	String name = "";
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore = { 92, 38, 87, 100, 11};
	
	public ClassEx11() {};
	
	//전교성적 출력
	public void choice1() {
		for(int i=0; i<arScore.length; i++) {
			System.out.println((i+1)+"."+arHakbun[i]+"학번("+arScore[i]+"점)");
		}
	};
	
	//전교1등 성적출력
	public int choice2() {
		int first =  arScore[0];
		int f_index = 0;
		for(int i=0; i<arScore.length; i++) {
			if(first <= arScore[i]) {
				first = arScore[i];
				f_index = i;
			}
		}
		return f_index;
	}
	
	//꼴등 성적출력
	public int choice3() {
		int last =  arScore[0];
		int l_index = 0;
		for(int i=0; i<arScore.length; i++) {
			if(last >= arScore[i]) {
				last = arScore[i];
				l_index = i;
			}
		}
		return l_index;
	}
	
	//성적확인
	public int choice4(int num) {
		boolean pass = false; //학번이 있는지 확인을 위한 변수		
		int score = 0;
			
		for(int i=0; i<arHakbun.length; i++) {
			if(num == arHakbun[i]) {
				score = arScore[i];
				pass = true; //학번이 있으면 1증가
			}
		}
		//학번이 없으면 예외처리
		if(pass == false) {
			return -1;
		}
		return score;			
	}	
	
}
