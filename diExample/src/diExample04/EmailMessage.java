package diExample04;

public class EmailMessage implements Message {
	@Override
	public String send(String name, String greet) {
		String msg = name + "에게 "+greet+"를 이메일로 전송";
		return msg;
	}
}
