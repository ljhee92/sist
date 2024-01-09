package day0109;

/**
 *  V.A를 사용하여 console에 출력하는 method <br>
 *  System.out.printf();, System.out.format(); - 출력 후 줄바꿈을 하지 않는다.
 */

public class UseVariableArguments2 {

	public static void main(String[] args) {
		
		int year = 2024, month = 1, day = 9;
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일입니다.");
		
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n", year, month, day);
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n", year, month, day);
		
		System.out.printf("정수출력: [%d][%5d][%-5d]\n", year, year, year);
		System.out.printf("문자출력: [%c][%5c][%-5c]\n", 'a','a','a');
		System.out.printf("불린출력: [%b][%5b][%-5b]\n", true, true, false);
		System.out.printf("실수출력: [%f][%10.2f][%.3f]\n", 2024.0109, 2024.0109, 2024.0109);
		System.out.printf("문자열출력: [%s][%5s][%-5s]\n", "자바", "자바", "자바");
		
		
		String name = "이주희";
		int javaScore = 89;
		int oracleScore = 94;
		int htmlScore = 79;
		
		// 아래와 같이 출력. (평균은 소수점 이하 한자리까지만 출력)
		// XXX님 Java SE xx점, Oracle xx점, HTML xx점
		// 총점: xx점, 평균: xx점
		
		int totalScore = javaScore + oracleScore + htmlScore;
		double averageScore = totalScore / 3.0;
		System.out.printf("%s님 Java SE %d점, Oracle %d점, HTML %d점\n총점: %d점, 평균: %.1f점", name, javaScore, oracleScore, htmlScore, totalScore, averageScore);

	}	// main

}	// class
