package day0108;

/**
 *  static method 작성
 */

public class TestStaticMethod {
	
	public static void plus(int num, int num2) {
		int result = 0;		// 지역변수이므로 초기화 해야 함
		result = num + num2;
		System.out.println(result);
	}	// plus
	
	
	// 구구단을 입력받아 구구단의 범위였을 때 입력된 단을 출력하는 method를 작성, 호출
	public static void timesTable(int num) {	// num은 매개변수(parameter)이면서 지역변수
		if(num > 1 && num < 10) {
			System.out.println(num + "단");
		for(int i = 1; i < 10; i++) {
			System.out.println(num + "x" + i + "=" + (num * i));
		}	// end for
		} else {
			System.out.println("구구단의 범위가 아닙니다.");
		}	// end else
	}	// timesTable

	
	public static void main(String[] args) {
		
		// static 메소드는 객체화 없이 바로 호출 가능하다.
		TestStaticMethod.plus(1, 8);		// TestStaticMethod 클래스의 plus 메소드 호출
		TestStaticMethod.timesTable(8);		// TestStaticMethod 클래스의 timesTable 메소드 호출

	}	// main

}	// class
