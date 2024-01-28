package day0110;

/**
 *  마카펜을 대상으로 하여 추상화한 후 작성하는 클래스
 */

public class MarkerPen {
	
	/**
	 * 뚜껑 1개, 몸체 1개, 검은색 마카펜을 생성할 때 사용하는 기본 생성자
	 */
	public MarkerPen() {
//		cap = 1;
//		body = 1;
//		color = "검은";
		this(1, 1, "검은");	// this를 사용하여 코드 중복을 줄일 수 있다.
	}	// MarkerPen
	
	
	/**
	 * 입력된 값으로 마카펜 객체를 생성하는 인자 있는 생성자 (overloading된 생성자) <br>
	 * 색이 "검은", "파란", "빨간"만 설정할 수 있다. <br>
	 * 그 이외의 색이 입력되면 "검은"으로 설정한다.
	 * @param cap 뚜껑의 수
	 * @param body 몸체의 수
	 * @param color 색깔
	 */
	public MarkerPen(int cap, int body, String color) {
		this.cap = cap;
		this.body = body;
//		this.color = color;
		setColor(color);	// 색 유효성 검증 -> this로 사용하고 if문을 여기에 직접 쓸 수도 있음
	}	// MarkerPen
	
	
	private int cap, body;
	private String color;	// 검은, 파란, 빨간
	
	/**
	 * 생성된 마카펜 객체의 뚜껑 개수를 설정하는 일 <br>
	 * 마카펜의 뚜껑은 1개만 설정된다.
	 * @param cap 설정할 뚜껑 개수
	 */
	public void setCap(int cap) {
		if(cap != 1) {
			cap = 1;
		}	// end if
		this.cap = cap;
	}	// setCap
	
	
	/**
	 * 생성된 마카펜 객체의 뚜껑 개수를 반환하는 일
	 * @return 마카펜 객체의 뚜껑 개수
	 */
	public int getCap() {
		return cap;
	}	// getCap
 	
	
	/**
	 * 생성된 마카펜 객체의 몸체 개수를 설정하는 일
	 * @param body 설정할 몸체 개수
	 */
	public void setBody(int body) {
		this.body = body;
	}	// setBody
	
	
	/**
	 * 생성된 마카펜 객체의 몸체 개수를 반환하는 일 
	 * @return 마카펜 객체의 몸체 개수
	 */
	public int getBody() {
		return body;
	}	// getBody
	
	
	/**
	 * 생성된 마카펜 객체의 색깔을 설정하는 일 <br>
	 * 색깔은 "검은", "파란", "빨간"만 설정할 수 있다. <br>
	 * 그 이외의 색이 입력된다면 "검은"색으로 설정한다.
	 * @param color 설정할 색깔 
	 */
	public void setColor(String color) {
		if (!(color.equals("검은") || color.equals("파란") || color.equals("빨간"))) {
			color = "검은";
		}	// end if
		this.color = color;
	}	// setColor
	
	
	/**
	 * 생성된 마카펜 객체의 색깔을 반환하는 일
	 * @return 마카펜 객체의 색깔
	 */
	public String getColor() {
		return color;
	}	// getColor
	
	
	/**
	 * 생성된 마카펜 객체의 칠판에 쓰는 동사적인 특징을 구현
	 * @param msg 쓰고 싶은 메세지 
	 * @return 쓰는 일
	 */
	public String write(String msg) {
		return "\"" + msg + "\"" + "을/를 " + color + "색 펜으로 칠판에 쓴다.";
	}	// write

}	// class
