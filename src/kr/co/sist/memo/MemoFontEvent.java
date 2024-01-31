package kr.co.sist.memo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MemoFontEvent extends WindowAdapter implements ActionListener, MouseListener {

	private MemoFontDesign mfd;
	private String font = "맑은 고딕";
	private int style = Font.PLAIN;
	private int size = 14;
	
	public MemoFontEvent(MemoFontDesign mfd) {
		this.mfd = mfd;
	}	// MemoFontEvent
	
	@Override
	public void mouseClicked(MouseEvent me) {
		switch(me.getButton()){
		case MouseEvent.BUTTON1 :
			if(me.getSource() == mfd.getJlFont()) {
				setFont();
			}	// end if
			
			if(me.getSource() == mfd.getJlStyle()) {
				setStyle();
			}	// end if
			
			if(me.getSource() == mfd.getJlSize()) {
				setSize();
			}	// end if
		}	// end switch~case
	}	// mouseClicked
	
	private void setFont() {
		int indFont = mfd.getJlFont().getSelectedIndex();
		if(indFont != -1) {
			String selectFont = mfd.getDlmFont().elementAt(indFont);
			mfd.getJtfFont().setText(selectFont);
			this.font = selectFont;
			mfd.getJlblEx().setFont(new Font(this.font, this.style, this.size));
		}	// end if
	}	// setFont
	
	private void setStyle() {
		int indStyle = mfd.getJlStyle().getSelectedIndex();
		if(indStyle != -1) {
			String selectStyle = mfd.getDlmStyle().elementAt(indStyle);
			mfd.getJtfStyle().setText(selectStyle);
			switch(selectStyle) {
			case "일반" :
				this.style = Font.PLAIN;
				break;
			case "굵게" :
				this.style = Font.BOLD;
				break;
			case "기울임꼴" :
				this.style = Font.ITALIC;
				break;
			case "굵은 기울임꼴" :
				this.style = Font.BOLD | Font.ITALIC;
			}	// switch~case
			mfd.getJlblEx().setFont(new Font(this.font, this.style, this.size));
		}	// end if
	}	// setStyle
	
	private void setSize() {
		int indSize = mfd.getJlSize().getSelectedIndex();
		if(indSize != -1) {
			String selectSize = mfd.getDlmSize().elementAt(indSize);
			mfd.getJtfSize().setText(selectSize);
			this.size = Integer.parseInt(selectSize);
			mfd.getJlblEx().setFont(new Font(this.font, this.style, this.size));
		}	// end if
	}	// setSize

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == mfd.getJbtnCheck()) {
			applyFont();
		}	// end if
		
		if(ae.getSource() == mfd.getJbtnCancel()) {
			closeFont();
		}	// end if
	}	// actionPerformed
	
	private void applyFont() {
		mfd.getJta().setFont(new Font(this.font, this.style, this.size));
		mfd.dispose();
	}	// applyFont
	
	private void closeFont() {
		mfd.dispose();
	}	// closeFont

	@Override
	public void windowClosing(WindowEvent e) {
		mfd.dispose();
	}	// windowClosing
	
	@Override
	public void mousePressed(MouseEvent me) {
		
	}
	
	@Override
	public void mouseReleased(MouseEvent me) {
		
	}
	
	@Override
	public void mouseEntered(MouseEvent me) {
		
	}
	
	@Override
	public void mouseExited(MouseEvent me) {
		
	}
	
}	// class