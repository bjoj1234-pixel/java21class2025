package inheritance02;

public class Main {

	public static void main(String[] args) {
		ShapPencil s = new ShapPencil(10,1,"ShapPencil");
		BollPen b = new BollPen(25,2,"BollPen","black");
		FounctionPen f = new FounctionPen(15,2,"FounctionPen","blue");

		s.print();
		b.print();
		f.print();
	}

}
