package queInterface;

public class BookTest {

	public static void main(String[] args) {
		
		//업캐스팅
		Queue qshlef = new BookShelf();
		
		//문자삽입
		qshlef.inQueue("A");
		qshlef.inQueue("B");
		qshlef.inQueue("C");
		qshlef.inQueue("D");
		
		System.out.println(qshlef.deQueue());
		System.out.println(qshlef.deQueue());
		System.out.println(qshlef.deQueue());
		System.out.println(qshlef.deQueue());
	}

}
