package day0122;

import java.util.Random;

public class UseRandom {
	
	public UseRandom() {
		
		// 1. 객체 생성
		Random r = new Random();
		Random r2 = new Random(r.nextLong());
		
		// 정수의 난수 얻기
		int num = r2.nextInt();
		System.out.println("발생한 난수: " + num);
		System.out.println("범위의 난수: " + num % 10);
		System.out.println("범위의 난수를 양수로: " + Math.abs(num % 10));
		
		// 범위의 난수를 양수로 쉽게 얻기
		int num2 = r2.nextInt(10);
		System.out.println(num2);
	
		// 실수의 난수
		double d = r2.nextDouble();
		System.out.println("발생한 난수: " + d);
		System.out.println("범위의 난수: " + d * 10);
		System.out.println("범위의 난수에서 정수만: " + (int)(d * 10));
		
		// 불린의 난수
		boolean b = r2.nextBoolean();
		System.out.println(b);
		
		System.out.println(r2.nextInt(10));
		System.out.println(r2.nextInt(10));
		System.out.println(r2.nextInt(10));
		System.out.println(r2.nextInt(10));
		System.out.println(r2.nextInt(10));
		
	}	// UseRandom
	

	public static void main(String[] args) {
		
		new UseRandom();

	}	// main

}	// class