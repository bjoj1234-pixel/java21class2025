package arrayListEx02;

import java.util.ArrayList;

public class Student {
	//학생 이름
	String name;
	
	//멤버 변수 ArrayList<Subject> sublist
	//ArrayList<Subject> sublist = new ArrayList<Subject>();
	ArrayList<Subject> sublist;
	
	//생성자
	public Student() {
		sublist = new ArrayList<Subject>();//한줄대신 이렇게 나눠써도 됨(이렇게 더 많이쓰인다함)
	};
	
}
