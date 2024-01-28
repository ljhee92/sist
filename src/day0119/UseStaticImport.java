package day0119;

import static java.lang.Integer.MAX_VALUE;
//import static java.lang.Long.MAX_VALUE;
// 같은 이름의 constant는 여러 개 static import 할 수 있으나 사용 시 아래의 코드에서 에러가 발생한다.
import static java.lang.Integer.parseInt;
import static java.lang.Math.random;

public class UseStaticImport {

	public static void main(String[] args) {
		
		System.out.println(MAX_VALUE);
		System.out.println(MAX_VALUE);
		System.out.println(MAX_VALUE);
		System.out.println(MAX_VALUE);
		System.out.println(MAX_VALUE);
		
		String str = "2024";
		System.out.println(parseInt(str));
		System.out.println(parseInt(str));
		System.out.println(parseInt(str));
		System.out.println(parseInt(str));
		System.out.println(parseInt(str));
		
		System.out.println(random());

	}	// main

}	// class