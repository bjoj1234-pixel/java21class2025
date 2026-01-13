package inheritance3;

public class ColorTV extends TV{
	protected int res;
	
	public ColorTV() {};
	
	public ColorTV(int size, int res) {
		super.size = size;
		//혹은 size = size; 이렇게 해도된다.
		//extends를 썼기때문에 super안쓰고 그냥 불러올수있음.
		this.res = res;
	};
	
	public void printProperty() {	
		System.out.println(size+"인치"+res+"컬러");
	}
}
