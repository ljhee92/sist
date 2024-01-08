package day0108.sub;

import day0108.TestAccessModifier;

/**
 *  패키지가 다른 상태에서 public 접근지정자가 있는 클래스 접근
 *  UsePublicModifier2는 TestAccessModifier의 자식 클래스 (extends 사용) 
 */

public class UsePublicModifier2 extends TestAccessModifier {

	public static void main(String[] args) {
		
		UsePublicModifier2 upm2 = new UsePublicModifier2();
		// -> 객체화할 때, 다른 클래스들은 접근하려는 클래스명을 사용했는데, 왜 여기서만 본인 클래스명을 사용하는지??
		upm2.a = 100;	// public
		upm2.b = 200;	// protected
//		upm2.c = 100;	// default 사용 불가 
//		upm2.d = 200;	// private 사용 불가
		
	}	// main

}	// class
