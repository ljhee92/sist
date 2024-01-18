package day0118;

/**
 *  C 인터페이스의 부모는 A와 B -> 인터페이스는 클래스와 달리 다중상속 가능
 */

public interface C extends A, B {
	
	public void methodC();

}	// interface