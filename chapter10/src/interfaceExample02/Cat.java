package interfaceExample02;

public class Cat implements Animal {
	String name="고양이";
	String bab;
	String move;
	String zzz;
	
	
	public Cat() {};

	@Override
	public void eat(String bab) {
		this.bab=bab;
		System.out.println(name+"는 "+bab+"을 먹어요");
	}

	@Override
	public void work(String move) {
		this.move=move;
		System.out.println(name+"는 "+move+"로 걸어요");		
	}

	@Override
	public void sleep(String zzz) {	
		this.zzz=zzz;
		System.out.println(name+"는 "+zzz+"자요");
	}

}
