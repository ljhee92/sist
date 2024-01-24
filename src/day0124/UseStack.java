package day0124;

import java.util.Stack;

/**
 *  LIFO (Last Input First Output)
 */

public class UseStack {
	
	public UseStack() {
		
		// 1. 생성) is a 관계의 객체화는 하지 않는다.
//		List<String> list = new Stack<String>();	// 안되는 것은 아님
		Stack<String> stk = new Stack<String>();
		
		// 2. 값 할당) push(item)
//		stk.add("입니다");	// 부모의 method를 사용하지 않는다.
//		stk.add("수요일");
//		stk.add("오늘은");
		stk.push("입니다");	// stack의 고유 method를 사용한다.
		stk.push("수요일");	
		stk.push("오늘은");
		
		// 3. 값 얻기) pop() : 얻어낸 item은 사라진다.
//		System.out.println(stk.empty());
		while(!stk.empty()) {	// stack에 아이템이 존재하지 않으면 반복하지 않는다.
			System.out.println(stk.pop());
		}	// end while
		
//		for(int i = 0; i < stk.size(); i++) {	// 부모의 method를 사용하지 않는다.
//			System.out.println(stk.get(i));		// 부모의 method인 get으로 빼면 아이템이 사라지지 않는다.
//		}	// end for
		
		System.out.println(stk.empty());
		
	}	// UseStack

	public static void main(String[] args) {
		new UseStack();
	}	// main 

}	// class