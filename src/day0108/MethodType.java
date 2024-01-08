package day0108;

/**
 *  method의 형태: 고정 일, 가변 일, 고정 값, 가변 값 
 */

public class MethodType {
	
	// 고정 일: 반환형 없고(void), 매개변수 없는 형
	public void typeA() {				// -> instance method
		System.out.println("고정 일");
	}	// typeA
	
	
	// 가변 일: 반환형 없고(void), 매개변수 있는 형 -> 매개변수가 있으면 동적이다.
	public void typeB(int i) {
		System.out.println("가변 일: " + i);
	}	// typeB
	
	
	// 고정 값: 반환형 있고, 매개변수 없는 형
	// 반드시 method의 가장 마지막줄에 return이 나와야 한다.
	public int typeC() {
		int i = 2024;
		return i;
	}	// typeC
	
	
	// 가변 값: 반환형 있고, 매개변수 있는 형 -> 매개변수가 있으면 동적이다.
	public int typeD(double d) {
		return (int)d;
	}	// typeD

	
	public static void main(String[] args) {
		
		// 객체화: 인스턴스 변수나 인스턴스 method를 사용하기 위해
		// 클래스명 객체명 = new 클래스명();
		MethodType mt = new MethodType();
		
		// 고정 일 method 호출 -> 여러 번 호출해도 같은 일을 한다.
		mt.typeA();
		mt.typeA();
		mt.typeA();
		
		
		// 가변 일 method 호출 -> 외부 값(arguments)에 대해 다른 일을 수행한다.
		mt.typeB(1);
		mt.typeB(2);
		mt.typeB(3);
		
		
		// 고정 값 method 호출 -> 반환형에 일치하는 데이터형으로 변수를 만들고, 반환값을 저장하여 사용한다.
		int i = mt.typeC();
		System.out.println("고정 값: " + i);
		i = mt.typeC();
		System.out.println("고정 값: " + i);
		int j = mt.typeC();
		System.out.println("고정 값: " + j);
		
		
		// 가변 값 method 호출 -> 반환형에 일치하는 데이터형으로 변수를 만들고, 반환값을 저장하여 사용한다.
		i = mt.typeD(1.08);
		System.out.println("가변 값: " + i);
		i = mt.typeD(2024.01);
		System.out.println("가변 값: " + i);
		i = mt.typeD(5.8);
		System.out.println("가변 값: " + i);

	}	// main

}	// class
