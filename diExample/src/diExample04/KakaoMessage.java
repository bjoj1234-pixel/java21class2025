package diExample04;

public class KakaoMessage implements Message{
	@Override
	public String send(String name, String greet) {
		String msg = name + "에게 "+greet+"를 카카오톡으로 전송";
		return msg;
	}

}
