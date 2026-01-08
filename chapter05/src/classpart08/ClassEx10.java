package classpart08;

import java.util.Random;

public class ClassEx10 {
	
	//학생점수
	public void test(int[] x) {
		Random ran = new Random();
		System.out.print("학생점수 : [ ");
		for(int i=0; i<x.length; i++) {
			x[i] = ran.nextInt(100)+1;
			System.out.print(x[i]+" ");
		}System.out.println("]");
	}
	//학생총점
	public int total(int[] x) {
		int total = 0;//총점
		
		for(int i=0; i<x.length; i++) {
			total += x[i];
		}
		return total;
	}
	//평균
	public double avg(int total, int length) {
		double avg = 0.0; //평균
		//명시적 형변환
		avg = (double)total/length;
		return avg;
	}
	//1등
	public int first(int[] x) {
		int first = x[0];
		
		for(int i=0; i<x.length; i++) {
			if(first <= x[i]) {
				first = x[i];
			}
		}
		return first;
	}
	
	//꼴등
		public int last(int[] x) {
			int last = x[0];
			
			for(int i=0; i<x.length; i++) {
				if(last >= x[i]) {
					last = x[i];
				}
			}
			return last;
		}
	
	
	
	
}
