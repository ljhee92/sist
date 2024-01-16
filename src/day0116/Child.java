package day0116;

/**
 *  자식 클래스 : 공통 특징은 부모에서 제공하는 것을 사용하고, 나 자신의 특징적인 일을 구현하여 사용
 */

public class Child extends Parent {

	String name;
	String msg;
	
	public Child() {
		System.out.println("자식의 생성자: " + this);
		msg = "이 편지는 아프리카에서부터 시작되었음!";		// 내 class 안에 msg가 없다면 부모 class의 msg를 사용 -> 코도의 재 사용성
	}	// Child

	/**
	 * 자식의 method
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 자식의 method 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void printMsg() {
		System.out.println("부모: " + super.msg + ", 자식: " + msg);
		System.out.println("자식: " + msg);
		super.printMsg();	// printMsg()만 하게되면 재귀호출
	}	// printMsg
		
	public static void main(String[] args) {
		
		// 상속 관계에서는 자식 클래스로 객체화 한다. -> 부모가 먼저 만들어진다.
		Child c = new Child();
		
		// 코드의 재 사용성(부모가 가진 접근 가능한 변수나 method를 자식에서 자신의 객체명(c)으로 사용할 수 있는 것)
		c.setAge(20);
		c.setName("루피");
		System.out.println(c.getAge());
		System.out.println(c.getName());
		
		c.printMsg();
		
	}	// main
	
}	// class