package day0108;

/**
 *  static variable (class variable) <br>
 *   - 객체화 없이 클래스명으로 직접 접근하여 사용할 수 있는 변수 <br>
 *   - 프로그램이 실행되면 메모리에 올라가고 실행이 끝나면 메모리에서 내려오는 변수 <br>
 *   - 자동 초기화가 된다. (값할당하지않고 사용하더라도 error가 발생하지 않는다.) <br>
 *   - 하나의 변수만 만들어진다. <br>
 *   - 모든 instance(객체)가 하나의 변수를 참조하고 사용한다. - 공용!
 */

public class UseStaticVariable {
	
	// 1. 선언) static 데이터형 변수명; -> 자동 초기화가 된다.
	static int i;		// 0
	static char c;		// \u0000
	static boolean b;	// false
	static double d;	// 0.0
	static UseStaticVariable usv;	// null

	public static void main(String[] args) {
		
		// default value
		System.out.println("정수: " + UseStaticVariable.i);
		System.out.println("문자: " + UseStaticVariable.c);
		System.out.println("boolean: " + UseStaticVariable.b);
		System.out.println("실수: " + UseStaticVariable.d);
		System.out.println("객체: " + UseStaticVariable.usv);
		
		
		// 2. 값 할당) 클래스명.변수명 = 값;
		UseStaticVariable.i = 100;
		
		
		// 3. 값 사용) 클래스명.변수명;
		System.out.println(UseStaticVariable.i);
		
		
		// 모든 객체가 하나의 변수를 사용한다.
			// 1. 객체화
			UseStaticVariable instance = new UseStaticVariable();
			UseStaticVariable instance2 = new UseStaticVariable();
			
			// instance와 instance2 객체는 주소가 다르므로 별개의 객체이다.
			System.out.println(instance);
			System.out.println(instance2);
			
			// staic 변수는 공용이므로 특정 instance(객체)에 속하지 않은 변수.
			// 특정 instance명으로 사용하면 사용은 되지만 올바른 표현이 아님.
//			instance.i = 10;					// instance 객체로 접근한 i의 값을 변경했으나 
//			System.out.println(instance.i);
//			System.out.println(instance2.i);	// instance2 객체로 접근한 i의 값도 변경된다.	

	}	// main

}	// class
