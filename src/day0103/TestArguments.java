package day0103;

/**
 *  main method의 arguments 입력과 사용에 대한 연습. <br>
 *  <br>
 *  실행) java day0103.TestArguments 값 값 값 ... 
 */

public class TestArguments {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		
		// 문자열(String)은 연산되지 않고 붙임만 가능하다.
		System.out.println(args[0] + args[1]);
		
		
//		int i = args[0]			// 기본형에 참조형을 할당할 수 없다.
//		int i = (int)args[0]	// String을 int로 강제형변환할 수 없다. 
		
		
		// 문자열을 정수로 변환하는 일(method)을 하는 method를 사용.
		int num = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num + " + " + num2 + " = " + (num + num2));

	}	// main

}	// class
