package day0111;

public class TestThis {
	
	int i;
	int j;
	
	/**
	 * this를 사용하지 않고 인스턴스 변수 i에 할당된 값을 설정해보세요. <br>
	 * 인스턴스 method
	 * @param i
	 */
	public void setI(int i, TestThis t) {
		t.i = i;
	}	// setI
	
//	또는
//	public void setI(int a) {
//		i = a;
//	}	// setI
	
	
	public void setJ(int j) {
		this.j = j;			// this는 setJ method를 호출한 t객체의 주소를 가리킴. 여긴 t world!
							// t2가 호출하면 t2 world!
//		setJ(10);			// 재귀호출(내가 나를 부르는 것), 계속 적재되다가 overflow되면 error
	}	// setJ
	
	
	public static void main(String[] args) {
		
		TestThis t = new TestThis();
		
		System.out.println(t);	// t 객체의 주소
		t.setI(2024, t);
		System.out.println(t.i);	// 2024

		t.setJ(2024);
		System.out.println(t.j);	// 2024
		
		System.out.println("-----------------------------------------");
	
		TestThis t2 = new TestThis();
		
		System.out.println(t2);
		t2.setJ(1);
		System.out.println(t2.j);
		
//		System.out.println(this);
		// static 영역에서는 객체명 없이 호출 가능 -> this가 있을 수 없다.
		
	}	// main

}	// class
