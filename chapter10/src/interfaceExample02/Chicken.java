package interfaceExample02;

public class Chicken implements Animal{
	String name="닭";
	String bab;
	String move;
	String zzz;
	
	
	public Chicken() {	}

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
