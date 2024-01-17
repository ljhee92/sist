package day0117;

/**
 *  OverrideSub는 OverrideSuper의 자식 클래스
 */

public class OverrideSub extends OverrideSuper {
	
	int j;
	
	public OverrideSub() {
		System.out.println("자식클래스의 생성자");
	}	// OverrideSub
	
	
	public void temp() {
		System.out.println("자식클래스만 가지고 있는 method");
	}	// temp
	
	
	/**
	 * Override의 규칙: 접근지정자는 광의의 접근지정자(protected -> public)로 달라도 되고, <br>
	 * 반환명, method명, 매개변수는 동일하게 만든다.
	 */
	@Override 
	public void printI() {
		System.out.println("자식클래스의 printI j: " + j + ", i: " + this.i);
		// i를 this로 찾더라도 heap에 저장된 this의 위치부터 아래로 쭉 찾아가는 것이기 때문에 가능
	}	// printI 

	
	public static void main(String[] args) {
		
		// 자식클래스로 객체화: 부모의 모든 자원(변수, method), 자식의 모든 자원을 사용할 수 있다. 
		OverrideSub oSub = new OverrideSub();
		oSub.i = 2024;		// 부모의 변수 사용 가능
		oSub.j = 1;			// 자식의 변수 사용 가능
		
		oSub.test();		// 부모의 method 호출 가능
		oSub.temp(); 		// 자식의 method 호출 가능
		
		oSub.printI();		// 자식의 mehtod 호출 가능(부모에 있는 method를 Override한 method, Override가 최우선)
		
		System.out.println("----------------------");
		
		//is a 관계의 객체화
		OverrideSuper oSuper = new OverrideSub();
		oSuper.i = 12;		// 부모의 변수 사용 가능
//		oSuper.j = 40;		// 자식의 변수 사용 불가(안보여!)
		
		oSuper.test();		// 부모의 method 호출 가능
//		oSuper.temp();		// 자식의 method 호출 불가(안보여!)
		
		oSuper.printI(); 	// 자식이 Override한 method로 호출(Override 최우선)

	}	// main 

}	// class 