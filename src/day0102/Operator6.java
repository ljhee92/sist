package day0102;

/**
 *  삼항(조건) 연산자 <br>
 *   전항 ? 항1 : 항2 
 */

public class Operator6 {

	public static void main(String[] args) {
		
		int num = 2;
		System.out.println(num + "은(는) " + (num >= 0 ? "양수" : "음수"));
		
		
		// num이 홀수인지 짝수인지를 판단하여 출력하는 코드
		System.out.println(num + "은(는) " + (num % 2 == 0 ? "짝수" : "홀수"));
		
		
		// 점수를 저장하는 변수를 선언하고, 임의의 값을 할당
		// 할당된 값이 0 ~ 100 사이라면 "유효점수"를 출력하고, 그렇지 않다면 "무효점수"를 출력하는 코드
		int score = 100;		// -1, 0, 100, 101 경계값 테스트 
		System.out.println(score + "점은 " + ((score > -1) && (score < 101) ? "유효점수" : "무효점수"));
		
		// 아래 코드는 위 코드보다 = 연산을 한 번 더 하기 때문에 위 연산이 더 좋은 코드.
		System.out.println(score + "점은 " + ((score >= 0) && (score <= 100) ? "유효점수" : "무효점수"));

	}	// main

}	// class
