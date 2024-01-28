package day0117;

/**
 *  추상 클래스: 직접 객체화될 수 없다. -> 상속을 위해 만들어짐
 */

public abstract class AbstractSuper {
	
	public AbstractSuper() {
		System.out.println("부모의 기본 생성자");
	}	// AbstractSuper
	
	
	public void test() {
		System.out.println("일반 instance method");
	}	// test 
	
	
	public abstract String msg();				// 추상 method -> body가 없다.
	public abstract String msg(String msg);		// Overloading도 가능하다.
	
	
	public static void main(String[] args) {
//		new AbstractSuper();	// 직접 객체화될 수 없음.
	}	// main

}	// class