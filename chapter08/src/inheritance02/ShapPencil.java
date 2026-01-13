package inheritance02;

public class ShapPencil {
	int residual;
	int thickness;
	String name;
	
	public ShapPencil() {};
	
	public ShapPencil(int r, int t, String n) {
		this.residual=r;
		this.thickness=t;
		this.name=n;
	};
	
	public void print() {
		System.out.println(name+": 잔여량: "+residual+", 펜굵기: "+thickness);
	}
}
