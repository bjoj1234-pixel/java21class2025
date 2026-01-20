package diExample02;

public class Main {

	public static void main(String[] args) {
		GreetingService gs = new GreetingService();
		gs.print("홍길동", new KoreanGreeting());
		gs.print("jenny", new EnglishGreeting());
		gs.print("にちは", new JapaneseGreeting());

	}

}
