package diExample02;

public class KoreanGreeting implements Greeting{
	public String hello(String name) {
		String st = "안녕하세요,["+name+"]님!";
		return st;
	};

}
