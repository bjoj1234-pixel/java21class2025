package multiExample;

import java.util.Scanner;

public class MutiArrayEx04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = {
			{101, 102, 103},
			{201, 202, 203},
			{301, 302, 303}
		};
		int[][] pay = {
			{1000, 2100, 1300},
			{4100, 2000, 1000},
			{3000, 1600, 800}
		};
		//층별 관리비 합
//		int total;
//		for(int i=0; i<pay.length;i++) {
//			total =0;
//			for(int j=0; j<pay[i].length;j++) {
//				total += pay[i][j];
//			}			
//			System.out.print(total+" ");
//		}
//		System.out.println();
//		
//		System.out.println("호 입력:");
//		int ho = scan.nextInt();
//		int index1=0;
//		int index2=0;
//		
//		for(int i=0; i<apt.length;i++) {
//			for(int j=0; j<apt[i].length;j++) {
//				if(ho == apt[i][j]) {
//					index1=i;
//					index2=j;
//				}
//			}			
//		}
//		System.out.printf("관리비 출력: %d%n",pay[index1][index2]);
		
		int min_idx1=0;
		int min_idx2=0;
		int max_idx1=0;
		int max_idx2=0;
		
		for(int i=0; i<pay.length;i++) {
			for(int j=0; j<pay[i].length-1;j++) {
				if(pay[i][j] <= pay[i][j+1]) {
					max_idx1 = i;
					max_idx2 = j+1;
				}
				if(pay[i][j] >= pay[i][j+1]) {
					min_idx1 = i;
					min_idx2 = j+1;
				}
			}			
		}
		
		System.out.printf("가장 많이 나온집: %d%n",apt[max_idx1][max_idx2]);
		System.out.printf("가장 적게 나온집: %d%n",apt[min_idx1][min_idx2]);
	
	}

}
