package interfaceExample02;


public class UserMain {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal chicken = new Chicken();
		Animal monkey = new Monkey();

		
		
		cat.eat("생선");
		cat.work("네발");
		cat.sleep("엎드려서");
		
		chicken.eat("사료");
		chicken.work("두발");
		chicken.sleep("서서");
		
		monkey.eat("과일");
		monkey.work("네발 또는 두발");
		monkey.sleep("누워서");
		
		
		
		

	}

}
