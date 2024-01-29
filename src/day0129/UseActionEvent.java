package day0129;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *  1. Window Component 상속 -> JFrame, 이벤트 처리용 xxxListener 구현 <br>
 *    (Container Component 상속은 JPanel)
 */
@SuppressWarnings("serial")
public class UseActionEvent extends JFrame implements ActionListener {
	
	// 3. Override한 actionPerformed method에서 사용해야 할 컴포넌트를 인스턴스 변수로 선언.
	private JTextField jtfName;
	private JTextArea jtaList;
	private JComboBox<String> jcbGender;
	
	public UseActionEvent() {
		
		super("여러 레이아웃 매니저 사용");
		
		// 2. 컴포넌트 생성
		JLabel jlblName = new JLabel("이름");
		jtfName = new JTextField(10);
		
		jcbGender = new JComboBox<String>();	// MVC 패턴을 적용할 클래스인데, 모델을 사용하지 않음
		jcbGender.addItem("남자");
		jcbGender.addItem("여자");
		
		JButton jbtnInput = new JButton("입력");
		
		jtaList = new JTextArea();
		JScrollPane jsp = new JScrollPane(jtaList);
		
		// 4. 컴포넌트를 이벤트에 등록
		jbtnInput.addActionListener(this);	// jbtnInput 버튼을 눌러도
		jtfName.addActionListener(this);	// jtfName에서 엔터를 쳐도 이벤트에 등록
		
		// 5. 배치
		// 여러 개의 컴포넌트를 관리하기 위해서 Container Component를 사용
		JPanel jpNorth = new JPanel();	// FlowLayout
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jcbGender);
		jpNorth.add(jbtnInput);
		
		// 윈도우 컴포넌트(사용자에게 보여주는 일)에 배치
		add("North", jpNorth);
		add("Center", jsp);
		
		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	// UseActionEvent

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트가 발생했을 때 사용자에게 제공할 코드
		// JTextField의 값을 가져와서 JTextArea에 설정
		String data = jtfName.getText();
		
		// Model 객체를 사용하지 않았으므로 View 객체에서 선택된 아이템의 값을 얻는다.
		String gender = (String)jcbGender.getSelectedItem();
		jtaList.append(gender + " " + data + "님\n");
		
		// JTextField에 입력된 이름을 삭제
		jtfName.setText("");
	}	// actionPerformed

	public static void main(String[] args) {
		new UseActionEvent();
	}	// main

}	// class