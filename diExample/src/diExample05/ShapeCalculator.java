package diExample05;

public class ShapeCalculator {
	public void calcResult(Shape sh) { //DI => @AutoWride
		String msg = sh.name()+"의 면적: "+sh.calc();
		System.out.println(msg);
	}
}
