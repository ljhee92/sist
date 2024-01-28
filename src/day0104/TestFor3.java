package day0104;

/**
 *  다양한 for의 형태 <br>
 *   - 무한루프 <br>
 *   for(초기값; ; 증감식) { <br>
 *   } <br>
 *   <br>
 *   for( ; ; ) { <br>
 *   } 
 */

public class TestFor3 {

	public static void main(String[] args) {

		//	증가하는 수를 세는 무한루프
//		for(int i = 0; ; i++) {
//			System.out.println(i);
//		}	// end for
	
	
		// 증가하지 않는 수를 세는 무한루프
//		for( ; ; ) {
//			System.out.println("무한루프");
//		}	// end for
//		System.out.println("무한루프");	// 무한루프 아래에 입력되는 코드는 실행되지 않으므로 error
		
		
		// 여러 개의 초기값을 가진 for -> 가독성이 좋지 않아 많이 사용하지 않음
		for(int i = 0, j = 10, k = 100; i < 10; i++, j+=100, k--) {
			System.out.println("i: " + i + ", j: " + j + ", k: " + k);
		}	// end for
		
		
		// continue : 선택반복할 때 활용
		// 1에서부터 100까지 홀수만 출력
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				continue;
			} System.out.print(i + " ");
		}	// end for
		
	}	// main

}	// class
