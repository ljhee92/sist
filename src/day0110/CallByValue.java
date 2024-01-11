package day0110;

/**
 *  method의 매개변수가 기본형 데이터 형을 사용하면 입력되는 값은 복사되어 들어간다.
 */

public class CallByValue {
	
//	public CallByValue(int i) {
//		System.out.println("개발자가 매개변수 있는 생성자를 정의하면 Compiler가 기본 생성자를 만들어주지 않는다.");
//	}	// CallByValue

	/**
	 * i와 j를 입력 받아 두 변수의 값을 바꾸는 일
	 * @param i
	 * @param j
	 */
	public void swap(int i, int j) {
		int temp = 0;
		temp = i;
		i = j;
		j = temp;
		System.out.println("swap 안 i: " + i + ", j: " + j);
	}	// swap
	
	public static void main(String[] args) {

		// swap method 호출을 위한 객체 생성
		CallByValue cbv = new CallByValue();	// ->  9행에서 매개변수 있는 생성자를 생성하면 기본 생성자를 호출하는 본 행은 error!
		
		int i = 2024, j = 1;
		
		System.out.println("swap 전 i: " + i + ", j: " + j);
		
		cbv.swap(i, j);
		
		System.out.println("swap 후 i: " + i + ", j: " + j);
		
	}	// main

}	// class
