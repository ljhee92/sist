package day0118;

/**
 *  nested class <br>
 *   - 안쪽클래스를 static 변수처럼 사용할 때. (객체화 없이 직접 사용할 때)
 */

public class NestedOutter {
	
	int outI;			// 인스턴스변수(객체의 크기에 포함)
	static int outJ;	// static변수(객체의 크기에 포함X)
	
	public NestedOutter() {
		System.out.println("바깥 클래스의 생성자");
	}	// NestedOutter
	
	
	public void outInsMethod() {
		System.out.println("바깥 클래스의 instance method");
	}	// outInsMethod
	
	
	public static void outStaMethod() {
		System.out.println("바깥 클래스의 static method");
	}	// outStaMethod
	
	////////////////////////////////// nested class 시작 //////////////////////////////////
	
	static class Inner {	// 생성자를 만들지 않는다. (static은 객체를 생성하여 사용하지 않기 때문)
		
		// 변수나 method는 static으로 만들어 객체 없이 '클래스명.'으로 사용하도록 한다.
		static int inI;
		
		public static void inMethod() {
			System.out.println("안쪽 클래스의 method");
//			outI = 10;	// static 영역에서 instance 영역의 변수는 사용할 수 없다.
//			outInsMethod();	// static 영역에서 instance 영역의 method는 사용할 수 없다.
			
			outJ = 20;	// static 영역에서 static 영역의 변수는 객체없이 바로 사용 가능
			outStaMethod();	// static 영역에서 static 영역의 method는 객체없이 바로 사용 가능
		}	// inMethod
		
	}	// class
	
	////////////////////////////////// nested class 끝 //////////////////////////////////

	
	
	public static void main(String[] args) {
		
		Inner.inMethod();	// nested class는 객체 없이 클래스명으로 직접 사용할 수 있다.
		outStaMethod();		// static 영역에서 static 영역의 method는 객체없이 바로 사용 가능
		
	}	// main

}	// class