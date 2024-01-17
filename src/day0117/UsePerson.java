package day0117;

/**
 * Person 클래스를 사용하기 위해(Person에서 제공하는 일을 하기 위해) 만든 클래스
 */

public class UsePerson {
	
	private void usePerson() {
		
		HongGilDong hgd = new HongGilDong();
		
		// 코드의 재사용성 : 부모클래스의 변수, method를 내 클래스에 존재하는 것처럼 사용.
		hgd.setName("홍길동");
		System.out.printf("눈 %d개, 코 %d개, 입 %d개, 이름 %s\n", hgd.getEye(), hgd.getNose(), hgd.getMouth(), hgd.getName());
		
		System.out.println(hgd.fight(5));	// 6->7
		System.out.println(hgd.fight(6));	// 7->8
		System.out.println(hgd.fight(8));	// 8->8
		System.out.println(hgd.fight(9));	// 8->7
		System.out.println(hgd.getLevel());	// 7		// level은 HongGilDong클래스의 인스턴스변수이므로 값 유지
		
		System.out.println("------------------------------");
		
		Clark c = new Clark();
		
		c.setName("클락켄트");
		System.out.printf("눈 %d개, 코 %d개, 입 %d개, 이름 %s\n", c.getEye(), c.getNose(), c.getMouth(), c.getName());
		
		System.out.println(c.power("다이아몬드"));	//10
		System.out.println(c.power("크립토나이트"));	// 0
		System.out.println(c.power("짱돌"));	//12
		System.out.println(c.power);	// power는 접근지정자 public이므로 바로 접근 가능 
		
		System.out.println("------------------------------");

		
		// 코드의 재 사용성 : 부모클래스에 존재하는 변수나 method를 자식 클래스에서 자식의 객체명으로 사용하는 것.
		// -> 부모에서 제공하는 기능이 자식과 맞지 않는 상황 발생!!
		System.out.println(hgd.eat());
		System.out.println(hgd.eat("국밥", 3));
		System.out.println(c.eat());
		System.out.println(c.eat("스테이크", 10));
		
		System.out.println("------------------------------");

		// toString() method 사용하여 hgd(객체)를 출력했을 때, 객체가 가리키는 주소가 아니라 "나는 홍길동이다."가 출력되도록 변경.
		System.out.println(hgd);
		System.out.println(c);
		
	}	// usePerson

	public static void main(String[] args) {
		
		UsePerson up = new UsePerson();
		up.usePerson();

	}	// main

}	// class
