package classpart08;

public class ClassEx07 {
	String name = "";
	//계좌
	String[] arAcc = {"1111", "2222", "3333", "4444", "5555","","","","",""};
	//비번
	String[] arPw = {"1234", "2345", "3456", "4567", "5678","","","","",""};
	int[] arMoney = {87000, 34000, 17500, 98000, 12500,0,0,0,0,0};
	int count = 5;
	// 3333 로그인 중
	int loginCheck = -1;
	//로그인된 계좌
	String loginAcc;	
	//로그인 인덱스
	int loginIndex;
	//은행이름
	String bankName;
	
	
	
	public ClassEx07() {};
	
	//계좌,비번 출력
	public void print() {
		System.out.println("----------------------");
		System.out.println("계좌번호	비밀번호	계좌잔액");
		System.out.println("----------------------");
		for(int i=0;i<arAcc.length;i++) {
			if(!arAcc.equals("") && arMoney[i] != 0) {
				System.out.printf("%s	%s	%d%n",arAcc[i],arPw[i],arMoney[i]);
			}
		}
		System.out.println("----------------------");
	}
	
	//메뉴출력
	public void menu() {
		System.out.println("[1]회원가입");
		System.out.println("[2]로그인");
		System.out.println("[3]로그아웃");
		System.out.println("[4]입금");
		System.out.println("[5]이체");
		System.out.println("[6]잔액조회");
		System.out.println("[0]종료");
	}
	
	//회원가입
	public void join(String ac,String pw,int money) {
		int index=0; //빈배열 인덱스
		
		for(int i=1;i<arAcc.length;i++) {
			if(!(arAcc[i-1].equals("")) && arAcc[i].equals("")) {
				index = i;
				break;
			}			
		}	
		arAcc[index] = ac;
		arPw[index] = pw;
		arMoney[index] = money+1000; //회원가입시 1000원 추가		
	} 
	
	//로그인
	public void login(String ac,String pw) {
		boolean log = true;
		
		for(int i=0;i<arAcc.length;i++) {
			if(arAcc[i].equals(ac) && arPw[i].equals(pw)) {
				loginAcc = ac;
				loginIndex = i;
				log = true;
			}
		}
		
		if(log == true) {
			loginCheck = 0;
			System.out.println("로그인 성공");
		}else {
			loginCheck = -1;
			System.out.println("계좌 혹은 비밀번호가 틀렸습니다.");
		}
	
	}
	
	//입금
	public void deposit(int money) {
		arMoney[loginIndex] += money;
	}
	//이체
	public void transfer(String acc, int money) {
		int index2=0;
		
		for(int i=0;i<arAcc.length;i++) {
			if(arAcc[i].equals(acc)) {
				index2 = i;
			}
		}
		
		arMoney[index2] += money;		
	}

	
	
}






















