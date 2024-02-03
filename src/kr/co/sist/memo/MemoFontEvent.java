package kr.co.sist.memo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemoFontEvent extends WindowAdapter implements ActionListener, MouseListener {

	private MemoFontDesign mfd;
	private String name;
	private int style, size;
	private JTextField jtfFont, jtfStyle, jtfSize;
	private JTextArea jta;
	
	public MemoFontEvent(MemoFontDesign mfd) {
		this.mfd = mfd;
		
		jtfFont = mfd.getJtfFont();
		jtfStyle = mfd.getJtfStyle();
		jtfSize = mfd.getJtfSize();

		jta = mfd.getJta();
		
		name = jta.getFont().getName();
		style = jta.getFont().getStyle();
		size = jta.getFont().getSize();
		
		jtfFont.setText(name);
		
		switch(jta.getFont().getStyle()) {
		case Font.PLAIN :
			jtfStyle.setText("일반");
			break;
		case Font.BOLD :
			jtfStyle.setText("굵게");
			break;
		case Font.ITALIC :
			jtfStyle.setText("기울임꼴");
			break;
		case Font.BOLD | Font.ITALIC :
			jtfStyle.setText("굵은 기울임꼴");
		}	// end switch~case
		
		jtfSize.setText(String.valueOf(size));
	}	// MemoFontEvent
	
	@Override
	public void mouseReleased(MouseEvent me) {
		switch(me.getButton()){
		case MouseEvent.BUTTON1 :
			if(me.getSource() == mfd.getJlFont()) {
				setJtfFont();
			}	// end if
			
			if(me.getSource() == mfd.getJlStyle()) {
				setJtfStyle();
			}	// end if
			
			if(me.getSource() == mfd.getJlSize()) {
				setJtfSize();
			}	// end if
		}	// end switch~case
	}	// mouseClicked
	
	private void setJtfFont() {
		int indFont = mfd.getJlFont().getSelectedIndex();
		if(indFont != -1) {
			String selectName = mfd.getDlmFont().elementAt(indFont);
			mfd.getJtfFont().setText(selectName);
			this.name = selectName;
			mfd.getJlPreview().setFont(new Font(this.name, style, size));
		}	// end if
	}	// setFont
	
	private void setJtfStyle() {
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
			mfd.getJlPreview().setFont(new Font(name, this.style, size));
		}	// end if
	}	// setStyle
	
	private void setJtfSize() {
		int indSize = mfd.getJlSize().getSelectedIndex();
		if(indSize != -1) {
			String selectSize = mfd.getDlmSize().elementAt(indSize);
			mfd.getJtfSize().setText(selectSize);
			this.size = Integer.parseInt(selectSize);
			mfd.getJlPreview().setFont(new Font(name, style, this.size));
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
		mfd.getJta().setFont(new Font(this.name, this.style, this.size));
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
	public void mouseClicked(MouseEvent me) {
		
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		
	}
	
	@Override
	public void mouseEntered(MouseEvent me) {
		
	}
	
	@Override
	public void mouseExited(MouseEvent me) {
		
	}
	
}	// class