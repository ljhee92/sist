package day0131;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class UseJOptionPane extends JFrame implements ActionListener, WindowListener {
	
	private JMenuItem jmiInput, jmiMessage, jmiConfirm;
	
	public UseJOptionPane() {
		
		super("JOptionPane 사용");
		
		JMenuBar jmb = new JMenuBar(); // 메뉴바 생성
		JMenu jm = new JMenu("사용");	// 메뉴 생성
		
		// 메뉴 아이템 생성
		jmiInput = new JMenuItem("input dialog");
		jmiMessage = new JMenuItem("message dialog");
		jmiConfirm = new JMenuItem("confirm dialog");
		
		// 메뉴아이템 > 메뉴 배치
		jm.add(jmiInput);
		jm.add(jmiMessage);
		jm.add(jmiConfirm);
		
		// 메뉴 > 메뉴바에 배치
		jmb.add(jm);
		
		// 메뉴바 > Frmae 설정
		setJMenuBar(jmb);
		
		// 이벤트 등록
		jmiInput.addActionListener(this);
		jmiMessage.addActionListener(this);
		jmiConfirm.addActionListener(this);
		
		setBounds(100, 100, 300, 300);
		setVisible(true);
		
		// X 버튼이 눌렸을 때 "아무 것도 하지 않도록 설정"
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		addWindowListener(this);	// window 이벤트가 발생하면 현재 클래스 안에서 이벤트를 처리
		
	}	// USeJOptionPane
	
	private void useInput() {
		String data = JOptionPane.showInputDialog("이름을 입력해주세요.", "홍길동");
		if(data != null) {	// 취소를 누르면 null이 입력
			System.out.println(data);
		}	// end if
	}	// useInput
	
	private void useMessage() {
//		JOptionPane.showMessageDialog(this, "오늘은 수요일입니다.");
		JOptionPane.showMessageDialog(this, "오늘은 수요일입니다.", "오늘의 요일", JOptionPane.ERROR_MESSAGE);
	}	// useMessage

	private void useConfirm() {
		int flag = JOptionPane.showConfirmDialog(this, "오늘 수업은 여기까지 하겠습니까?");
		System.out.println(flag);
		switch(flag) {
		case JOptionPane.OK_OPTION :
			JOptionPane.showMessageDialog(this, "감사합니다.");
			break;
		case JOptionPane.NO_OPTION :
			JOptionPane.showMessageDialog(this, "수업 계속해요.");
			break;
		case JOptionPane.CANCEL_OPTION :
			JOptionPane.showMessageDialog(this, "아무 생각 없습니다.");
		}	// end switch~case
	}	// useConfirm

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jmiInput) {
			useInput();
		}	// end if
		if(e.getSource() == jmiMessage) {
			useMessage();
		}	// end if
		if(e.getSource() == jmiConfirm) {
			useConfirm();
		}	// end if
	}	// actionPerformed

	@Override
	public void windowOpened(WindowEvent e) {
		
	}	// windowOpened

	/**
	 * Window의 X 버튼을 누르면 windowClosing이 호출된다.
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		int flag = JOptionPane.showConfirmDialog(this, "정말 종료하시겠습니까?");
		// "예"가 눌려지면 프로그램이 종료되어야 하지만,
		// "아니오"나 "취소"가 눌려지면 종료되지 않아야 한다.
		switch(flag) {
		case JOptionPane.OK_OPTION:
			dispose();
			break;
		default : 
		}	// end switch~case
	}	// windowClosing

	@Override
	public void windowClosed(WindowEvent e) {
		// System.exit method는 windowClosed에서 사용해도 무관.
		System.exit(JFrame.ABORT);
	}	// windowClosed

	@Override
	public void windowIconified(WindowEvent e) {
		
	}	// windowIconified

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}	// windowDeiconified

	@Override
	public void windowActivated(WindowEvent e) {
		
	}	// windowActivated

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}	// windowDeactivated

	public static void main(String[] args) {
		new UseJOptionPane();
	}	// main

}	// class