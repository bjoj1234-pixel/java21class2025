package interfaceExample03;

public class Main {

	public static void main(String[] args) {
		Shape circle = new Circle(10);

		circle.redraw();
		circle.draw();
		System.out.println("면적은 "+circle.getArea());
	}

}
