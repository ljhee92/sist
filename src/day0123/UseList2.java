package day0123;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *  ArrayList, Vector, LinkedList의 사용
 */

public class UseList2 {
	
	/**
	 *  동기화 처리가 되어있지 않으므로 여러 객체가 동시에 접근 가능. <br>
	 *  Vector보다 속도 빠름
	 */
	public void useArrayList() {
		
		// 1. 생성)
		List<String> list = new ArrayList<String>();
		
		// 2. 값 할당) 객체명.add(값)		// 가변 길이, 방의 크기가 늘어남
		list.add("Java");
		list.add("Oracle");
		list.add("JDBC");
		list.add("Java");
		list.add("HTML");
		list.add("CSS");
		
		// 두 번째 방 위치(JDBC)에 "자바"를 추가 (기존 요소 사이에 추가)
		list.add(2, "자바");
		
		// 3. 크기)
		System.out.println(list.size() + "개");
		
		// 4. 배열로 복사)
		// - 리스트의 크기대로 빈 배열을 생성
		String[] arr = new String[list.size()];
		// - 복사
		list.toArray(arr);
		
		// 5. 모든 방의 값 출력)
		for(String value : arr) {
			System.out.print(value + " ");
		}	// end for
		System.out.println();
		
		// 6. 값 삭제) remove(인덱스), remove(요소의 값/객체), 가변 길이형, 방의 크기가 줄어듦
//		list.remove(1);			// 인덱스로도 삭제 가능
		list.remove("Java");	// 같은 값이 있다면 처음 값만 삭제
		list.clear();
		
		System.out.println(list + " / " + list.size());
		
	}	// useArrayList
	
	
	/**
	 *  동기화가 되기 때문에 여러 객체가 동시 접근 불가. <br>
	 *  ArrayList보다 속도 느림
	 */
	public void useVector() {
		
		// 1. 생성)
		List<String> list = new Vector<String>();
		
		// 2. 값 할당) 객체명.add(값)	// 가변 길이형, 크기가 늘어남
		list.add("Java");
		list.add("Oracle");
		list.add("JDBC");
		list.add("Java");
		list.add("HTML");
		list.add("CSS");
		
		// 3. 크기)
		System.out.println(list.size() + "개");
		
		// 4. 배열로 복사)
		// - 리스트의 크기대로 빈 배열을 생성
		String[] arr = new String[list.size()];
		// - 복사
		list.toArray(arr);
		
		// 5. 모든 방의 값 출력)
//						for(int i = 0; i < list.size(); i++) {
//							System.out.println(list.get(i));
//						}	// end for
		
		for(String value : arr) {
			System.out.print(value + " ");
		}	// end for
		System.out.println();
		
		// 6. 값 삭제) remove(인덱스), remove(요소의 값) 가변 길이형, 크기가 줄어듦
//		list.remove(1);
		list.remove("Java");	// 같은 값이 있다면 처음 값만 삭제
		list.clear();
		
		System.out.println(list + " / " + list.size());	
	}	// useVector
	
	
	/**
	 *  시작주소, 데이터, 끝주소를 가지는 리스트 객체 <br>
	 *  데이터가 기존의 데이터 사이에 추가되는 일이 빈번할 때 사용
	 */
	public void useLinkedList() {
		
		// 1. 생성)
		List<String> list = new LinkedList<String>();
		
		// 2. 값 할당) 객체명.add(값)	// 가변 길이형, 크기가 늘어남
		list.add("Java");
		list.add("Oracle");
		list.add("JDBC");
		list.add("Java");
		list.add("HTML");
		list.add("CSS");
		
		// 기존 데이터 사이에 값을 추가, 겉보기에는 ArrayList와 동일하지만 훨씬 효율이 좋다.
		list.add(2, "자바");
		
		// 3. 크기)
		System.out.println(list.size() + "개");
		
		// 4. 배열로 복사)
		//  - 리스트의 크기대로 빈 배열을 생성
		String[] arr = new String[list.size()];
		//  - 복사
		list.toArray(arr);
		
		// 5. 모든 방의 값 출력)
//		for(int i = 0; i < list.size(); i++) {
//		System.out.println(list.get(i));
//		}	// end for

		System.out.println("-----------------향상된 for문을 사용한 출력-----------------");
		for(String value : arr) {
			System.out.print(value + " ");
		}	// end for
		System.out.println();
		
		System.out.println("-----------------Iterator를 사용한 출력-----------------");
		Iterator<String> ita = list.iterator();
		while(ita.hasNext()){
			System.out.print(ita.next() + " ");
		}	// end while
		System.out.println();
		
		// 6. 값 삭제) remove(인덱스), remove(요소의 값) 가변 길이형, 크기가 줄어듦
//		list.remove(1);
		list.remove("Java");	// 같은 값이 있다면 처음 값만 삭제
		list.clear();
		
		System.out.println(list + " / " + list.size());	
		
	}	// useLinkedList

	
	public static void main(String[] args) {
		
		UseList2 ul2 = new UseList2();
		System.out.println("-----------------------ArrayList-----------------------");
		ul2.useArrayList();
		System.out.println("-----------------------Vector-----------------------");
		ul2.useVector();
		System.out.println("-----------------------LinkedList-----------------------");
		ul2.useLinkedList();

	}	// main 

}	// class