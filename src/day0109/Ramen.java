package day0109;

/**
 *  라면을 대상으로 추상화하여 작성한 클래스
 */
public class Ramen {
	
	private int noodle, soup;
	private String brandName;
	
	/**
	 * 라면 객체의 면의 개수를 설정하는 일 <br>
	 * 면의 개수는 1개로 고정, 설정된 면의 수가 1개가 아니어도 1개로 설정
	 * @param noodle 설정할 면의 개수
	 */
	public void setNoodle(int noodle) {
		if(noodle != 1) {
			noodle = 1;
		}	// end if
		this.noodle = noodle;
	}	// setNoodle
	
	
	/**
	 * 라면 객체의 스프의 개수를 설정하는 일 <br>
	 * 스프의 개수는 1~3개 사이, 그 이외의 값이 설정되면 1개로 설정
	 * @param soup 설정할 스프의 개수
	 */
	public void setSoup(int soup) {
		if(!(soup > 0 && soup < 4)) {
			soup = 1;
		}	// end if
		this.soup = soup;
	}	// setSoup
	
	
	/**
	 * 라면 객체의 브랜드명을 설정하는 일 <br>
	 * 브랜드명은 "신라면", "너구리", "안성탕면" 중 선택, 그 외의 값이 설정되면 "신라면"으로 설정
	 * @param brandName 설정할 브랜드명
	 */
	public void setBrandName(String brandName) {
		if(!(brandName.equals("신라면") || brandName.equals("너구리") || brandName.equals("안성탕면"))) {
			brandName = "신라면";
		}	// end if
		this.brandName = brandName;
	}	// setBrandName
	
	
	/**
	 * 설정된 면의 개수를 반환하는 일
	 * @return 설정된 면의 개수
	 */
	public int getNoodle() {
		return noodle;
	}	// getNoodle
	
	
	/**
	 * 설정된 스프의 개수를 반환하는 일
	 * @return 설정된 스프의 개수
	 */
	public int getSoup() {
		return soup;
	}	// getSoup
	
	
	/**
	 * 설정된 브랜드명을 반환하는 일
	 * @return 설정된 브랜드명
	 */
	public String getBrandName() {
		return brandName;
	}	// getBrandName
	
	
	/**
	 * 라면 객체의 '먹는' 동사적 특징을 구현
	 * @param count 먹는 개수
	 * @return 먹는 일
	 */
	public String eat(int count) {
		return count + "개의 " + brandName + "을/를 맛있게 먹는다!";
	}	// eat

}	// class
