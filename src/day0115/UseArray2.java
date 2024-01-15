package day0115;

/**
 * 이차원 배열의 사용 <br>
 *  - 행과 열로 구성된 배열 <br>
 *  - 이차원 배열의 한 행은 1차원 배열로 이루어져 있다. 
 */

public class UseArray2 {
	
	public UseArray2() {	// 기본생성자
		
		// 이차원 배열 사용
		// 1. 선언) 데이터형[][] 배열명 = null;
		int[][] arr2 = null;
		
		// 2. 생성) 배열명 = new 데이터형[행의수][열의수];
		arr2 = new int[3][4];	// heap에 생성되며, 모든 방은 초기화된다.
		
		// 1+2) 데이터형[][] 배열명 = new 데이터형[행의수][열의수];
//		int[][] arr2 = new int[3][4];
		
		System.out.println("행의 수: " + arr2.length + "행");
		System.out.println("열의 수: " + arr2[0].length + "열");
		
		// 3. 값 설정) 배열명[행의번호][열의번호] = 값;
		arr2[0][0] = 2024;
		arr2[1][2] = 1;
		arr2[2][3] = 15;
		
		// 행에는 값을 할당할 수 없다. (행에는 일차원 배열을 할당할 수 있다.)
//		arr2[0] = 10;
		
		// 4. 값 사용) 배열명[행의번호][열의번호];
		System.out.println("arr2[0][0] = " + arr2[0][0]);
		System.out.println("arr2[1][2] = " + arr2[1][2]);
		
		// 5. 일괄처리
		for(int i = 0; i < arr2.length; i++) {	// 행
			for(int j = 0; j < arr2[0].length; j++) {	// 열
				System.out.printf("arr2[%d][%d]=%d\t", i, j, arr2[i][j]);
			}	// end for
			System.out.println();
		}	// end for
		
		
		// String으로 구구단 2~9단 저장할 수 있는 이차원 배열을 만들고, 2~9단까지의 구구단을 저장하고, 출력해보세요.
		String[][] gugudan = new String[8][9];
		
		for(int i = 0; i < gugudan.length; i++) {	// 행
			for(int j = 0; j < gugudan[0].length; j++) {	// 열
				gugudan[i][j] = (i+2) + "x" + (j+1) + "=" + (i+2)*(j+1);
				System.out.print(gugudan[i][j] + " ");
			}	// end for
			System.out.println();
		}	// end for
		
		System.out.println("--------------------------------------------------------------------");
		
	}	// UseArray2
	
	
	public void useArray2() {
		
		// 기본형 형식의 사용: new를 사용하지 않음
		int[][] arr2 = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
		
		System.out.printf("%d행 %d열\n", arr2.length, arr2[0].length);
		
		arr2[0][2] = 300;
		arr2[1][3] = 800;
		arr2[2][0] = 900;
		
		// 일괄처리
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[0].length; j++) {
				System.out.printf("arr2[%d][%d]=%d\t", i, j, arr2[i][j]);
			}	// end for
			System.out.println();
		}	// end for
		
		// 향상된 for: 배열의 처음 방부터 끝 방까지 출력하기 위해
		// 이차원 배열의 한 행은 일차원 배열로 이루어져 있다. 
		for(int[] arr : arr2) {
			for(int value : arr) {
				System.out.printf("%d\t", value);
			}	// end for
			System.out.println();
		}	// end for
		
	}	// useArray2

	public static void main(String[] args) {
		
		new UseArray2().useArray2();;

	}	// main

}	// class
