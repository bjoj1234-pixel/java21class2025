package inheritance02;

public class FounctionPen extends BollPen{

	public FounctionPen() {};
	
	public FounctionPen(int r, int t, String n,String c) {
		super.residual=r;
		super.thickness=t;
		super.name=n;
		super.color=c;
	};
	
	@Override
	public void print() {
		super.print();		
	}
}
