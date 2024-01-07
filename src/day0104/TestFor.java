package day0104;

/**
 *  for문 : 시작과 끝을 알 때 사용하는 반복문 <br>
 *  문법) <br>
 *   for (시작값; 조건식; 증감식) { <br>
 *    반복 수행될 문장들... <br>
 *   } 
 */

public class TestFor {

	public static void main(String[] args) {

		// 안녕하세요를 10번 출력
		for(int i = 0; i < 10; i++) {
			System.out.println("안녕하세요");
		}	// end for
		
		
		// 1에서부터 100까지 옆으로 출력
		for(int i = 1; i < 101; i++) {
			System.out.print(i + " ");
		}	// end for
		System.out.println();
		
		
		// 1에서부터 100까지 홀수만 옆으로 출력
		for(int i = 1; i < 101; i+=2) {		// 증감식은 대상체의 값을 변화시키고 저장할 수 있는 모든 연산자 사용 가능.
			System.out.print(i + " ");
		}	// end for
		System.out.println();
		
		
		// 100에서부터 1까지 옆으로 출력
		for(int i = 100; i > 0; i--) {
			System.out.print(i + " ");
		}	// end for
		System.out.println();
		
		
		// 구구단 4단 출력
		for(int i = 1; i < 10; i++) {
			System.out.println("4 * " + i + " = " + (4 * i));
		}	// end for
		
		
		// main method에서 처음 입력된 arguments 값이 구구단의 범위였을 때 (2~9)
		// 해당 단의 구구단을 출력
		int num = Integer.parseInt(args[0]);
		if (num > 1 && num < 10) {
			for(int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}	// end for
		}	// end if
		
		
		// 1에서부터 100까지의 합을 출력. 5050 = 1 + 2 + 3 + 4 + ... + 100 : 누적합
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			sum += i;
		}	// end for
		System.out.println("1에서부터 100까지의 합: " + sum);
		
	}	// main

}	// class
