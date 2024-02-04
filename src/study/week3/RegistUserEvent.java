package study.week3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RegistUserEvent extends WindowAdapter implements ActionListener, KeyListener {
	
	private RegistUserDesign rud;
	
	public RegistUserEvent(RegistUserDesign rud) {
		this.rud = rud;
	}	// RegistUserEvent

	@Override
	public void actionPerformed(ActionEvent ae) {
		String id = rud.getJtfID().getText().trim();
		String pw = String.valueOf(rud.getJpfPW().getPassword()).trim();
		
		if(ae.getSource() == rud.getJbtnRegist()) {
			chkNull(id, pw);
		}	// end if
		
		if(ae.getSource() == rud.getJbtnExit()) {
			rud.dispose();
		}	// end if
	}	// actionPerformed
	
	private void chkNull(String id, String pw) {
		rud.getJlbRegist().setForeground(Color.red);
		
		if(id.isEmpty()) {
			rud.getJtfID().requestFocus();
			rud.getJlbRegist().setText("등록할 아이디를 입력하세요");
			return;
		}	// end if
		if(pw.isEmpty()) {
			rud.getJpfPW().requestFocus();
			rud.getJlbRegist().setText("등록할 비밀번호를 입력하세요");
			return;
		} else {
			chkPW(id, pw);
		}	// end else
	}	// chkNull
	
	private void chkPW(String id, String pw) {
		boolean containsLowerCase = pw.matches(".*[a-z].*");
		boolean containsUpperCase = pw.matches(".*[A-Z].*");
		boolean contiansNum = pw.matches(".*[0-9].*");
		
		if(pw.length() < 8 && (!containsLowerCase || !containsUpperCase || !contiansNum)){
			rud.getJlbRegist().setText("비밀번호 기준이 " + StrengthOfPw.DANGER.getDegree() + "입니다. 다시 설정해주세요.");
		} else if(pw.length() >= 8 && containsLowerCase && containsUpperCase && contiansNum) {
			rud.getJlbRegist().setForeground(Color.blue);
			rud.getJlbRegist().setText("비밀번호 기준이 " + StrengthOfPw.STRONG.getDegree() + "입니다. 등록 성공!");
			// id와 pw loginEvent로 넘기기
			new LoginDesign(rud);
			rud.dispose();
		} else {
			rud.getJlbRegist().setText("비밀번호 기준이 " + StrengthOfPw.GENERAL.getDegree() + "입니다. 다시 설정해주세요.");
		}	// end else
	}	// chkPw

	@Override
	public void windowClosing(WindowEvent we) {
		rud.dispose();
	}	// windowClosing
	
	@Override
	public void keyReleased(KeyEvent ke) {
		String id = rud.getJtfID().getText().trim();
		String pw = String.valueOf(rud.getJpfPW().getPassword()).trim();
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