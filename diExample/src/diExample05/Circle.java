package diExample05;

public class Circle implements Shape{
	final double pi = 3.14;//파이
	double radius;//반지름
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calc() {
		double result = (double) radius * radius * pi;
		
		return result;	
	}
	
	@Override
	public String name() {
		String name = "원";
		
		return name;		
	};

}
