package kr.co.sist.memo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemoFontEvent extends WindowAdapter implements ActionListener, MouseListener, Serializable {

	/**
	 * 폰트 객체 저장
	 */
	private static final long serialVersionUID = -7178663319565989628L;
	private MemoFontDesign mfd;
	private String name;
	private int style, size;
	private JTextField jtfFont, jtfStyle, jtfSize;
	private JTextArea jta;
	private Font font;
	
	public MemoFontEvent() {
	}	// MemoFontEvent
	
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
			font = new Font(this.name, style, size);
			mfd.getJlPreview().setFont(font);
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
			font = new Font(name, this.style, size);
			mfd.getJlPreview().setFont(font);
		}	// end if
	}	// setStyle
	
	private void setJtfSize() {
		int indSize = mfd.getJlSize().getSelectedIndex();
		if(indSize != -1) {
			String selectSize = mfd.getDlmSize().elementAt(indSize);
			mfd.getJtfSize().setText(selectSize);
			this.size = Integer.parseInt(selectSize);
			font = new Font(name, style, this.size);
			mfd.getJlPreview().setFont(font);
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
		font = new Font(this.name, this.style, this.size);
		mfd.getJta().setFont(font);
		try {
			saveFont(font);
		} catch (NotSerializableException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	// end catch
		closeFont();
	}	// applyFont
	
	private void closeFont() {
		mfd.dispose();
	}	// closeFont
	
	public void saveFont(Font font) throws NotSerializableException, IOException {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("C:/dev/workspace/java_se/font.txt"));
			oos.writeObject(font);
			oos.flush();
		} finally {
			if(oos != null) {
				oos.close();
			}	// end if
		}	// end finally
//		File fontFile = new File("C:/dev/workspace/java_se/font.txt");
//		
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fontFile))){
//			String fontName = mfd.getJta().getFont().getName();
//			int fontStyle = mfd.getJta().getFont().getStyle();
//			int fontSize = mfd.getJta().getFont().getSize();
//			bw.write(fontName + "," + fontStyle + "," + fontSize);
//			bw.flush();
//		} catch(IOException ie) {
//			ie.printStackTrace();
//		}	// end catch
	}	// saveFont

	@Override
	public void windowClosing(WindowEvent e) {
		closeFont();
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

	public Font getFont() {
		return font;
	}

}	// class