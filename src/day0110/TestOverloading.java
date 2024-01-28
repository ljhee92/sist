package day0110;

/**
 * polymorphism <br>
 * method overloading : 하나의 클래스 안에서 같은 이름의 method를 여러 개 정의하는 것 <br>
 * 편의성을 위해!
 */
public class TestOverloading {
	
	// 별 하나를 출력하는 메소드
//	private int printStar() {	// 접근지정자와 반환형은 overloading에 영향을 주지 않는다. 단, 웬만하면 동일하게 설정한다.
	public void printStar() {
		System.out.println("*");
	}	// printStar
	
	
	// 입력되는 수만큼 별을 옆으로 출력하는 메소드
	public void printStar(int count) {
		for(int i = 0; i < count; i++) {
			System.out.print("*");
		}	// end for
	}	// printStar

	public static void main(String[] args) {
		
		TestOverloading to = new TestOverloading();
		
		// printStar method만으로도 별 한 개도, 여러 개도 출력할 수 있다! -> 편하다! 
		to.printStar();
		to.printStar(100);	// overload된 method 호출

	}	// main

}	// class
