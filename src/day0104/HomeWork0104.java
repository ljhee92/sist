package day0104;

public class HomeWork0104 {

	public static void main(String[] args) {
		
		// 1. 구구단 전체단을 옆으로 출력
		// 2x1=2 3x1=3 4x1=4 ... 9x1=9
		// 2x2=4 3x2=6 4x2=8 ... 9x2=18
		// 2x3=6 3x3=9 4x3=12 ... 9x3=27
		// ...
		// 2x9=18 3x9=27 ....... 9x9=81
		
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + "x" + i + "=" + (j * i) + " ");
			}	// end for
			System.out.println();
		}	// end for
		
		
		// 2. 아래와 같은 형태로 숫자 앞에 공백을 넣어서 출력
		// 0
		//  1
		//   2
		//    3
		//     4
		//      5
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(i == j) { 
					System.out.print(i + " ");					
				} else {
					System.out.print(" ");
				}	// end else
			}	// end for
			System.out.println();
		}	// end for
		
		for(int i = 0; i < 6; i++) {
			System.out.println(i);
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}	// end for
		}	// end for
		System.out.println();
		
		
		// 3. 1에서부터 100까지의 수 중 3의 배수 합을 출력
		
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			if(i % 3 == 0) {
				sum += i;
			}	// end if
		}	// end for
		System.out.println(sum);

	}	// main
	
}	// class
