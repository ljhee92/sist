package day1227;

/**
 *  숙제 
 */

public class Exam1227 {

	public static void main(String[] args) {
		
		// *각 항목에 부함되는 데이터형을 사용하여 변수를 선언하고, 연산하여 출력해보세요.
		
		/*
		출력 1.
		내 이름은 홍길동이고 이니셜은 H, G, D입니다.
		태어난 해는 XXXX년으로 
		나이는 XX살입니다.
		H, G, D: 변수, XXXX: 변수, XX: 연산을 통해 계산 
		*/
		
		char initial = 'H', initial2 = 'G', initial3 = 'D';
		int birthYear = 1992;
		System.out.println("내 이름은 홍길동이고 이니셜은 " + initial + ", " + initial2 + ", " + initial3 + "입니다.");
		System.out.println("태어난 해는 " + birthYear + "년으로");
		System.out.println("나이는 " + (2023 - birthYear) + "살입니다.");
		
		
		/*
		출력 2.
		왼눈 시력 XX.X 오른눈 시력 XX.X이고 양안 시력 XX.X입니다.
		왼눈 시력 변수, 오른눈 시력 변수, 양안 시력 연산 
		양안 시력 = (왼눈 시력 + 오른눈 시력) / 2
		*/
		
		double leftEyeSight = 12.5, rightEyeSight = 15.5;
		double totalEyeSight = (leftEyeSight + rightEyeSight) / 2;
		System.out.println("왼눈 시력 " + leftEyeSight + " 오른눈 시력 " + rightEyeSight + "이고 양안 시력 " + totalEyeSight + "입니다.");
		
		
		/*
		출력 3.
		편도 차비 xx원, 왕복 차비 xx원, 한 달 20일 출근하면 월 교통비는 총 xx원입니다.
		편도 차비 변수, 왕복 차비 연산, 총 차비 연산
		*/
		
		int oneWayFee = 3000;
		int roundFee = oneWayFee * 2;
		int totalFee = roundFee * 20;
		System.out.println("편도 차비 " + oneWayFee + "원, 왕복 차비 " + roundFee + "원, 한 달 20일 출근하면 월 교통비는 총 " + totalFee + "원입니다.");
		
		
		/*
		출력 4.
		대문자 'A'의 unicode 값은 65입니다. A에 32를 더하면 소문자 'a'를 만들 수 있다.
		'A'는 char의 변수, 'a'는 연산
		*/
		
		char upperCase = 'A';
		char lowerCase = (char)(upperCase + 32);
		System.out.println("대문자 '" + upperCase + "'의 unicode 값은 " + (int)upperCase + "입니다. " + upperCase + "에 32을 더하면 소문자 '" + lowerCase + "'를 만들 수 있다." );

	}	// main

}	// class