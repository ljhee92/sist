package day0109;

/**
 *  MarkerPen 클래스에서 제공하는 일을 사용하기 위한 클래스
 */

public class UseMarkerPen {

	public static void main(String[] args) {
		
		// 마카펜 클래스를 객체화
		MarkerPen black = new MarkerPen();
		System.out.println("주소: " + black);
		
		
		// 변수에 값을 직접 할당 -> 휴먼에러 가능성 높음, 입력값을 체크하는 코드를 중복해서 만들어야 함.
		// setter method를 통해 전달받은 값에 대한 유효성 검증
		// 변수 사용
		black.setCap(2);
		black.setBody(1);
		black.setColor("노란");
		System.out.printf("뚜껑의 개수: %d개, 몸체의 개수: %d개, 색깔은 %s색\n", black.getCap(), black.getBody(), black.getColor());
		
		
		// 클래스가 제공하는 기능(method) 사용
		String result = black.write("오늘은 눈 내리는 화요일!!!");
		System.out.println(result);
		
	}	// main

}	// class
