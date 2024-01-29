package day0129;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *  WindowAdapter는 abstract method가 존재하지 않는 추상 클래스. <br>
 *  자식 클래스에서 반드시 Override 해야할 method가 없다. <br>
 *  개발자가 필요로 하는 method만 Override 하면 된다.
 */
public class WindowAdapterSub extends WindowAdapter {
	
	// WindowAdapterSub와 TestWindowEvent2는 has a 관계
	private TestWindowEvent2 twe2;		// null;
	
	// null인 twe2 주소에 주소를 할당하기 위해 생성자에 매개변수 선언
	public WindowAdapterSub(TestWindowEvent2 twe2) {
		this.twe2 = twe2;
	}	// WindowAdapterSub

	@Override
	public void windowClosing(WindowEvent e) {
		// TestWindowEvent2 클래스의 부모 클래스가 제공하는 dispose() 호출하여 TestWindowEvent2만 종료 
		twe2.dispose();	// has a로 설정된 twe2	의 dispose() 호출 
	}	// windowClosing
	
}	// class