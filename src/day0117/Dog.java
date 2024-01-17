package day0117;

/**
 *  개를 대상으로 추상화한 클래스 
 */

@SuppressWarnings("unused")
public abstract class Dog {
	
	private int eye;
	private int nose;
	private int mouth;
	private String name;
	
	public Dog() {
		this(2, 1, 1);
	}	// Dog
	
	
	public Dog(int eye, int nose, int mouth) {
		this.eye = eye;
		this.nose = nose;
		this.mouth = mouth;		
	}	// Dog

	
	public String getName() {
		return name;
	}	// getName
	

	public void setName(String name) {
		this.name = name;
	}	// setName
	
	
	/**
	 * 개의 동사적 특징 중 짖는 일을 구현하는 method
	 * @return 짖는 행동
	 */
	public String bark() {
		return name + "이/가 짖는다!";
	}	// bark
	
	
	/**
	 * 개의 동사적 특징 중 주인을 보면 짖는 일을 정의한 method
	 * @param count 짖는 회수
	 * @return 짖는 행동
	 */
	public abstract String bark(int count);

}	// Dog