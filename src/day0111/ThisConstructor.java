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
//		new ThisConstructor();	// 여러 개의 객체를 생성하여 여러 생성자를 호출 -> 객체가 여러 개 생성된다. -> 쓸데없이 메모리 사용이 증가한다.
		this();		// 생성자의 첫 번째 줄에서만 사용한다.	// 하나의 객체를 생성하여 여러 생성자를 호출 -> 객체가 하나만 생성된다.
		System.out.println("매개변수 있는 생성자 " + i);
	}	// ThisConstructor

	
	public static void main(String[] args) {
		
		System.out.println(new ThisConstructor(2024));
		// 저장을 안했을 뿐 new ThisConstructor 자체가 객체이므로 출력하면 주소가 출력된다.
		
	}	// main

}	// class
