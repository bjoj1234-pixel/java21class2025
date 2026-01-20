package diExample05;

public class Main {

	public static void main(String[] args) {
		ShapeCalculator sh = new ShapeCalculator();
		
		sh.calcResult(new Circle(2.2));
		sh.calcResult(new Rectangle(2.3,3.4));
		sh.calcResult(new Triangle(5.5,4.7));

	}

}
