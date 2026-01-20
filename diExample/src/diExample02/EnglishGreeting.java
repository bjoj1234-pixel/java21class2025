package diExample02;

public class EnglishGreeting implements Greeting {
	public String hello(String name) {
		String st = "Hello,["+name+"]!";
		return st;
	};
}
