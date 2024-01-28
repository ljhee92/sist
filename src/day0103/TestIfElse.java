package day0103;

/**
 *  if~else : 둘 중 하나의 코드를 실행해야할 때 사용. <br>
 *  문법) <br>
 *   if (조건식) { <br>
 *    조건에 맞을 때 수행할 문장들... <br>
 *   } else { <br>
 *    조건에 맞지 않을 때 수행할 문장들... <br>
 *   }
 */

public class TestIfElse {

	public static void main(String[] args) {
		
		// 임의의 정수가 홀수인지 짝수인지 확인하여 출력하는 코드.
		int i = 29;
		if (i % 2 == 0) {
			System.out.println(i + "는 짝수");
		} else {
			System.out.println(i + "는 홀수");
		}	// end else
		
		
		// 임의의 정수를 저장하는 변수를 만들고,
		// main method에 arguments 첫 번째를 받아서 0~100 사이면 "유효 점수", 그렇지 않으면 "무효 점수"를 출력.
		int j = Integer.parseInt(args[0]);
		if (j > -1 && j < 101) {
			System.out.println(j + "는 유효 점수");
		} else {
			System.out.println(j + "는 무효 점수");
		}	// end else
		
	}	// main

}	// class
