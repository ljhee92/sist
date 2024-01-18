package day0118;

/**
 *  inner class: <br>
 *   - 디자인 클래스 안에서 이벤트를 처리할 때 사용 <br>
 *   - 안쪽 클래스를 인스턴스 변수처럼 사용할 때
 */

public class Outter {
	
	int outI;
	
	public Outter() { 
		System.out.println("바깥 클래스의 생성자");
	}	// Outter
	
	
	public void outMethod() {
		
		System.out.println("바깥 클래스의 method");
		// 바깥 클래스에서 안쪽 클래스의 자원을 사용하려면 객체화하여 사용한다.
		Outter.Inner in = this.new Inner();
//		Inner in = new Inner();		// 바깥클래스명.과 this.는 생략 가능
		in.inI = 12;
		System.out.println(in.inI);
		in.inMethod();
		
	}	// outMethod
	
	////////////////////////////////// inner class 시작 //////////////////////////////////
	
	public class Inner {

		int inI;
		
		public Inner() {
			System.out.println("안쪽 클래스의 생성자");
		}	//	Inner
		
		
		public void inMethod() {
			System.out.println("안쪽 클래스의 method");
			outI = 2024;		// 바깥 클래스의 자원을 직접 사용 가능 
			System.out.println(outI);
		}	// inMethod
		
	}	// class
	
	////////////////////////////////// inner class 끝 //////////////////////////////////
	
	public static void main(String[] args) {
		
		// 1. 바깥 클래스의 객체화
		Outter out = new Outter();
		out.outMethod();
		
		// 2. 안쪽 클래스의 객체화 : (바깥클래스명.)안쪽클래스명 객체명 = 바깥클래스객체명.new 안쪽생성자();
		//						-> 바깥클래스명. 은 생략 가능
		Outter.Inner in = out.new Inner();
		in.inMethod();
		
	}	// main

}	// class