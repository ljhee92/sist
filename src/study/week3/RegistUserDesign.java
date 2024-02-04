package study.week3;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class RegistUserDesign extends JFrame {
	
	private JLabel jlbRegist;
	private JTextField jtfID;
	private JPasswordField jpfPW;
	private JButton jbtnRegist, jbtnExit;
	
	public RegistUserDesign() {
		
		super("사용자 등록");
		
		jlbRegist = new JLabel("등록할 아이디와 비밀번호를 입력해주세요.");
		jtfID = new JTextField();
		jpfPW = new JPasswordField();
		jbtnRegist = new JButton("등록");
		jbtnExit = new JButton("취소");
		
		JPanel jpBtn = new JPanel();
		jpBtn.add(jbtnRegist);
		jpBtn.add(jbtnExit);
		
		setLayout(new GridLayout(4, 1));
		
		jlbRegist.setBorder(new LineBorder(Color.gray));
		jtfID.setBorder(new TitledBorder("아이디"));
		jpfPW.setBorder(new TitledBorder("비밀번호"));
		
		RegistUserEvent rue = new RegistUserEvent(this);
		jtfID.addActionListener(rue);
		jpfPW.addActionListener(rue);
		jtfID.addKeyListener(rue);
		jpfPW.addKeyListener(rue);
		jbtnRegist.addActionListener(rue);
		jbtnExit.addActionListener(rue);
		
		add(jlbRegist);
		add(jtfID);
		add(jpfPW);
		add(jpBtn);
		
		setBounds(100, 100, 300, 250);
		setVisible(true);
		
	}	// RegistUser


	public JLabel getJlbRegist() {
		return jlbRegist;
	}

	public JTextField getJtfID() {
		return jtfID;
	}

	public JPasswordField getJpfPW() {
		return jpfPW;
	}

	public JButton getJbtnRegist() {
		return jbtnRegist;
	}

	public JButton getJbtnExit() {
		return jbtnExit;
	}

}	// class