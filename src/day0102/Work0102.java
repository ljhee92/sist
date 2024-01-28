package day0102;

public class Work0102 {

	public static void main(String[] args) {
		
		// 문제 1.
		// 1-1. 두 정수를 저장할 수 있는 변수를 만들고, 각각의 변수에 임의의 값을 할당한다.
		// 1-2. 위의 변수 중에 큰 값을 반환하는 코드(삼항 연산자 사용)를 만들어 보세요.
		
		int num = 10, num2 = 20;
		System.out.println(num + "과 " + num2 + " 중 큰 값은 " + (num < num2 ? num2 : num));
		
		
		// 문제 2.
		// 2-1. 세 개의 정수를 저장할 수 있는 변수를 만들고, 각각의 변수에 임의의 값을 할당한다.
		// 2-2. 세 개의 숫자 중 가장 작은 값을 찾아서 출력하는 코드(삼항 연산자 사용)를 만들어 보세요.
		
		int a = 2, b = 3, c = 1;
		System.out.println(a + ", " + b + ", " + c + "중 가장 작은 값은 " + (a < b ? (a < c ? a : c) : (b < c ? b : c)));
		System.out.println(a + ", " + b + ", " + c + "중 가장 작은 값은 " + ((a < b && a < c) ? a : (b < c ? b : c)));
		
		
		// 문제 3.int temp1 = 10, temp2 = 20이 할당된 변수를 선언하고 아래 코드를 작성했을 때 어떤 값이 출력되는지 예상해보고,
		//       어떻게 그런 결과가 나왔는지 주석을 열고 간단히 작성해 보세요.
		// System.out.println( ++temp1 + temp2-- );	// 왜?
		// System.out.println( "temp1: " + temp1 + " temp2: " + temp2 );	// 왜?
		
		int temp1 = 10, temp2 = 20;
		System.out.println(++temp1 + temp2--);	// 11+20 31 출력, 전위연산자는 증가 후 연산, 후위연산자는 연산 후 감소
		System.out.println("temp1: " + temp1 + ", temp2: " + temp2);	// temp1: 11, temp2: 19 출력
		
		
		// 문제 4. Integer.MAX_VALUE Constant를 사용하여 integer의 하위 2Byte값이 출력되도록
		//        비트논리 연산자(&, |, ^)를 사용하여 출력해보세요. 결과 65535 가 나와야 한다.
		//		  Integer.MAX_VALUE => 0111 1111 1111 1111
		//							   0111 1111 0000 0000 256 512 1024 2048 4096 8192 16384 
		//		  			65535   => 0000 0000 1111 1111
		
		System.out.println(Integer.MAX_VALUE & 65535);
		System.out.println(Integer.MAX_VALUE & 0x0000FFFF);
		System.out.println(Integer.MAX_VALUE ^ (Integer.MAX_VALUE - 65535));

	}	// main

}	// class