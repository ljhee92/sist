package day0110;

/**
 * 생성자 연습 <br>
 *  - 생성자는 직접 호출 불가능하고, new(객체 생성용 키워드)로만 호출 가능 <br>
 *  - 생성자를 반환형 없이 클래스의 이름과 동일하게 생성 <br>
 *    접근지정자 클래스명() {}
 */

public class TestConstructor {
	
	/**
	 * 매개변수 없는 기본 생성자
	 */
	public TestConstructor() {
		System.out.println("default constructor!! 기본 생성자");
	}	// TestConstructor
	
	
	/**
	 * 매개변수 있는 생성자
	 * @param i
	 */
	public TestConstructor(int i) {
		System.out.println("overloading constructor!! 생성자의 다형성");
	}	// TestConstructor
	
	
	public void test() {		// instance method (instance 영역) 
		System.out.println("나는 test method");
	}	// test
	
	
	public void temp() {		// instance method (instance 영역)
		System.out.println("나는 temp method");
		test();					// test와 temp가 동일 영역(instance 영역)으로 객체 생성 없이 직접 호출 가능
//		TestConstructor();		// 생성자는 영역이 같더라도 직접 호출 불가능
		new TestConstructor();	// 생성자는 new로만 호출 가능
	}	// temp
 
	
	public static void main(String[] args) {		// main은 static 영역
		
		// 객체화 = 생성자 호출
		// temp()는 instance 영역, main은 staic 영역으로 다른 영역이므로
		// static 영역에서 instance 영역의 method를 호출하려면 객체화 하여 호출
		TestConstructor tc = new TestConstructor();
		tc.temp();

		TestConstructor tc2 = new TestConstructor(2024);
		tc2.temp();
		
	}	// main

}	// class
