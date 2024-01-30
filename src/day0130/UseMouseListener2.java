package day0130;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseMouseListener2 extends JFrame implements MouseListener, ActionListener {
	
	// 이벤트과 관련있는 컴포넌트를 인스턴스 변수에 선언
	// -> 클래스 안의 여러 method에서 사용하기 위해
	private DefaultListModel<String> dlmFriend;
	private DefaultListModel<String> dlmBlockFriend;
	private JList<String> jlFriend;
	private JList<String> jlBlockFriend;
	private JButton jbtnBlockAll, jbtnReturnAll;
	
	public UseMouseListener2() {
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
		jbtnReturnAll = new JButton("<<");
		
		JScrollPane jspFriend = new JScrollPane(jlFriend);
		JScrollPane jspBlockFriend = new JScrollPane(jlBlockFriend);
		
		jspFriend.setBorder(new TitledBorder("친구"));
		jspBlockFriend.setBorder(new TitledBorder("차단된 친구"));
		
		// 이벤트에 컴포넌트를 등록
		jlFriend.addMouseListener(this);
		jlBlockFriend.addMouseListener(this);
		jbtnBlockAll.addActionListener(this);
		jbtnReturnAll.addActionListener(this);
		
		setLayout(null);
		jspFriend.setBounds(20, 30, 150, 200);
		jspBlockFriend.setBounds(260, 30, 150, 200);
		jbtnBlockAll.setBounds(190, 90, 50, 30);
		jbtnReturnAll.setBounds(190, 140, 50, 30);
		
		add(jspFriend);
		add(jspBlockFriend);
		add(jbtnBlockAll);
		add(jbtnReturnAll);
		
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

	// 버튼을 누르면 친구 리스트에서 모든 값을 차단된 친구 리스트에 넣고 삭제
	@Override
	public void actionPerformed(ActionEvent e) {
//		String[] list = new String[dlmFriend.size()];
//		for(int i = 0; i < list.length; i++) {
//			list[i] = dlmFriend.getElementAt(i);
//			dlmBlockFriend.addElement(list[i]);
//		}	// end for
//		dlmFriend.removeAllElements();
		
		// 선생님 코드
		if(e.getSource() == jbtnBlockAll) {
			Object[] obj = new Object[dlmFriend.size()];	// 배열 생성
			obj = dlmFriend.toArray();	// 친구 리스트의 모든 값을 배열로 복사
			for(int i = 0; i < obj.length; i++) {
				dlmBlockFriend.addElement(obj[i].toString());
			}	// end for
			dlmFriend.removeAllElements();
		}	// end if
		
		if(e.getSource() == jbtnReturnAll) {
			Object[] obj = new Object[dlmBlockFriend.size()];	// 배열 생성
			obj = dlmBlockFriend.toArray();	// 차단된 친구 리스트의 모든 값을 배열로 복사
			for(int i = 0; i < obj.length; i++) {
				dlmFriend.addElement(obj[i].toString());
			}	// end for
			dlmBlockFriend.removeAllElements();
		}
	}	// actionPerformed

	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("mouseClicked");		
		// 키의 작업이 종료된 후
		// 어떤 키(왼쪽, 오른쪽, 휠)가 눌리든 호출됨 : 키에 대한 비교 필요
//		System.out.println(e.getButton());	// 어느 버튼이 눌렸는지 확인 가능(1:왼쪽, 2:휠, 3:오른쪽)
		switch(e.getButton()) {
		case MouseEvent.BUTTON1 :
			if(e.getSource() == jlFriend) {
				int ind = jlFriend.getSelectedIndex();
				if(ind != -1) {		// 클릭한 값들이 있을 때만 실행 
					// 선택된 인덱스에 해당하는 값을 Model에서 얻고
					String name = dlmFriend.getElementAt(ind);
					// 얻어낸 값을 차단된 친구로 등록 (dlmBlockFriend)
					dlmBlockFriend.addElement(name);
					// 선택된 인덱스에 해당하는 값을 Model에서 삭제
					dlmFriend.removeElementAt(ind);
				}	// end if
			}	// end if
			
			if(e.getSource() == jlBlockFriend) {
				int ind = jlBlockFriend.getSelectedIndex();
				if(ind != -1) {		// 클릭한 값들이 있을 때만 실행 
					// 선택된 인덱스에 해당하는 값을 Model에서 얻고
					String name = dlmBlockFriend.getElementAt(ind);
					// 얻어낸 값을 차단된 친구로 등록 (dlmBlockFriend)
					dlmFriend.addElement(name);
					// 선택된 인덱스에 해당하는 값을 Model에서 삭제
					dlmBlockFriend.removeElementAt(ind);
				}	// end if
			}	// end if
		}	// end if
	}	// mouseClicked

	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("mousePressed");
		// 처음 클릭되었을 때
		// 어떤 키(왼쪽, 오른쪽, 휠)가 눌리든 호출됨 : 키에 대한 비교 필요
	}	// mousePressed

	@Override
	public void mouseReleased(MouseEvent e) {
//		System.out.println("mouseReleased");
		// 클릭된 키가 올라왔을 때
		// 어떤 키(왼쪽, 오른쪽, 휠)가 눌리든 호출됨 : 키에 대한 비교 필요
	}	// mouseReleased

	@Override
	public void mouseEntered(MouseEvent e) {
//		System.out.println("mouseEntered");
	}	// mouseEntered

	@Override
	public void mouseExited(MouseEvent e) {
//		System.out.println("mouseExited");
	}	// mouseExited
	
	public static void main(String[] args) {
		new UseMouseListener2();
	}	// main

}	// class