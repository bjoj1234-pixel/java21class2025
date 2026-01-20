package diExample04;

public class Main {

	public static void main(String[] args) {
		MessageSender msgsend = new MessageSender();
		msgsend.sendMsg("홍길동","안녕하세요",new SmsMessage());
		msgsend.sendMsg("이진혁","뭐해?",new EmailMessage());
		msgsend.sendMsg("김민지","언제볼까",new KakaoMessage());

	}

}
