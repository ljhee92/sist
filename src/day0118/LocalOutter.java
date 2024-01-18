package day0118;

/**
 *  local class(지역 클래스)
 */

public class LocalOutter {
	
	int i;
	
	public LocalOutter() {
		System.out.println("바깥 클래스의 생성자");
	}	// LocalOutter
	
	
	public void test() {
		System.out.println("바깥 클래스의 method");
	}	// test 
	
	
	public void method(int paramI, final int paramJ) {	// 매개변수 paramI는 final이 붙지 않았지만 method 안에서는 붙은 것처럼 사용된다.
		
		int locI = 2;		// 지역변수 locI는 final이 붙지 않았지만 지역클래스 안에서는 붙은 것처럼 사용된다.
		final int locJ = 15;
		
		////////////////////////////////// local class 시작 //////////////////////////////////
		
		class Local {
		
			int j;		// 인스턴스 변수 선언 가능
			
			public Local() {
				System.out.println("지역 클래스의 생성자");
			}	// Local
			
			
			public void inMethod() {
				System.out.println("지역 클래스의 method");
				
				i = 18;	// 바깥 클래스의 인스턴스 변수 사용 가능
				System.out.println(i);
				
				test();	// 바깥 클래스의 method 호출 가능
				
				// method의 매개변수 사용: JDK1.8 이하에서는 final이 있는 변수만 사용 가능 
				// 매객변수 paramI는 final이 붙지 않았지만 method 안에서는 붙은 것처럼 사용된다.
//				paramI = 20;	// final은 변경 불가!
				System.out.println(paramI + ", " + paramJ);
				
				// method 내의 지역변수 사용
				// 지역변 locI는 final이 붙지 않았지만 지역클래스 안에서는 붙은 것처럼 사용된다.
//				locI = 30;
				System.out.println(locI + ", " + locJ);
				
			}	// inMethod
			
		}	// class 

		////////////////////////////////// local class 끝 //////////////////////////////////
		
		Local lo = new Local();
		lo.inMethod();
		
	}	// method
	
	public static void main(String[] args) {
		
		LocalOutter lo = new LocalOutter();
		lo.method(2024, 1);
		
	}	// main

}	// class