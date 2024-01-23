package day0123;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UseSet {
	
	public UseSet() {
	
		// 1. 생성
		Set<String> set = new HashSet<String>();
		
		// 2. 값 할당 - 입력되는 값은 순차적으로 입력되지 않는다.
		set.add("루피");
		set.add("쵸파");
		set.add("조로");
		set.add("나미");
		set.add("에이스");
		set.add("윤웅찬");
		set.add("김병년");
		
		// 3. 중복값은 입력되지 않는다.
		set.add("루피");
		set.add("나미");
		
		// 4. 배열로 복사
		String[] arr = new String[set.size()];	// Set의 크기만큼 빈 배열을 생성
		set.toArray(arr);						// 배열로 복사
		for(String value :arr) {				// 배열의 값 출력
			System.out.print(value + " ");
		}	// end for
		System.out.println();
		
		// 5. 값 삭제
//		set.remove("에이스");
//		set.clear();
		
		System.out.println("----------------------------");
		
		// 6. 값 얻기(검색) - get() method 없음, Iterator를 사용
		// - Iterator에 set의 제어권을 할당 (StringTokenizer와 동일한 역할)
		Iterator<String> ita = set.iterator();
		
		// 다음 요소가 존재하는지 판단
//		System.out.println(ita.hasNext());	// 다음 요소가 존재하니?
//		System.out.println(ita.next());		// 있다면 포인터를 다음으로
//		System.out.println(ita.hasNext());	// 요소가 몇 개 있는지는 모르겠지만
//		System.out.println(ita.next());		// 없을 때까지 출력 반복 -> while문 사용
//		System.out.println(ita.hasNext());
//		System.out.println(ita.next());
//		System.out.println(ita.hasNext());
//		System.out.println(ita.next());
//		System.out.println(ita.hasNext());
//		System.out.println(ita.next());
//		System.out.println(ita.hasNext());
//		System.out.println(ita.next());
//		System.out.println(ita.hasNext());
//		System.out.println(ita.next());
//		System.out.println(ita.hasNext());
		
		String temp = "";
		while(ita.hasNext()) {
			temp = ita.next();
			System.out.println(temp);
		}	// end while
		
		System.out.println(set + " / " + set.size());
		
	}	// UseSet

	public static void main(String[] args) {
		new UseSet();
	}	// main

}	// class