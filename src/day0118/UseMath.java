package day0118;

/**
 *  java.lang.Math 클래스의 사용 <br>
 *  객체 생성을 하지 않고, 제공되는 기능을 사용하는 클래스
 */

public class UseMath {
	
	public UseMath() {
		
//		Math m = new Math();	// 생성자가 없으므로 객체화할 수 없다. 
		
		// 절대값을 얻고 싶을 때: Math.abs()
		double d = Math.abs(-2024.01);
		int i = Math.abs(-2024);			// abs method가 overloading되어있다.
		System.out.println(d + ", " + i);
		
		
		// 반올림한 값을 얻고 싶을 때: Math.round() double -> long, float -> int
		d = 10.5;
		long l = Math.round(d);
		System.out.println(l);
		
		
		// 올림/내림한 실수값을 얻고 싶을 때: Math.ceil(), Math.floor() 
		d = 10.01;
		System.out.println(Math.ceil(d) + ", " + Math.floor(d));
		
		
		// 절사한 값을 얻고 싶을 때: casting
		d = 2024.02;
		System.out.println((int)d);
		
		
		// 난수를 구할 때: Math.random()
		System.out.println(Math.random());
		double num = Math.random();
		System.out.println("발생한 난수: " + num);
		System.out.println("범위의 난수: " + num*10);			// 0.0~9.0 사이 10개의 난수
		System.out.println("범위의 난수: " + (int)(num*10));	// 0~9 사이 10개의 난수 
		System.out.println("범위의 난수: " + (int)((num*10)+1));	// 1~10 사이 10개의 난수
		
		char[] randomUpperCase = new char[8];
		// 위의 배열에 무작위의 알파벳 대문자를 입력해보세요.
		for(int j = 0; j < randomUpperCase.length; j++) {
			randomUpperCase[j] = (char)((Math.random()*26)+65);
			System.out.print(randomUpperCase[j] + " ");
		}	// end for
		
		// char형의 배열은 주소가 아니라 문자열이 나온다.
		System.out.println(randomUpperCase);
		
	}	// UseMath

	
	public static void main(String[] args) {
		
		new UseMath();

	}	// main

}	// class