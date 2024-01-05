package day1227;

/**
 *  기본형 데이터 형: 변수에 상수 값을 저장하는 데이터 형.
 */

public class PrimitiveDataType {

	public static void main(String[] args) {
		
		/////////////////////// 정수 상수를 저장할 수 있는 데이터 형 ///////////////////////
		
		byte a = 10;	// byte 저장범위 -128 ~ +127
//		byte b = 128;	// 데이터 형은 저장할 수 있는 범위를 초과하면 error 발생 
		short b = 10;	// short 저장범위 -32768 ~ +23767
		int c = 10;		// int 저장범위 약 -21억(-2147483648) ~ +21억(2147483647)
		long d = 10; 	// long 저장범위 -2^63 ~ +2^63-1
		
		// 자신이 평생 모으고 싶은 현실적인 자산을 변수에 할당
		long asset = 5000000000L;	// 리터럴의 크기를 변경하여 상수 값을 저장하고, 변수에 할당
//		long asset = 2147483647;
		
		System.out.println("byte: " + a + ", short: " + b + ", int: " + c + ", long: " + d);
		System.out.println("나의 자산: " + asset);
		
		
		/////////////////////// char 형 ///////////////////////
		
//		char e = 'A';	// 문자에 해당하는 2byte의 unicode 값이 할당 
		char e = 65;
		char f = 48;		// '0';
		char g = 44032;		// '가';
		char h = '\u0000';	// unicode 0
		
		System.out.println("char: " + e + ", " + f + ", " + g + ", " + h);
		

		/////////////////////// 실수형 ///////////////////////
		
//		float f = 12.27;	// 실수 리터럴 8byte, float형 4byte이기 때문에 크기가 같지 않아서 값이 할당될 수 없다.
		
		float i = 12.27F;	// 8byte의 리터럴이 4byte로 축소되어 float과 같아지고 할당됨.
		float j = 12.28f;
		
		double k = 2023.12;	// 2023.12D도 가능.
		
		System.out.println("float : " + i + ", " + j + ", double: " + k);
		
		
		/////////////////////// boolean형 ///////////////////////

		boolean l = true;
		boolean m = false;
		// true, false 이외의 값은 저장할 수 없다.
		// boolean n = 0;
		
		System.out.println("boolean: " + l + ", " + m);

	}	// main

}	// class
