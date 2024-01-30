package day0129;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class HomeWork0129 extends JFrame {
	
	private JTextField jtfId;
	private JPasswordField jpfPw;
	private JLabel jlResult;
	
	public HomeWork0129() {
		super("로그인");
		addComponent();
		addKeyListener();
		windowClose();
	}	// HomeWork0129
	
	private void addComponent() {
		jtfId = new JTextField();
		jtfId.setBorder(new TitledBorder("아이디"));
		add(jtfId);
		
		jpfPw = new JPasswordField();
		jpfPw.setBorder(new TitledBorder("비밀번호"));
		add(jpfPw);
		
		jlResult = new JLabel();
		jlResult.setBorder(new TitledBorder("결과"));
		add(jlResult);
		
		setLayout(new GridLayout(3, 1));
		setBounds(100, 100, 300, 200);
		setVisible(true);
	}	// addComponent
	
	private void addKeyListener() {
		jtfId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER && jtfId.getText().length() != 0) {
					jpfPw.requestFocus();
				}	// end if
				if(e.getKeyCode() == KeyEvent.VK_ENTER && jpfPw.getPassword().length != 0) {
					checkLogin();
				}	// end if
			}	// keyPressed
		});
		
		jpfPw.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER && jtfId.getText().length() != 0 && jpfPw.getPassword().length != 0) {
					checkLogin();
				}	// end if
			}	// keyPressed
		});
	}	// addKeyListener
	
	private void checkLogin() {
		String id = jtfId.getText();
		String pw = String.valueOf(jpfPw.getPassword());
		if(id.equals("root") && pw.equals("1234") || id.equals("admin") && pw.equals("password") || id.equals("temp") && pw.equals("q1w2e3r4")) {
			jlResult.setForeground(Color.blue);
			jlResult.setText(id + "님 로그인");
		} else {
			jlResult.setForeground(Color.red);
			jlResult.setText("로그인 실패");
		}	// end else
	}	// checkLogin
	
	public void windowClose() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}	// windowClosing
		});
	}	// windowClose

	public static void main(String[] args) {
		new HomeWork0129();
	}	// main

}	// class