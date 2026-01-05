package multiExample;

import java.util.Scanner;

public class MutiArrayEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int count=1;
		int gop = 0;
		int total = 0;
		
//		System.out.println("인덱스1 입력: ");
//		int idx1 = scan.nextInt();
//		System.out.println("인덱스2 입력: ");
//		int idx2 = scan.nextInt();

		
//		for(int i=0; i<arr.length;i++) {
//			for(int j=0; j<arr[i].length;j++) {
//				gop = 10*count;
//				
//				if(i == idx1 && j == idx2) {
//					System.out.printf("값 출력: %d",gop);
//				
//				}
//				count++;
//			}
//		}
		
		System.out.println("인덱스1-1 입력: ");
		int idx1_1 = scan.nextInt();
		System.out.println("인덱스1-2 입력: ");
		int idx1_2 = scan.nextInt();
		
		System.out.println("인덱스2-1 입력: ");
		int idx2_1 = scan.nextInt();
		System.out.println("인덱스2-2 입력: ");
		int idx2_2 = scan.nextInt();
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = 10*count;
				
				count++;
			}
		}

		int a = arr[idx1_1][idx1_2];
		int b = arr[idx2_1][idx2_2];
		
		arr[idx2_1][idx2_2] = a;
		arr[idx1_1][idx1_2] = b;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}
}
















