package day0104;

/**
 *  switch ~ case 사용 : 일치하는 "정수"를 비교할 때 사용 <br>
 *  문법) <br>
 *  switch (변수명) { <br>
 *  case 상수 : 변수와 상수가 일치할 때 수행될 문장들... <br>
 *  case 상수 : 변수와 상수가 일치할 때 수행될 문장들... <br>
 *  	. <br>
 *  	. <br>
 *  	. <br>
 *  default : 변수와 일치하는 상수가 없을 때 수행될 문장들... <br>
 *  }
 */

public class TestSwitchCase {
	
	public static final int GRADE_A_PLUS = 10;
	public static final int GRADE_A = 9;
	public static final int GRADE_B = 8;
	public static final int GRADE_C = 7;
	public static final int GRADE_D = 6;

	public static void main(String[] args) {
		
		int i = 0;
		switch (i) {
		case 0 : System.out.println("영");
		case 1 : System.out.println("일"); break;
		case 2 : System.out.println("이");
		default : System.out.println("변수와 일치하는 상수 없음.");
		}	// end switch
		
		
		int score = 100;
		char grade = '\u0000';
		
		switch (score / 10) {
		case GRADE_A_PLUS :
		case GRADE_A : grade = 'A'; break;
		case GRADE_B : grade = 'B'; break;
		case GRADE_C : grade = 'C'; break;
		case GRADE_D : grade = 'D'; break;
		default : grade = 'F';
		}	// end switch
		System.out.println(score + "점은 " + grade + "학점");
		
		
		score = 99;
		grade = 64;
		if (score > -1 && score < 101) {
			switch (score / 10) {
			case GRADE_D : grade++;
			case GRADE_C : grade++;
			case GRADE_B : grade++;
			case GRADE_A :
			case GRADE_A_PLUS : grade++; break;
			default : grade += 6;
			}	// end switch
			System.out.println(score + "의 학점은 " + grade + "입니다.");
		}	else {
			System.out.println("잘못된 점수입니다.");
		}	// end else
		
	}	// main

}	// class
