package day0111;

/**
 *  method의 매개변수로 class가 정의되면 주소(유일)가 넘어간다.
 */

public class CallByReference {
	
	int i;	// cbr 번지의 i(자동초기화)
	int j;	// cbr 번지의 j(자동초기화)
	
	public void swap(CallByReference cbr) {
		int temp = 0;
		temp = cbr.i;	// 2024
		cbr.i = cbr.j;	// 1
		cbr.j = temp;	// 2024
		System.out.println("swap 안 i: " + cbr.i + ", j: " + cbr.j);
	}	// swap

	public static void main(String[] args) {
		
		CallByReference cbr = new CallByReference();	// 기본 생성자를 사용하여 객체화
		System.out.println(cbr);	// cbr의 번지수
		cbr.i = 2024;	// cbr번지의 i
		cbr.j = 1;		// cbr번지의 j
		
		System.out.println("swap 전 i: " + cbr.i + ", j: " + cbr.j);
		
		cbr.swap(cbr);
		
		System.out.println("swap 후 i: " + cbr.i + ", j: " + cbr.j);
		
	}	// main

}	// class
