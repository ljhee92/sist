package day0130;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UseActionCommand extends JFrame implements ActionListener {
	
	private JButton jbtn, jbtn2;
	private JTextField jtf;
	
	public UseActionCommand() {
		super("ActionCommand 사용");
		
		jbtn = new JButton("버튼");
		jbtn2 = new JButton("버튼2");
		jtf = new JTextField(10);
		
		// 컴포넌트를 이벤트에 등록
		jbtn.addActionListener(this);
		jbtn2.addActionListener(this);
		jtf.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(jbtn);
		add(jbtn2);
		add(jtf);
		
		setBounds(100, 100, 400, 300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}	// windowClosing
		});
		
	}	// UseActionCommand

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("이벤트를 발생시킨 컴포넌트(객체)의 값: " + e.getActionCommand());
		String cmd = e.getActionCommand();
		// command로 비교하여 이벤트 처리 가능 => 권장X
		if(cmd.equals("버튼")) {
			System.out.println("버튼이 눌렸을 때 사용자에게 제공할 코드");
		}	// end if
		if(cmd.equals("버튼2")) {
			System.out.println("버튼2가 눌렸을 때 사용자에게 제공할 코드");
		} 	// end if
		//JTextField에서 이벤트가 발생했을 때에는 사용자가 어느 값을 입력했는지 예상할 수 없으므로 비교할 수 없다.
	}	// actionPerformed

	public static void main(String[] args) {
		new UseActionCommand();
	}	// main

}	// class