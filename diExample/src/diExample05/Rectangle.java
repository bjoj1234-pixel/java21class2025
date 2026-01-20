package diExample05;

public class Rectangle implements Shape{
	double width;//가로
	double height;//새로
	
	public Rectangle(double width,double height) {
		this.width=width;//가로
		this.height=height;//새로
	}
	

	@Override
	public double calc() {
		double result = (double) width * height;
		
		return result;	
	}
	
	@Override
	public String name() {
		String name = "사각형";
		
		return name;		
	};

}
