package interfaceExample03;

public class Circle implements Shape {
	int radius;//반지름
	final double pi =3.14;
	
	
	public Circle(int r) {
		this.radius=r;
	}
	
	@Override
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");
	}

	@Override
	public double getArea() {
		double area = radius*radius*pi;
		
		return area;
	}

}
