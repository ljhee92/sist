package day1228;

/**
 *  단항 연산자: 연산에 필요한 항이 하나인 연산자. <br>
 *  ~, !, +, -, ++, -- 
 */

public class Operator1 {

	public static void main(String[] args) {
		
		// ~ (tilde) : 1의 보수 연산
		// ~ 양수 : 부호 변경 1 증가
		// ~ 음수 : 부호 변경 1 감소
		
		int i = 10, j = -10;
		System.out.println("~" + i + " = " + ~i);	// ~10 -> -11
		System.out.println("~" + j + " = " + ~j);	// ~-10 -> 9
		
		// ~를 사용하여 부호만 변경하고 싶다. -10으로 만들어보세요.
		System.out.println(~(i-1));
		System.out.println(~i+1);
		
		
		// ! (not) : 부정 연산
		// true 또는 false 앞에서만 정의 가능
		
		i = 12;
		j = 28;
		System.out.println(!(i < j));
		System.out.println(i + " > " + j + " = " + !(i < j));	// !true -> false
		
		boolean flag1 = true, flag2 = false;
		System.out.println("!" + flag1 + " = " + !flag1);
		System.out.println("!" + flag2 + " = " + !flag2);
		
		
		// + : 형식적 제공
		// - : 2의 보수 연산(부호만 변경, 값은 그대로)
		
		i = 12;
		j = -12;
		System.out.println("-(" + i + ") = " + -i);
		System.out.println("-(" + j + ") = " + -j);
		
		
		// ++, -- : 증감 연산
		// 대상체의 앞에 붙이면 전위 연산, 뒤에 붙이면 후위 연산
		
		i = 5;
		j = 10;
		System.out.println("설정된 값 i = " + i + ", j = " + j);
		
		++i;			// 전위연산 5 -> 6
		--j;			// 전위연산 10 -> 9
		System.out.println("전위연산 1번 후 i = " + i + ", j = " + j);
		
		++i;			// 전위연산 6 -> 7
		--j;			// 전위연산 9 -> 8
		System.out.println("전위연산 2번 후 i = " + i + ", j = " + j);
		
		i++;			// 후위연산 7 -> 8
		j--;			// 후위연산 8 -> 7
		System.out.println("후위연산 후 i = " + i + ", j = " + j);

		// 전위와 후위는 대입연산과 함께 사용되면 각자 다른 값을 대입한다.
		
		i = 10;
		int result = 0;
		
		// 전위연산 : 내 것 먼저. (단항을 수행한 후 대입을 수행)
		result = ++i;
		System.out.println("전위 후 result = " + result + ", i = " + i);
		
		// 후위연산 : 남의 것 먼저. (대입을 수행한 후, 단항을 수행)
		i = 10;
		result = i++;
		System.out.println("후위 후 result = " + result + ", i = " + i);
		
		i = 10;
		j = 10;
		System.out.println("전위: " + ++i);
		System.out.println("후위: " + j++);
		
		System.out.println("method 호출 후 i: " + i + ", j: " + j);

	}	// main

}	// class
