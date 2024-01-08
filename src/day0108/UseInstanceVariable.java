package day0108;

/**
 *  instance variable (member variable) <br>
 *   - 객체마다 생성되고, 사용되는 변수 (값을 따로 사용할 수 있다.) <br>
 *   - instance화(객체화)를 하면 메모리에 올라가고, 객체 사용이 종료되면 메모리에서 내려온다. <br>
 *   - 자동 초기화가 된다. (지역변수와 다르게 직접 사용하더라도 error를 발생시키지 않는다.) <br>
 *   - 반드시 instance화(객체화) 후에 사용되어야 한다. (동일 영역에서는 객체명을 생략하고 사용할 수 있다.) <br>
 *   - 접근지정자 사용 가능
 */

public class UseInstanceVariable {
	
	// 접근지정자 사용 가능
	// public은 위험하므로 주로 default, private 사용
//	public int i;
//	protected int a;
//	int b;
//	private int c;
	
	int i;
	
	// default value
	int a;		// 정수 0
	char c;		// 문자 \u0000
	boolean b;	// 불린 false
	double d;	// 실수 0.0
	String s;	// 참조형 null
	
	public void test() {
		i = 10;		// 동일 영역(instance 영역)에서는 객체명 없이 사용할 수 있다.
	}	// test

	public static void main(String[] args) {
		
		// 영역이 다르다면(static 영역) instance화(객체화) 후에 사용해야 한다.
//		i = 10;		// error
		
		// 객체화 - 인스턴스 변수를 사용하기 위해서
		// 클래스명 객체명 = new 클래스명();
		// i라는 변수를 사용하기 위해 UseInstanceVariable 클래스를 객체화한다.
		UseInstanceVariable uiv = new UseInstanceVariable();
		UseInstanceVariable uiv2 = new UseInstanceVariable();
		
		
		// instance 변수는 특정 객체가 생성되면 만들어지는 변수(member variable)
		// 특정 객체만 사용하는 변수
		uiv.i = 2024;
		uiv2.i = 1;
		
		
		// 객체가 다르기 때문에 객체마다 다른 값을 가지게 된다. (static variable과의 차별점)
		System.out.println("uiv 객체가 가진 변수: " + uiv.i);
		System.out.println("uiv2 객체가 가진 변수: " + uiv2.i);
	
		System.out.println("기본형 ");
		System.out.println("정수: " + uiv.a);
		System.out.println("문자: [" + uiv.c + "] [" + (int)uiv.c + "]");
		System.out.println("boolean: " + uiv.b);
		System.out.println("실수: " + uiv.d);
		System.out.println("참조형(객체): " + uiv.s);

	}	// main

}	// class
