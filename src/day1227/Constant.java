package day1227;

/**
 *  Constant: 변수를 상수처럼 사용할 때 사용. <br>
 *   - 가독성 향상, 값 변경을 막기 위함.
 */

public class Constant {
	
	// Constant의 정의 -> API에서 찾을 때: field로 찾는다.
	
	public static final int MAX_SCORE = 100;		// 기준값 
	public static final int MIN_SCORE = 0;			// 여러개 정의 가능 

	public static void main(String[] args) {
		
		int myScore = 80;
//		MAX_SCORE = 99;		// constant는 값을 변경할 수 없다.
		
		System.out.println("최고점수와 획득점수 간의 차: " + (MAX_SCORE - myScore) + "점");
		System.out.println("최고점수와 획득점수 간의 차: " + (Constant.MAX_SCORE - myScore) + "점");		

	}	// main

}	// class
