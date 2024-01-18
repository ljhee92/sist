package day0118;

/**
 *  D 클래스가 C 인터페이스를 구현한다면 D 클래스는 인터페이스(C)의 상속줄(A, B)에 있는 <br>
 *  인터페이스의 모든 abstract method를 Override 해야 한다.
 */

public class D implements C {

	@Override
	public void methodA() {
	}	// methodA

	@Override
	public void methodB() {
	}	// methodB

	@Override
	public void methodC() {
	}	// methodC

}	// class