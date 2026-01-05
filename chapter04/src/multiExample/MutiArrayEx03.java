package multiExample;

public class MutiArrayEx03 {

	public static void main(String[] args) {
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		};
		
		int count=1;
		int garo = 0;
		int sero = 0;
		
		//가로 합 출력
		for(int i=0; i<arr.length;i++) {
			garo = 0;
			for(int j=0; j<arr[i].length;j++) {
				garo += arr[i][j];			
			}
			System.out.print(garo+",");
		}
		
		System.out.println("");
		//세로 합 출력
		for(int i=0; i<arr[0].length;i++) {
			sero = 0;
			for(int j=0; j<arr.length;j++) {
				sero += arr[j][i];			
			}
			System.out.print(sero+",");
		}
		
		
		

	}

}
