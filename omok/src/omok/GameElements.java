package omok;

public class GameElements {
	//오목테이블
	String[][] Otable = new String[13][13];
	//검은돌
	String black = "●";
	//흰돌
	String white = "○";
	
	public GameElements() {
		for(int i=0;i<Otable.length;i++) {
			for(int j=0;j<Otable[i].length;j++) {
				Otable[i][j] = "-";
			}			
		}
	};
	
	//둔자리 저장
	public void place(int horizon, int vertical, String doll) {
		Otable[horizon][vertical] = doll;
	};

	
}
