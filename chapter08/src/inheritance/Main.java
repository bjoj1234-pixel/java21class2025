package inheritance;

public class Main {

	public static void main(String[] args) {
		//부모, 자식 클래스 모두 객체화
		ParentClass p = new ParentClass();
		ChildClass c = new ChildClass();
		//부모클래스의 기본 생성자는 자식클래스보다 먼저 컴파일러가 불러옴 
		//없으면 자동으로 생성해준다. 
		//단, 부모의 디폴트 생성자가 존재하지 않는경우 컴파일러는
		//자동생성 하지 않는다.
		c.childfun();
		//c.parentfun() 메소드를 접근 가능한 이유는
		//ChildClass클래스가 ParentClass를 상속 받았기 때문이다.
		
		c.parentfun();//출력값:25,20		
		
		p.parentfun();//출력값:10,20
		//"참조변수(c와p)"가 다르기때문에, 메모리(힙)에 저장된 값도 다르게 나온다. 값이 공유되는게 아니라 따로따로
		
		System.out.println(c.a); //10
		System.out.println(c.b); //20 

	}

}
