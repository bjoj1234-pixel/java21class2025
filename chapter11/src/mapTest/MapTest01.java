package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest01 {

	public static void main(String[] args) {
		// Map<key, value> : 자바의 collection의 프레임워크 일종이다.
		// Map의 특징은 반드시 key(키), value(값)의 쌍으로 이루어져야 한다.
		// key(키)는 중복을 허용하지 않는다.
		// value(값)은 중복을 허용한다.
		// Map은 key(키)를 이용하여 value(값)을 저장하거나,
		// 검색, 삭제할 때 사용하면 유용하다.
		// Map의 종류 : HashMap, Hashtable, TreeMap, Properties...
		// Map 인터페이스 메소드 : put[키, 값] => 키와 값을 입력하는 메소드이다.
		// Map은 반드시 import 해야한다.
		// Map<K,V> => < >은 제네릭이라 한다.
		// Map<K,V> => K는 반드시 래퍼클래스(String, Intger, Double...)
		//			=> 또는 개발한 클래스 예)Member, Product, Cart...
		// HashMap은 Map의 하위 클래스이므로 데이터 타입을 부모인 Map로 업캐스팅 할 수 있다. 
		Map<String, String> list = new HashMap<String, String>();
		// 생성한 객체의 list를 부르는말 : 참조변수
		//HashMap<String, String> list02 = new HashMap<String, String>();
		//Map은 인터페이스 이므로 객체를 생성할 수 없다. 고로 아래 객체생성은 오류이다.
		//Map<String, String> list03 = new Map<String, String>();
		
		
		String[] key = {"a","b","k","d","e"};
		String[] value = {"apple","banana","candy","dog","enum"};
		
		for(int i=0;i<key.length;i++) {
			//list 참조변수에 put()메소드 사용 가능한 이유
			//=> HashMap 객체를 생성하고 데이터 타입은 Map이기때문에
			//Map 인터페이스의 메소드에 모두 접근할 수 있다.
			list.put(key[i], value[i]);
		}
		
		//출력
		//HashMap은 순서를 보장하지 않는다.
		//고로, 입력도 순서가 없고, 저장도 순서가 없다.
		//Map은 주소가 출력되지 않고 값이 바로나옴(주소는 메소드로 계산해야됨)
		//HashMap은 해시테이블에 저장된다.
		//HashMap은 비선형 자료구조이다.
		System.out.println(list); //{a=apple, b=banana, d=dog, e=enum, k=candy}

		
		//KeySet(), value()메소드 사용방법
		System.out.println("-----------");
		//key값출력
		System.out.println(list.keySet()); //[a, s, d, e, k]
		//value값출력
		System.out.println(list.values()); //[apple, banana, dog, enum, candy]
		
		//get() 메소드 => ()안에 현재 출력하고 싶은 key값 입력
		System.out.println("-----------");
		//list.get("k") => key값이 "k"에 해당하는 value값인 candy가 출력됨.
		System.out.println(list.get("k"));
		System.out.println(list.get(key[0]));
		
		// replace() : 키 값과 바꿀 값을 제공하면 해당 키의 값이 변경됨
		list.replace("k","code");
		System.out.println(list.get("k")); // candy->code로 바뀜
		
		// 이미 존재하는 같은 key에 해당하는 value를 새로운 값으로 덮어씌움.
		// 그러므로 사실상 replace()쓸 필요가 없음. put으로 해결됨
		list.put("k","candy"); 
		System.out.println(list.get("k"));
		
		//f,float 추가
		list.put("f","float");
		System.out.println(list);
		
		
		// containsKey(), containsValue() : 
		// => key나 value의 존재유무 => 결과는 true/false
		boolean isCheck;
		boolean isCheckV;
		isCheck = list.containsKey("x");
		System.out.println(isCheck);
		isCheckV = list.containsValue("apple");
		System.out.println(isCheckV);
		
		//remove(), clear()
		// => remove(제공한 key) : 제공한 키 값의 항목만 삭제
		// => clear() : 모두삭제
		
		list.remove("k");
		System.out.println(list); // k의 키와 값이 사라짐
		
		list.clear();
		System.out.println(list); // 모두 사라짐
		System.out.println("----------------");		
		for(int i=0;i<key.length;i++) {
			list.put(key[i], value[i]);
		}
		System.out.println("---- 확장 for문 이용 출력 ----");
		// 확장for문을 이용해 a : apple 형식으로 출력
		// key = {"a","b","c","d"}
		
		for(String l : list.keySet()) {
			System.out.println(l+": "+list.get(l));
		}
		
		System.out.println("---- Iterator() 메소드 ----");
		//collection 또는 Map에서 사용하는 객체 순회 메소드
		//Set<데이터타입>
		//keySet에 key를 모두넣음 ({a, b, d, e, k})
		Set<String> keyset = list.keySet();
		Iterator<String> ir = keyset.iterator();
		//ir = {a, b, d, e, k}
		while(ir.hasNext()) {//다음의 key가 존재하면 true, 아니면 false
			String k = ir.next();
			String v = list.get(k);
			System.out.println(k+": "+v);
		}
		
		
	}

}













