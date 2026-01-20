package diExample02;

public class JapaneseGreeting implements Greeting{
	@Override
	public String hello(String name) {
		String st = "こんにちは ["+name+"]さん!";
		return st;
	};
}
