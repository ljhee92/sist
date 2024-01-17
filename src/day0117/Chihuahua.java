package day0117;

/**
 *  Dog 클래스를 상속받는 자식 클래스(치와와) 
 */

public class Chihuahua extends Dog {
	
	private int angryLevel;
	
	public Chihuahua() {
		System.out.println("치와와는 사나워!");
		angryLevel = 10;
	}	// Chihuahua
	
	
	public String angry(int touchPoint) {
		String result = "";
		if(touchPoint > 0 && touchPoint < 2) {
			angryLevel += 2;
			result = getName() + " 앵그리 지수 2 증가";
		} else if(touchPoint >= 2 ) {
			angryLevel += 5;
			result = getName() + " 앵그리 지수 5 증가 ㅠㅠ";
		} else {
			angryLevel++;
			result = "가만히 있어도 앵그리 지수 1 증가;;";
		}	// end else
		return result;
	}	// angry 
	
	

	public int getAngryLevel() {
		return angryLevel;
	}	// getAngryLevel


	/**
	 * 개가 주인을 보면 짖는 동사적 특징 중 치와와가 사납게 짖는 일을 Override 
	 */
	@Override
	public String bark(int count) {
		return getName() + "은 주인을 보면 " + count + "번 사납게 와와와왈 짖는다! ૮˃̵֊ ˂̵ ა";
	}	// bark

}	// class