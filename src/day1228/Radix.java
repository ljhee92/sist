package day1228;

/**
 *  진수 사용 
 */

public class Radix {

	public static void main(String[] args) {
		
		int i = 10;			// 10진수 -> 2진수로 저장 
		int j = 012;		// 8진수 -> 2진수로 저장
		int k = 0xA;		// 16진수 -> 2진수로 저장 
	
		System.out.println(i + ", " + j + ", " + k);
		System.out.println(i + j + k);					// (JVM이) 2진수를 연산하여 10진수로 보여준다.
		
		
		/////////////////////////// 10진수 -> 2진수 ///////////////////////////
		
		// 25 -> 0001 1001
		// 89 -> 0101 1001
		// 300 -> 0001 0010 1100

		i = 25;
		System.out.println(i + "를 2진수로: " + Integer.toBinaryString(i));
		i = 89;
		System.out.println(i + "를 2진수로: " + Integer.toBinaryString(i));
		i = 300;
		System.out.println(i + "를 2진수로: " + Integer.toBinaryString(i));
		
		
		/////////////////////////// 8진수 -> 2진수 ///////////////////////////
		
		// 030 -> 0001 1000 -> 24
		// 0201 -> 1000 0001 -> 129
		// 0300 -> 1100 0000 -> 192
		
		j = 030;
		System.out.println("8진수 0" + Integer.toOctalString(j) + "를 2진수로: " + Integer.toBinaryString(j));
		j = 0201;
		System.out.println("8진수 0" + Integer.toOctalString(j) + "를 2진수로: " + Integer.toBinaryString(j));
		j = 0300;
		System.out.println("8진수 0" + Integer.toOctalString(j) + "를 2진수로: " + Integer.toBinaryString(j));
		

		/////////////////////////// 16진수 -> 2진수 ///////////////////////////
		
		// 0x25 -> 0010 0101 -> 37 
		// 0x1D -> 0001 1101 -> 29
		// 0xFF -> 1111 1111 -> 255
		
		k = 0x25;
		System.out.println("16진수 0x" + Integer.toHexString(k) + "를 2진수로: " + Integer.toBinaryString(k));
		k = 0x1D;
		System.out.println("16진수 0x" + Integer.toHexString(k) + "를 2진수로: " + Integer.toBinaryString(k));
		k = 0xFF;
		System.out.println("16진수 0x" + Integer.toHexString(k) + "를 2진수로: " + Integer.toBinaryString(k));
		
		
		int tel = 01012341234;		// 0으로 시작하는 수: 8진수
		System.out.println("내 전화번호: " + tel);		// 8진수를 출력하면 10진수로 나온다.

	}	// main

}	// class
