package multiExample;

public class MultiArrayEx01 {

	public static void main(String[] args) {
		//2차원 배열 기본문제[1단계]
		int[][] arr = new int[3][3];
		int count=1;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(10*count + " ");
				count++;
			}
			System.out.println();
		}
		
		
		int count=1;
		int total = 0; // 전체합
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				
				total += 10*count;
				count++;
			}
		}
		System.out.println("전체합:" + total);
		
		int count=1;
		int gop = 0;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {				
				gop = 10*count;
				count++;
				if(gop%4==0) {
					System.out.print(gop+" ");
				}
			}
		}
		
		int count=1;
		int gop = 0;
		int total = 0;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {				
				gop = 10*count;
				count++;
				if(gop%4==0) {
					total += gop;
				}
			}
		}
		
		System.out.printf("4의 배수의 합: %d",total);
		
		
		
	}

}
