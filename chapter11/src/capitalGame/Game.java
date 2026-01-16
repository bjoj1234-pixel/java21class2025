package capitalGame;

import java.util.HashMap;
import java.util.Map;

public class Game {
	Map<String,String> list = new HashMap<String, String>();
	
	private	String[] nation = {"프랑스","일본","브라질","캐나다","호주","이집트","케냐","스웨덴"};
	private String[] city = {"파리","도쿄","브라질리아","오타와","캔버라","카이로","나이로비","스톡홀름"};
	
	public Game() {
		for(int i=0;i<nation.length;i++) {
			list.put(nation[i], city[i]);
		}
	};
	

	public String[] getNation() {
		return nation;
	}


	public String[] getCity() {
		return city;
	}



}
