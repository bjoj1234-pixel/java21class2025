package inheritance3;

public class IPTV extends ColorTV{
	String ip;
	
	public IPTV() {};
	
	public IPTV(String ip, int size, int res) {
		this.ip = ip;
		super.size = size;
		super.res = res;		
	};
	
	// @ 어노테이션 , Override => 재정의 하다라는 뜻
	// 재정의된 함수라는걸 표시해주는 의미
	// 메서드 이름이 부모것과 동일한데 새로 출력을 만들었기때문에 표시
	@Override
	public void printProperty() {
		System.out.print("나의 IPTV는 "+this.ip+"주소의 ");
		super.printProperty();
	}

}
