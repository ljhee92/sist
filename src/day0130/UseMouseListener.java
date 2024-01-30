package day0130;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class UseMouseListener extends JFrame implements ListSelectionListener {
	
	// 이벤트과 관련있는 컴포넌트를 인스턴스 변수에 선언
	// -> 클래스 안의 여러 method에서 사용하기 위해
	private DefaultListModel<String> dlmFriend;
	private DefaultListModel<String> dlmBlockFriend;
	private JList<String> jlFriend;
	private JList<String> jlBlockFriend;
	private JButton jbtnBlockAll;
	
	public UseMouseListener() {
		super("친구 리스트");
		
		// MVC 패턴이 도입된 컴포넌트(데이터를 가진 컴포넌트)는 Model에 값을 설정한다.
		dlmFriend = new DefaultListModel<String>();
		dlmFriend.addElement("루피");
		dlmFriend.addElement("나루토");
		dlmFriend.addElement("이치고");
		dlmFriend.addElement("쵸파");
		dlmFriend.addElement("히루루크");
		
		dlmBlockFriend = new DefaultListModel<String>();
		
		// Model 객체와 has a 관계로 View 객체를 생성
		jlFriend = new JList<String>(dlmFriend);
		jlBlockFriend = new JList<String>(dlmBlockFriend);
		
		// JButton은 MVC 패턴이 도입되지 않은 컴포넌트(데이터를 가지지 않은 컴포넌트)
		jbtnBlockAll = new JButton(">>");
		
		JScrollPane jspFriend = new JScrollPane(jlFriend);
		JScrollPane jspBlockFriend = new JScrollPane(jlBlockFriend);
		
		jspFriend.setBorder(new TitledBorder("친구"));
		jspBlockFriend.setBorder(new TitledBorder("차단된 친구"));
		
		// 이벤트에 컴포넌트를 등록
		jlFriend.addListSelectionListener(this);
		jlBlockFriend.addListSelectionListener(this);
		
		setLayout(null);
		jspFriend.setBounds(20, 30, 150, 200);
		jspBlockFriend.setBounds(260, 30, 150, 200);
		jbtnBlockAll.setBounds(190, 110, 50, 30);
		
		add(jspFriend);
		add(jspBlockFriend);
		add(jbtnBlockAll);
		
		setBounds(100, 100, 450, 300);
		setResizable(false);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}	// windowClosing
		});
	}	// UseMouseListener

	@Override
	public void valueChanged(ListSelectionEvent e) {
		System.out.println(dlmFriend.getElementAt(jlFriend.getSelectedIndex()));
		// ListSelectionEvent 사용 시 값을 두 개 뽑아내므로 에러!
	}	// valueChanged

	public static void main(String[] args) {
		new UseMouseListener();
	}	// main

}	// class