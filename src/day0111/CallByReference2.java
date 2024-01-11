package day0111;

/**
 *  this를 사용하여 CallByReference 개선
 */

public class CallByReference2 {
	
	int i;	// cbr 번지의 i(자동초기화)
	int j;	// cbr 번지의 j(자동초기화)
	
	public void swap(int i, int j) {
		this.i = j;
		this.j = i;
		System.out.println("swap 안 i: " + this.i + ", j: " + this.j);
	}	// swap

	public static void main(String[] args) {
		
		CallByReference2 cbr = new CallByReference2();	// 기본 생성자를 사용하여 객체화
		System.out.println(cbr);	// cbr의 번지수
		cbr.i = 2024;	// cbr번지의 i
		cbr.j = 1;		// cbr번지의 j
		
		System.out.println("swap 전 i: " + cbr.i + ", j: " + cbr.j);
		
		cbr.swap(cbr.i, cbr.j);
		
		System.out.println("swap 후 i: " + cbr.i + ", j: " + cbr.j);
		
	}	// main

}	// class
