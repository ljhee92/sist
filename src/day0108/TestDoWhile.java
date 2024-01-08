package day0108;

/**
 *  시작과 끝을 모를 때 사용하는 반복문 <br>
 *  최소 1번 수행에서부터 최대 조건까지 수행 <br>
 *  문법) <br>
 *  do { <br>
 *   반복수행문장들... <br>
 *  } while (조건식);
 */

public class TestDoWhile {

	public static void main(String[] args) {
		
		int i = 0;
		do {
//			i++;
			System.out.println(i);
			i++;		// 조건식 위치는 상관 없음
		} while (i < 10);
		
		
		// 1에서부터 100까지의 합 출력
		i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;
		} while (i < 101);
		System.out.println("1에서부터 100까지의 합: " + sum);

	}	// main

}	// class
