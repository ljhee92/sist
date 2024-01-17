package day0117;

/**
 *  추상 클래스를 구현한 클래스 <br>
 *  부모 클래스의 모든 abstract method를 Override 해야 한다.
 */

public class AbstractSub extends AbstractSuper {
	
	public AbstractSub() {
		super();	// 숨어있음
		System.out.println("자식의 기본생성자");
	}	// AbstractSub

	@Override
	public String msg() {
		return "Override한 method";
	}	// msg

	@Override
	public String msg(String msg) {
//		super.msg("안녕");	// error 부모의 msg는 추상 method로 body가 없어서 호출될 수 없다. 
		return msg + "입니다.";
	}	// msg

	public static void main(String[] args) {
		
		// 자식 클래스 객체화, 자식 클래스가 생성되면 부모 클래스부터 생성된다. (이 때엔 객체화 가능)
		AbstractSub aSub = new AbstractSub();
		System.out.println(aSub.msg());
		System.out.println(aSub.msg("수요일"));
		
		System.out.println("--------------------");
		
		// is a 관계의 객체화 -> 자식 클래스의 Override된 method로 호출
		AbstractSuper aSuper = new AbstractSub();
		System.out.println(aSuper.msg());
		System.out.println(aSuper.msg("수요일"));

	}	// main

}	// class