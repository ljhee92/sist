package day0116.sub;

public class ConParent {
	
	public ConParent() {
		this(2024);
		System.out.println("부모의 기본생성자");
	}	// ConParent
	
	public ConParent(int i) {
		System.out.println("부모의 인자 생성자 " + i);
	}	// ConParent
	
//	public ConParent() {
//		System.out.println("부모의 기본생성자");
//	}	// ConParent
//	
//	public ConParent(int i) {
//		this();
//		System.out.println("부모의 인자 생성자 " + i);
//	}	// ConParent

}	// class