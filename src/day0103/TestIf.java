package day0103;

/**
 *  단일 if : 조건에 맞을 때에만 코드를 실행해야 하는 경우 <br>
 *  문법) <br>
 *   if (조건식) { <br>
 *    조건에 맞을 때 수행할 문장들 <br>
 *   } 
 */

public class TestIf {

	public static void main(String[] args) {
		
		// main method에 처음 입력된 arguments에 입력된 수의 절대값을 구하여 출력.
		int num = Integer.parseInt(args[0]);
		int abs = num;
		
		if (num < 0) {
			abs = -num;
		}	// end if
		
		System.out.println(num + "의 절대값: " + abs);
		
		
		// 문자열의 비교는 "같은지만" 비교할 수 있고, 관계 연산자를 사용하는 것이 아닌 equals method를 사용하여 비교한다.
		System.out.println("equals 문자열의 비교: " + args[0].equals("12"));
		System.out.println("equals 문자열의 비교: " + args[0].equals("-12"));
		
		
		// main method에 두 번째 입력된 arguments는 성별(여자, 남자)이다.
		// 프로그램의 출력은 출입문 입장 > 여자인 경우 "수건 2장 지급" > 목욕탕 입실의 순서로 출력.
		System.out.println(args[1] + " 성별이 입력되었습니다.");
		System.out.println("출입문 입장");
		
		if (args[1].equals("여자")) {
			System.out.println("수건 2장 지급");
		}	// end if
		
		System.out.println("목욕탕 입실");
		
		
		// 실수의 비교
		// 사람이 활동하기 좋은 날씨는 25.0 ~ 30.0도 이다. 이 온도일 때만 "좋은 날씨입니다. ~(^^~)(~^^)~"를 출력. 
		double temp = 25.8;
		if (temp >= 25.0 && temp <= 30.0) {
			System.out.println("좋은 날씨입니다. ~(^^~)(~^^)~");
		}	// end if
		
		
		// 문자의 비교 
		// char형의 변수에는 임의의 문자가 들어있다. 해당 문자가 대문자일 때만 "대문자"를 출력.
		char ch = 'A';				// A(65) ~ Z(90)
		if (ch > 64 && ch < 91) {
			System.out.println("대문자");
		}	// end if

	}	// main

}	// class
