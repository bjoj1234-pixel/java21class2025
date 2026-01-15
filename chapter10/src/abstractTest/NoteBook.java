package abstractTest;

//상속받은 부모 추상 클래스(Computer)에서 필요한 추상 메소드만 사용할때는
//상속받는 클래스(Notebook)에도 abstract를 붙여줘야한다.
public abstract class NoteBook extends Computer{	
	
	@Override
	public void display() { //Computer로부터 추상메소드를 상속받는 순간 일반메소드화됨
		System.out.println("Notebook display()---");
	}


	
}
