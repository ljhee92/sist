package day0102;

/**
 *  대입 연산자 <br>
 *  =, <br>
 *  +=, -=, *=, /=, %=, <br>
 *  <<=, >>=, >>>=, <br>
 *  &=, |=, ^= 
 */

public class Operator7 {

	public static void main(String[] args) {
		
		// 순수 대입
		int i = 11;
		i = 25;		// 기존 값이 사라진다.
		System.out.println(i);
		
		
		// 산술 대입 : 기존의 값과 연산 후의 연산 결과를 다시 변수에 할당.
		i += 2;		// i = i + 2; -> 27
		i -= 20; 	// i = i - 20; -> 7
		i *= 3;		// i = i * 3; -> 21
		i /= 4; 	// i = i / 4; -> 5 (정수/정수=정수)
		i %= 3;		// i = i % 3; -> 2
		System.out.println(i);
		
		
		// 쉬프트 대입
		i <<= 4;	// 0000 0010 -> 0010 0000 -> 32
		i >>= 1;	// 0010 0000 -> 0001 0000 -> 16
		i >>>= 2;	// 0001 0000 -> 0000 0100 -> 4
		System.out.println(i);
		
		
		// 비트논리 대입
		i &= 20;	// i = i & 20;
		// 0000 0100
		// 0001 0100
		// 0000 0100 -> 4
		System.out.println(i);
		
		i |= 0xF;	// i = i | 0xF;
		// 0000 0100
		// 0000 1111
		// 0000 1111 -> 15
		System.out.println(i);
		
		i ^= 10;	// i = i ^ 10;
		// 0000 1111
		// 0000 1010
		// 0000 0101 -> 5
		System.out.println(i);

	}	// main

}	// class
