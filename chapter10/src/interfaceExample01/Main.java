package interfaceExample01;

import java.util.ArrayList;

public class Main{

	public static void main(String[] args) {
		Buyable tv = new Television("MV-2020", "TV-samsung", 50000);
		Buyable re = new Refrigerator("MV-1111", "1등급", 2000000);
		
		Buyable[] by = {tv,re};
		for(int i=0; i<by.length; i++) {
			System.out.println("----"+by[i].getName()+"정보-----");
			System.out.println(by[i].getMaker());
			System.out.println(by[i].getModel());
			System.out.println(by[i].getPrice());
		}
		
		
		
		
		

	}

}
