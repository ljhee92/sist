package day0123;

import java.util.ArrayList;
import java.util.List;

/**
 *  모든 JDK 버전에서는 Generic 없이 List를 생성하고 사용할 수 있다. 
 */

public class UseList {
	
	@SuppressWarnings({ "rawtypes", "unused" })
	public UseList() {
		
		// Generic을 사용하지 않고 생성 -> 모든 값을 추가할 수 있다. -> 권장하지 않는다.
		// 1. 생성) is a 관계로 객체화
		List list = new ArrayList();	// ArrayList(30); -> 배열의 길이 설정도 가능
		
		// 2. 값 할당)
		list.add(100);	// 100은 기본형 => autoboxing(객체로 감싸짐)되어 object인 매개변수에 들어감
		list.add(200);
		list.add(200);	// 중복 값 저장 가능
		list.add(300);
		list.add(1.23);	// 아무 값이나 입력하면
		list.add("안녕");
		list.add(true);
		
		System.out.println(list + " / " + list.size());
		
		// 3. 값 얻기
		for(int i = 0; i < list.size(); i++) {
			// 사용하는 쪽에서 에러가 날 수 있다.
//			System.out.println((int)list.get(i)*10);
			System.out.println(list.get(i));
		}	// end for
		
		System.out.println("----------------------------------------");
		
		
		// Generic의 사용: 입력 데이터형을 제한 (기본형 데이터형은 제네릭 사용 불가) -> 권장!
		List<Integer> list2 = new ArrayList<Integer>();
		
		// 값 할당)
		list2.add(2024);				// autoboxing -> list2.add(Integer.valueOf(2024));가 숨어있다.
		list2.add(new Integer(1));		// 생성자 사용은 JDK9부터 비추천
		list2.add(Integer.valueOf(23));	// 대신 valueOf() method 사용 권장
//		list2.add("안녕");				// 지정된 데이터형만 입력 가능
		
		// 값 얻기)
		int i = list2.get(0);				// unboxing -> list2.get(0).intValue();
		int i2 = list2.get(1);				// unboxing -> list2.get(1).intValue();
		int i3 = list2.get(2).intValue();	// 개발자가 직접 해줌
		System.out.println(i + " / " + i2 + " / " + i3);
		
		for(int j = 0; j < list2.size(); j++) {
			System.out.println(list2.get(j)*10);
		}	// end for
		
	}	// UseList

	
	public static void main(String[] args) {
		new UseList();
	}	// main 

}	// class