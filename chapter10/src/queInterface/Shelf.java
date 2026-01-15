package queInterface;

import java.util.ArrayList;

public class Shelf {
	//멤버변수
	protected ArrayList<String> shelf;
	
	public ArrayList<String> getShelf() {
		return shelf;
	}

	//생성자
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	//문자 개수 출력하는 메소드
	public int getCount() {
		return shelf.size();
	}
}
