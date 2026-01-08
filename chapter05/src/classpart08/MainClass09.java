package classpart08;

public class MainClass09 {

	public static void main(String[] args) {
		ClassEx09 ex9 = new ClassEx09();
		
		int x = 3;
		int y = 4;
		
		System.out.println("더하기: "+x+"+"+y+" = "+ex9.sum(x, y));
		System.out.println("빼기: "+x+"-"+y+" = "+ex9.minus(x, y));
		System.out.println("곱하기: "+x+"*"+y+" = "+ex9.multi(x, y));
		System.out.println("나누기: "+x+"/"+y+" = "+ex9.div(x, y));

	}

}