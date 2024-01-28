package day0118;

/**
 *  구현클래스가 반드시 구현해야 할 일의 목록을 정의할 때 사용. <br>
 *   상수, abstract method를 가진다.
 */

public interface SuperInter {
	
//	int i;	// 인스턴스 변수는 선언할 수 없다.
	
//	public SuperInter() {	// 생성자를 가질 수 없다. -> 객체화될 수 없다.
//	}
	
//	public void method() {	// 일반 method를 정의할 수 없다.
//	}
	
	public static final int MAX = 100;	// 객체 크기에 영향을 주지 않는다.
	
	// interface의 abstract method는 abstract 접근지정자를 붙이지 않고 생성할 수 있다.
	public String toDay();
	public abstract int getAge();
	
	// default method를 작성: method의 body가 있는 method
	public default String defMethod() {
		return "인터페이스에서 처리된 작업";
	}	// defMethod

}	// interface