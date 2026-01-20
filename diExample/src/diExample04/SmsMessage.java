package diExample04;

public class SmsMessage implements Message{
	@Override
	public String send(String name, String greet) {
		String msg = name + "에게 "+greet+"를 SMS로 전송";
		return msg;
	}

}
