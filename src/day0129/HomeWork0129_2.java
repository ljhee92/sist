package day0129;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class HomeWork0129_2 extends JFrame implements ActionListener {
	
	private JTextField jtfId;
	private JPasswordField jpfPw;
	private JLabel jlResult;
	
	public HomeWork0129_2() {
		super("숙제 받아랏");
		
		addComponent();
		windowClose();
	}	// HomeWork0129_2
	
	public void addComponent() {
		jtfId = new JTextField();
		jpfPw = new JPasswordField();
		jlResult = new JLabel();
		
		JScrollPane jspId = new JScrollPane(jtfId);
		JScrollPane jspPw = new JScrollPane(jpfPw);
		JScrollPane jspResult = new JScrollPane(jlResult);
		
		jspId.setBorder(new TitledBorder("아이디"));
		jspPw.setBorder(new TitledBorder("비밀번호"));
		jspResult.setBorder(new TitledBorder("결과"));
		
		add(jspId);
		add(jspPw);
		add(jspResult);
		
		jtfId.addActionListener(this);
		jpfPw.addActionListener(this);
		jlResult.setText("아이디와 비밀번호를 입력하세요.");
		
		setLayout(new GridLayout(3, 1));
		setBounds(100, 100, 300, 200);
		setResizable(false);
		setVisible(true);
	}	// addComponent
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String id = jtfId.getText().trim();
		String pw = String.valueOf(jpfPw.getPassword()).trim();
		chkNull(id, pw);
	}	// actionPerformed
	
	private void chkNull(String id, String pw) {
		jlResult.setForeground(Color.red);
		
		if(id.isEmpty()) {
			jtfId.requestFocus();
			jlResult.setText("아이디를 입력하세요.");
			return;
		}	// end if
		if(pw.isEmpty()) {
			jpfPw.requestFocus();
			jlResult.setText("비밀번호를 입력하세요.");
			return;
		}	// end if
		
		login(id, pw);
	}	// chkNull
	
	private void login(String id, String pw) {
		Map<String, String> login = new HashMap<String, String>();
		login.put("root", "1234");
		login.put("admin", "password");
		login.put("temp", "q1w2e3r4");
		
		if(login.containsKey(id) && login.get(id).equals(pw)) {
			jlResult.setForeground(Color.blue);
			jlResult.setText(id + "님 로그인 성공!");
		} else {
			jlResult.setForeground(Color.red);
			jlResult.setText("로그인 실패");
		}	// end else
	}	// login
	
	public void windowClose() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}	// windowClosing
		});
	}	// windowClose

	public static void main(String[] args) {
		new HomeWork0129_2();
	}	// main

}	// class