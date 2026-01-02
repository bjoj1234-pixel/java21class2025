package example;

import java.util.*;//모든 import 가능

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = {87, 11, 45, 98, 23};
		int index = 0;
		
		
		System.out.println("인덱스 입력: ");
		int inputNum = scan.nextInt();
		System.out.printf("성적: %d점%n",arr[index]);
		
		System.out.println("성적 입력: ");
		int inputNum02 = scan.nextInt();
				
		for(int i=0;i<arr.length;i++) {
			if(arr[index] == inputNum02 && index <arr.length) {
				System.out.printf("인덱스: %d",index);
			}else {
				System.out.printf("잘못입력");
				break;
			}
			index++;
		}
		
	}

}