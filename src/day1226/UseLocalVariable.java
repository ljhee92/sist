package day1226;

/**
 *  지역변수 사용 
 */

public class UseLocalVariable {
	
	int i;		// instance varialbe, class field에 선언되어 있음.
	
	// main method: 클래스를 단독으로 실행시켜야 할 때 정의하는 method 
	// 단독으로 실행 가능한 프로그램: java application

	public static void main(String[] args) {
		
		// 지역변수
		
		// 1. 선언: 데이터명 변수명;
		int maxScore = 100;		// 초기화 값 
		int myScore = 0;		// 초기화되지 않은 변수
		
		System.out.println(myScore);		// 초기화되지 않은 변수를 사용하면 error 발생 
		

		// 2. 값 할당: 변수명 = 값;
		maxScore = 100;
		myScore = 80;
		
		
		// 3. 값 사용: 출력, 연산 재할당 중 하
		System.out.print("최고점수 " + maxScore + "점, 내 점수 " + myScore + "점");
		System.out.println(", 최고점수와 내 점수의 차이: " + (maxScore - myScore) + "점");
		
		// 4. 문제
		// 4-1. 올해를 저장할 수 있는 변수를 선언하고 초기값으로 올해를 할당.
		// 4-2. 자신의 나이를 저장할 수 있는 변수를 선언하세요. 
		// 4-3. 2번의 변수에 자신의 나이를 할당하세요.
		// 4-4. 두 개의 변수를 사용하여 자신이 태어난 해를 연산하여 출력. 
		
		int thisYear = 2023;
		int myAge;
		myAge = 31;
		System.out.println("내가 태어난 해: " + (thisYear-myAge) + "년 ");
		
		
//		int myScore = 10000;	// 영역이 같다면 같은 이름의 변수는 하나만 선언 가능.
		
		int i;	// 영역이 다르므로 같은 이름의 변수 선언 가능.
		
	}	// main

}	// class
