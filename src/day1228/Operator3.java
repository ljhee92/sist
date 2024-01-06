package day1228;

/**
 *  쉬프트 연산자 <br>
 *  << (left shift) : 비트를 왼쪽으로 밀고, 밀어서 빈칸을 항상 0으로 채운다. <br>
 *  >> (right shift) : 비트를 오른쪽으로 밀고, 밀어서 빈칸을 최상위 부호비트에 따라 양수면 0을, 음수면 1을 채운다. <br>
 *  >>> (unsigned right shift) : 비트를 오른쪽으로 밀고, 밀어서 빈칸을 항상 0으로 채운다.
 */

public class Operator3 {

	public static void main(String[] args) {
		
		int i = 5;			// 0101
		System.out.println(i + " << 3 = " + (i << 3));	// 0010 1000 -> 40
		
//		128 64 32 16 8 4 2 1
		i = 75;				// 0100 1011
		System.out.println(i + " >> 2 = " + (i >> 2));	// 0001 0010 -> 18
		
		i = 29;				// 0001 1101
		System.out.println(i + " >>> 1 = " + (i >>> 1));	// 0000 1110 -> 14
		
		i = 1;				// 0000 0000 0000 0000 0000 0000 0000 0001
		System.out.println(i + " << 31 = " + (i << 31));	// 1000 0000 0000 0000 0000 0000 0000 0000
		
		// int형의 리터럴은 4바이트(32비트)
		System.out.println(i + " << 32 = " + (i << 32));	// 0000 0000 0000 0000 0000 0000 0000 0001
		System.out.println(i + " << 33 = " + (i << 33));	// 0000 0000 0000 0000 0000 0000 0000 0010
		
		i = -1;				// 1111 1111 1111 1111 1111 1111 1111 1111
		
		// right shift는 음수일 때 1을 채우므로 
		System.out.println(i + " >> 5 = " + (i >> 5));		// 1111 1111 1111 1111 1111 1111 1111 1111

		// unsigned right shift는 무조건 0을 채우므로
		System.out.println(i + " >>> 1 = " + (i >>> 1));	// 0111 1111 1111 1111 1111 1111 1111 1111
				
	}	// main

}	// class
