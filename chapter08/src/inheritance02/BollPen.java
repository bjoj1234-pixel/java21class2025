package inheritance02;

public class BollPen extends ShapPencil{
	String color;
	
	public BollPen() {};
	
	public BollPen(int r, int t, String n,String c) {
		super.residual=r;
		super.thickness=t;
		super.name=n;
		this.color  = c;
	};
	
	@Override
	public void print() {
		super.print();
		System.out.println(", 색상: "+color);
		
	}
}
