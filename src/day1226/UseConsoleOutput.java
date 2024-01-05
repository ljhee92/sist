package day1226;

/**
 *  표준 출력 스트림 사용 
 */

public class UseConsoleOutput {

	public static void main(String[] args) {
		
		// 상수 
		System.out.println(2023);	// 정수상수 - 정수 2023 
		System.out.println(12.26);	// 실수상수 
		System.out.println('0');	// 문자상수 - 문자의 0 
		System.out.println(true);	// 불린(boolean) 상수 
		System.out.println("오늘은 화요일입니다.");	// 문자열 상수 
		
		// 변수 
		int i = 26;
		System.out.println(i);
		
		// 연산: 연산의 결과만 출력 
		System.out.println(12 + 26);
		System.out.println("12 + 26 = " + 12 + 26);
		System.out.println("12 + 26 = " + (12 + 26));

	}	// main

}	// class