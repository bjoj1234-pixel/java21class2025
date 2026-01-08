package classpart08;

public class ot_ClassEx11 {
	String name = "";
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore = { 92, 38, 87, 100, 11};
	int maxindex;
	int minindex;
	
	public ot_ClassEx11() {};
	
	//전교성적 출력
	public void choice1() {
		for(int i=0; i<arHakbun.length; i++) {
			System.out.println((i+1)+"."+arHakbun[i]+"학번("+arScore[i]+"점)");
		}
	};
	
	//전교1등 성적출력
	public void choice2() {
		int maxScore = 0;
		
		for(int i=0; i<arHakbun.length; i++) {
			if(maxScore < arScore[i]) {
				maxScore = arScore[i];
				maxindex = i;
			}
		}
		System.out.println("1등 학생 : " + arHakbun[maxindex] + "학번(" + arScore[maxindex] + "점)");
	}
	
	//전교 꼴등 성적출력
	public void choice3() {
		int minScore = arScore[0];//최소값
		
		for(int i=0; i<arScore.length; i++) {
			if(minScore > arScore[i]) {
				minScore = arScore[i];
				minindex = i;
			}
		}
		System.out.println("꼴등 학생 : " + arHakbun[minindex] + "학번(" + arScore[minindex] + "점)");
	}
	
	//성적확인
	public void choice4(int hakbun) {
		int chk = -1;		
			
		for(int i=0; i<arScore.length; i++) {
			if(hakbun == arHakbun[i]) {
				chk = i;
				break;
			}
		}
		//학번이 없으면 예외처리
		if(chk == -1) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}else {
			System.out.println(arHakbun[chk]+"학번 성적 : "+arScore[chk]+"점");
		}
	}	
}
