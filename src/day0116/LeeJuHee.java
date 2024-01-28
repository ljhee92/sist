package day0116;

/**
 *  사람의 기본 특징을 가진 부모클래스 Person의 자식 클래스
 *  피곤함 정도는 최소 -5, 최대 10
 */

public class LeeJuHee extends Person {
	
	private int tiredness;
	
	public LeeJuHee() {
		super();
		tiredness = 0;
	}	// LeeJuHee

	/**
	 * 이주희의 기본 생성자. 눈 2개, 코 1개, 입 1개인 사람이 태어남. <br>
	 * 이주희는 잠을 잘 잔다.
	 * @return
	 */
	public int getTiredness() {
		return tiredness;
	}	// getTiredness
	
	public String sleep(int time) {
		String condition = "";
		
		if(time >= 0 && time < 6) {
			condition = "상태 최악";
			tiredness++;
			if(tiredness > 10) {
				tiredness = 10;
			}	// end if
		} else if(time >= 6 && time < 8) {
			condition = "상태 평범";
		} else if(time >= 8) {
			condition = "상태 좋음";
			tiredness--;
			if(tiredness < -5) {
				tiredness = -5;
			}	// end if
		} else {
			condition = "시간이 잘못 설정되었습니다.";
		}	// end else
		
		return condition;
	}	// sleep 

}	// class
