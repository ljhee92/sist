package day0108;

/**
 *  instance method <br>
 *   - instance variable 사용하여 업무를 처리해야 할 때 <br>
 *   - 객체화 후에 객체명으로 메소드 호출
 */
public class TestInstanceMethod {
	
	int day;		// instance variable 선언
	
	public void printDay() {
		System.out.println(day + "일");
	}	// pritnDay		// method의 중괄호: 호출한 곳으로 돌아가!

	
	public static void main(String[] args) {
	
//		TestInstanceMethod.printDay();	// instance method는 클래스명으로 호출할 수 없다.
		
		TestInstanceMethod tim = new TestInstanceMethod();	// instance화(객체화)
		tim.day = 8;	// instance varialbe 사용
		tim.printDay();	// 객체명.method명으로 instance method 호출
		
		tim.day++;		// instance variable 조
		tim.printDay();	// 객체 사용이 종료될 때까지 값 유지
		
	}	// main

}	// class
