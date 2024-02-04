package study.week3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;

public class LoginEvent extends WindowAdapter implements ActionListener, KeyListener {
	
	private LoginDesign ld;
	private Map<String, String> data;
	
	public LoginEvent(LoginDesign ld, String id, String pw) {
		this.ld = ld;
		data = new HashMap<String, String>();
		data.put(id, pw);
	}	// RegistUserEvent
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String id = ld.getJtfLogID().getText().trim();
		String pw = String.valueOf(ld.getJpfLogPW().getPassword()).trim();
		
		if(ae.getSource() == ld.getJbtnLogin()) {
			chkNull(id, pw);
		}	// end if
		
		if(ae.getSource() == ld.getJbtnLogExit()) {
			ld.dispose();
		}	// end if
	}	// actionPerformed
	
	private void chkNull(String id, String pw) {
		ld.getJlbLogin().setForeground(Color.red);
		
		if(id.isEmpty()) {
			ld.getJtfLogID().requestFocus();
			ld.getJlbLogin().setText("등록할 아이디를 입력하세요");
			return;
		}	// end if
		if(pw.isEmpty()) {
			ld.getJpfLogPW().requestFocus();
			ld.getJlbLogin().setText("등록할 비밀번호를 입력하세요");
			return;
		} else {
			login(id, pw);
		}	// end else
	}	// chkNull
	
	private void login(String id, String pw) {
		if(data.containsKey(id) && data.get(id).equals(pw)) {
			ld.getJlbLogin().setForeground(Color.blue);
			ld.getJlbLogin().setText(id + "님 로그인 성공!");
			new BoardDesign(ld);
			ld.dispose();
		} else {
			ld.getJlbLogin().setForeground(Color.red);
			ld.getJlbLogin().setText("로그인 실패");
		}	// end else
	}	// login

	@Override
	public void windowClosing(WindowEvent we) {
		ld.dispose();
	}	// windowClosing
	
	@Override
	public void keyReleased(KeyEvent ke) {
		String id = ld.getJtfLogID().getText().trim();
		String pw = String.valueOf(ld.getJpfLogPW().getPassword()).trim();
		if(ke.getKeyCode() == KeyEvent.VK_ENTER) {
			chkNull(id, pw);
		}	// end if
	}	// keyReleased

	@Override
	public void keyTyped(KeyEvent ke) {
	}

	@Override
	public void keyPressed(KeyEvent ke) {
	}

}	// class