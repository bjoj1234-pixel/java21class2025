package inheritance;

public class ParentClass {
	//부모 클래스
	//부모-자식 상속관계일때는 private X
	//protected를 써서 은닉하고 get,set사용가능
	protected int a = 10;
	protected int b = 20;
	
	public ParentClass() {
		System.out.println("== parent 생성자 ==");
	};

	//매개변수가 있는 생성자의 경우 디폴트 생성자가 없으면 오류뜸(부모를 불러울 경우만)
	public ParentClass(int a, int b) {
		this.a = a;
		this.b = b;
	};
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void parentfun() {
		System.out.println("== parentfun ==");
		System.out.println("부모 :"+a+","+b);
	};
}
