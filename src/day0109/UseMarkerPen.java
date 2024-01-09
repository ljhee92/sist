package day0109;

/**
 *  MarkerPen 클래스에서 제공하는 일을 사용하기 위한 클래스
 */

public class UseMarkerPen {

	public static void main(String[] args) {
		
		// 마카펜 클래스를 객체화
		MarkerPen pen1 = new MarkerPen();
		System.out.println("주소: " + pen1);
		
		
		// 변수에 값을 직접 할당 -> 휴먼에러 가능성 높음, 입력값을 체크하는 코드를 중복해서 만들어야 함.
		// setter method를 통해 전달받은 값에 대한 유효성 검증
		// 변수 사용
		pen1.setCap(2);
		pen1.setBody(1);
		pen1.setColor("노란");
		System.out.printf("뚜껑의 개수: %d개, 몸체의 개수: %d개, 색깔은 %s색\n", pen1.getCap(), pen1.getBody(), pen1.getColor());
		
		
		// 클래스가 제공하는 기능(method) 사용
		String result = pen1.write("오늘은 눈 내리는 화요일!!!");
		System.out.println(result);
		
	}	// main

}	// class
