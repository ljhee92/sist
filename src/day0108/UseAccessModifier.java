package day0108;

/**
 *  다른 클래스의 접근지정자의 사용
 */

public class UseAccessModifier {

	public static void main(String[] args) {
		
		// 같은 패키지의 public이 있는 클래스를 접근
		TestAccessModifier tam = new TestAccessModifier();
		tam.a = 10;		// public : 클래스 외부에서 사용 가능
		tam.b = 10;		// protected : 같은 패키지 다른 클래스에서 사용 가능, 패키지가 다르면 자식 클래스에서만 사용 가능
		tam.c = 10;		// default : 같은 패키지 다른 클래스에서 사용 가능, 패키지가 다르면 사용 불가
//		tam.d = 10;		// private : 클래스 내부에서만 사용 가능
		
		
		// 같은 패키지의 public이 없는 클래스를 접근
		TestAccessModifier2 tam2 = new TestAccessModifier2();
		tam2.a = 10;	// public
		tam2.b = 10;	// protected
		tam2.c = 10;	// default
//		tam2.d = 10;	// private

	}	// main

}	// class
