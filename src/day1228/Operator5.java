package day1228;

/**
 *  논리 연산자 <br>
 *   - 일반 논리 : 여러 개의 관계 연산자를 붙여서 연산할 때 사용 <br>
 *    && (AND) : 전항과 후항이 모두 true일 때만 true를 반환 <br>
 *    || (OR) : 전항과 후항이 모두 false일 때만 false를 반환 <br>
 *   <br>
 *   - 비트 논리 : 비트를 연산할 때 사용 <br>
 *    & (AND) : 상위비트와 하위비트가 모두 1일 때만 1 내림 <br>
 *    | (OR) : 상위비트와 하위비트가 모두 0일 때만 0 내림 <br>
 *    ^ (XOR) : 상위비트와 하위비트 둘 중 하나만 1일 때 1 내림
 */

public class Operator5 {

	public static void main(String[] args) {

		boolean flag = true, flag2 = false, flag3 = true, flag4 = false;
		
		System.out.println("----------------- AND -----------------");
		System.out.println(flag + " && " + flag3 + " = " + (flag && flag3));		// true
		System.out.println(flag + " && " + flag2 + " = " + (flag && flag2));		// false
		System.out.println(flag2 + " && " + flag + " = " + (flag2 && flag));		// false
		System.out.println(flag2 + " && " + flag4 + " = " + (flag2 && flag4));		// false
		System.out.println();
		
		
		System.out.println("----------------- OR -----------------");
		System.out.println(flag + " || " + flag3 + " = " + (flag || flag3));		// true
		System.out.println(flag + " || " + flag2 + " = " + (flag || flag2));		// true
		System.out.println(flag2 + " || " + flag + " = " + (flag2 || flag));		// true
		System.out.println(flag2 + " || " + flag4 + " = " + (flag2 || flag4));		// false
		System.out.println();
		
		
		// && : 전항이 false라면 무조건 결과값이 false이므로 후항을 연산하지 않는다.
		// || : 전항이 true라면 무조건 결과값이 true이므로 후항을 연산하지 않는다.
		
		flag = false;
		flag2 = false;
		flag3 = false;
		
		flag3 = (flag = 3 < 2) && (flag2 = 5 < 6);
		System.out.println(flag + " && " + flag2 + " = " + flag3);
		System.out.println();
		
		
		int octalNum = 9;		// octalNum은 0~9까지의 임의의 한 자리의 양의 수
		// octalNum이 8진수의 범위라면 true를, 그렇지 않으면 false를 출력해보세요
		System.out.println((octalNum > -1) && (octalNum < 8));
		System.out.println();
		
		
		int i = 37, j = 14;
		// 0010 0101
		// 0000 1110
		// 0000 0100 -> 4
		// 0010 1111 -> 47
		// 0010 1011 -> 43
		System.out.println(i + " & " + j + " = " + (i & j));
		System.out.println(i + " | " + j + " = " + (i | j));
		System.out.println(i + " ^ " + j + " = " + (i ^ j));
		
	}	// main

}	// class
