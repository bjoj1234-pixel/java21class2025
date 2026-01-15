package abstractTest;

//Notebook이 추상클래스가 되었으므로 이 클래스 또한 상속받아 쓸수있다.
public class MyNoteBook extends NoteBook{

	//그러나 Notebook에서 Computer로부터 받은 추상메소드(display())가
	//받는 순간 일반메소드로 바뀌기때문에,
	//Notebook에는 해당 메소드를 제외한 나머지(typing()) 메소드만 불러올수있게된다.
	@Override
	public void typing() {
		System.out.println("MyNoteBook typing()---");		
	}

}
