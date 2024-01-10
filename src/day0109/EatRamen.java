package day0109;

/**
 *  Ramen 클래스에서 제공하는 일을 사용하기 위한 클래스
 */

public class EatRamen {

	public static void main(String[] args) {
		
		Ramen rm = new Ramen();
		
		// setter method를 통해 유효성 검증을 할 수 있다.
		rm.setNoodle(4);
		rm.setSoup(2);
		rm.setBrandName("오징어짬뽕");
		
		System.out.printf("라면의 면의 개수는 %d개, 스프의 개수는 %d개, 브랜드명은 %s이다.\n", rm.getNoodle(), rm.getSoup(), rm.getBrandName());
		
		rm.setBrandName("너구리");
		// 클래스 기능 사용
		System.out.println(rm.eat(2));

	}	// main

}	// class
