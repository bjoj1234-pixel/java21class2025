package diExample02;

import diExample.Ical;

public class GreetingService{
	public void print(String name,Greeting greet) {
		String msg = greet.hello(name);
		System.out.println(msg);
	};

}
