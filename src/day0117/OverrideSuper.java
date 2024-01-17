package day0117;

/**
 *  부모클래스
 */

public class OverrideSuper {
	
	int i;
	
	public OverrideSuper() {
		System.out.println("부모클래스의 생성자");
	}	// OverrideSuper
	
	public void test() {
		System.out.println("부모클래스만 가지고 있는 method");
	}	// test
	
	/**
	 *  final이 정의된 method는 Override를 막을 수 있다. <br>
	 *  자식클래스에서 부모클래스의 제공 기능을 변경없이 그대로 사용해야할 때 
	 */
	protected /*final*/ void printI() {
		System.out.println("부모클래스의 printI " + i);
	}	// printI

}	// class