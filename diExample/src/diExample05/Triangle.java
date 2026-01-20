package diExample05;

public class Triangle implements Shape{
	double width;//가로
	double height;//새로
	
	public Triangle(double width,double height) {
		this.width=width;//가로
		this.height=height;//새로
	}
	
	@Override
	public double calc() {
		double result = (width * height)/2;
		
		return result;	
	}
	
	@Override
	public String name() {
		String name = "삼각형";
		
		return name;		
	};


}
