package day0109;

/**
 *  Variable Arguments (가변인수) - parameter는 하나이나 입력 값이 동적 <br>
 *  문법) <br>
 *  데이터형 ... 변수명
 */

public class UseVariableArguments {
	
	public void testVA(int ... i) {
		// parameter는 참조형 데이터 형인 배열로 처리
//		System.out.println(i);
		
		// 배열은 반복문으로 처리
		for(int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}	// end for
	}	// testVA
	
	
	// V.A는 가장 마지막에만 정의할 수 있다.
	public void test(int i, char c, double d, String s, int ... j) {
		System.out.println(i);
		System.out.println(c);
		System.out.println(d);
		System.out.println(s);
		for(int k = 0; k < j.length; k++) {
			System.out.print(j[k]);
			if(k == j.length -1) {
				System.out.print(" ");
			} else {
				System.out.print(", ");
			}	// end else
		}	// end for
	}	// test
	
	
	// 아래는 error 
//	public void test2(int i, char c, int ... j, double d, String s) {
//	}	// test2

	public static void main(String[] args) {
		
		// instance method를 호출하기 위한 객체화
		UseVariableArguments uva = new UseVariableArguments();
		
		// VA는 호출할 때 데이터형만 일치하면 값의 개수에 상관없이 호출 가능
		
		// testVA method 호출
		uva.testVA(2024, 1, 9);
		
		// test method 호출
		uva.test(1, 'A', 2023.19, "오늘 눈온다", 2023, 1, 9, 10, 0);

	}	// main

}	// class
