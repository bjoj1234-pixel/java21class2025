package classpart01;

public class Ex01 {
	//멤버변수는 배열도 작성할 수 있다.
	//클래스는 데이터, 기능만 작성
	//main()메소드는 출력을 담당
	int[] arr = {87,100,11,72,92};
	
	//public Ex01() {}
	
	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		//문제 1) 전체 합 출력
		//정답 1) 362
		int total=0;
		for(int i=0;i<ex.arr.length;i++) {
			total += ex.arr[i];
		}
		System.out.println("전체 합 출력 : "+total);
	}
}
