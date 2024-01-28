package day0108.sub;

import day0108.TestAccessModifier;

/**
 *  패키지가 다른 상태에서 public 접근지정자가 있는 클래스 접근
 */

public class UsePublicModifier {

	public static void main(String[] args) {
		
		// TestAccessModifier는 클래스의 접근지정자가 public이므로 접근 가능
		TestAccessModifier tam = new TestAccessModifier();
		tam.a = 10;		// a변수의 접근지정자 public : 접근 가능
//		tam.b = 10;		// b변수의 접근지정자 protected : 다른 패키지, 자식 클래스가 아니므로 접근 불가
//		tam.c = 10;		// c변수의 접근지정자 default : 다른 패키지이므로 접근 불가
//		tam.d = 10;		// d변수의 접근지정자 private : 클래스 내부에서만 사용가능하므로 접근 불가

		// TestAccessModifier2는 클래스의 접근지정자가 package(package내에서만 가능)이므로 접근 불가
//		TestAccessModifier2 tam2 = new TestAccessModifier2();
		
	}	// main

}	// class
