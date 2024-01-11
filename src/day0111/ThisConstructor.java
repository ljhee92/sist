package day0111;

/**
 *  this를 사용한 클래스 내 다른 생성자 호출
 */

public class ThisConstructor {
	
	public ThisConstructor() {
//		this(11);
		System.out.println("기본 생성자!!");
	}	// ThisConstructor
	
	
	public ThisConstructor(int i) {
		this();
		System.out.println("매개변수 있는 생성자 " + i);
	}	// ThisConstructor

	
	public static void main(String[] args) {
		
		System.out.println(new ThisConstructor(2024));
		// 저장을 안했을 뿐 new ThisConstructor 자체가 객체이므로 출력하면 주소가 출력된다.
		
	}	// main

}	// class
