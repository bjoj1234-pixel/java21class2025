package diExample04;

public class MessageSender {
	public void sendMsg(String name, String greet, Message message) {
		String msg = message.send(name, greet);
		System.out.println(msg);
	}

}
