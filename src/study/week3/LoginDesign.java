package study.week3;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class LoginDesign extends JDialog {
	
	private JLabel jlbLogin;
	private JTextField jtfLogID;
	private JPasswordField jpfLogPW;
	private JButton jbtnLogin, jbtnLogExit;
	
	public LoginDesign(RegistUserDesign rud) {
		
		super(rud, "로그인", true);
		
		jlbLogin = new JLabel("로그인할 아이디와 비밀번호를 입력해주세요.");
		jtfLogID = new JTextField();
		jpfLogPW = new JPasswordField();
		jbtnLogin = new JButton("로그인");
		jbtnLogExit = new JButton("취소");
		
		JPanel jpBtn = new JPanel();
		jpBtn.add(jbtnLogin);
		jpBtn.add(jbtnLogExit);
		
		setLayout(new GridLayout(4, 1));
		
		jlbLogin.setBorder(new LineBorder(Color.gray));
		jtfLogID.setBorder(new TitledBorder("아이디"));
		jpfLogPW.setBorder(new TitledBorder("비밀번호"));
		
		String id = rud.getJtfID().getText().trim();
		String pw = String.valueOf(rud.getJpfPW().getPassword()).trim();
		
		LoginEvent le = new LoginEvent(this, id, pw);
		jtfLogID.addActionListener(le);
		jpfLogPW.addActionListener(le);
		jtfLogID.addKeyListener(le);
		jpfLogPW.addKeyListener(le);
		jbtnLogin.addActionListener(le);
		jbtnLogExit.addActionListener(le);

		add(jlbLogin);
		add(jtfLogID);
		add(jpfLogPW);
		add(jpBtn);
		
		setBounds(100, 100, 300, 250);
		setVisible(true);
		
	}	// LoginDesign
	
	public JLabel getJlbLogin() {
		return jlbLogin;
	}

	public JTextField getJtfLogID() {
		return jtfLogID;
	}

	public JPasswordField getJpfLogPW() {
		return jpfLogPW;
	}

	public JButton getJbtnLogin() {
		return jbtnLogin;
	}

	public JButton getJbtnLogExit() {
		return jbtnLogExit;
	}

}	// class