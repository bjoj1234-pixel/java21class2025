package abstractTest;

public class DeskTop extends Computer{

	@Override //부모 메소드를 상속받아 재정의 한다.라는 의미이다.
	public void display() { //Computer로부터 추상메소드를 상속받는 순간 일반메소드화됨
		System.out.println("DeskTop display()---");		
	}

	@Override
	public void typing() {//Computer로부터 추상메소드를 상속받는 순간 일반메소드화됨
		System.out.println("DeskTop typing()---");		
	}
	
}
