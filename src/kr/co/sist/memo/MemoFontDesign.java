package kr.co.sist.memo;

import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class MemoFontDesign extends JDialog {
	
	private JTextField jtfFont, jtfStyle, jtfSize;
	private DefaultListModel<String> dlmFont, dlmStyle, dlmSize;
	private JList<String> jlFont, jlStyle, jlSize;
	private JLabel jlblEx;
	private JButton jbtnCheck, jbtnCancel;
	private JTextArea jta;
	
	public MemoFontDesign(JavaMemo jm) {
		
		super(jm, "글꼴", true);
		
		setLayout(null);
		
		JLabel jlblFont = new JLabel("글꼴(F):");
		JLabel jlblStyle = new JLabel("글꼴 스타일(Y):");
		JLabel jlblSize = new JLabel("크기(S):");
		
		jtfFont = new JTextField();
		jtfStyle = new JTextField();
		jtfSize = new JTextField();
		
		dlmFont = new DefaultListModel<String>();
		dlmStyle = new DefaultListModel<String>();
		dlmSize = new DefaultListModel<String>();
		
		jlFont = new JList<String>(dlmFont);
		jlStyle = new JList<String>(dlmStyle);
		jlSize = new JList<String>(dlmSize);
		
		JScrollPane jspFont = new JScrollPane(jlFont);
		JScrollPane jspStyle = new JScrollPane(jlStyle);
		JScrollPane jspSize = new JScrollPane(jlSize);
		
		jlblEx = new JLabel("AaBbYyZz");
		jlblEx.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		jlblEx.setBorder(new TitledBorder("보기"));
		
		jbtnCheck = new JButton("확인");
		jbtnCancel = new JButton("취소");
		
		jta = jm.getJta();
		
		dlmFont.addElement("고딕체");
		dlmFont.addElement("궁서체");
		dlmFont.addElement("Consolas");
		dlmFont.addElement("새굴림");
		dlmFont.addElement("맑은 고딕");
		
		dlmStyle.addElement("일반");
		dlmStyle.addElement("굵게");
		dlmStyle.addElement("기울임꼴");
		dlmStyle.addElement("굵은 기울임꼴");
		
		for(int i = 8; i < 81; i++) {
			if(i <= 10) {
				dlmSize.addElement(Integer.toString(i));
			} else {
				i++;
				dlmSize.addElement(Integer.toString(i));
			}	// end else
		}	// end if
		
		jlblFont.setBounds(15, 10, 140, 15);
		jlblStyle.setBounds(175, 10, 120, 15);
		jlblSize.setBounds(315, 10, 70, 15);
		
		jtfFont.setBounds(15, 30, 141, 25);
		jtfStyle.setBounds(175, 30, 121, 25);
		jtfSize.setBounds(315, 30, 71, 25);
		
		jspFont.setBounds(15, 55, 140, 150);
		jspStyle.setBounds(175, 55, 120, 150);
		jspSize.setBounds(315, 55, 70, 150);
		
		jlblEx.setBounds(173, 215, 215, 100);
		
		jbtnCheck.setBounds(180, 325, 90, 25);
		jbtnCancel.setBounds(290, 325, 90, 25);
		
		add(jlblFont);
		add(jlblStyle);
		add(jlblSize);
		
		add(jtfFont);
		add(jtfStyle);
		add(jtfSize);
		
		add(jspFont);
		add(jspStyle);
		add(jspSize);
		
		add(jlblEx);
		
		add(jbtnCheck);
		add(jbtnCancel);
		
		MemoFontEvent mfe = new MemoFontEvent(this);
		addWindowListener(mfe);
		
		jlFont.addMouseListener(mfe);
		jlStyle.addMouseListener(mfe);
		jlSize.addMouseListener(mfe);
		
		jbtnCheck.addActionListener(mfe);
		jbtnCancel.addActionListener(mfe);
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		setBounds(jm.getX()+20, jm.getY()+20, 420, 400);
		setVisible(true);
		
	}	// MemoFontDesign

	public JTextField getJtfFont() {
		return jtfFont;
	}

	public JTextField getJtfStyle() {
		return jtfStyle;
	}

	public JTextField getJtfSize() {
		return jtfSize;
	}

	public DefaultListModel<String> getDlmFont() {
		return dlmFont;
	}

	public DefaultListModel<String> getDlmStyle() {
		return dlmStyle;
	}

	public DefaultListModel<String> getDlmSize() {
		return dlmSize;
	}

	public JList<String> getJlFont() {
		return jlFont;
	}

	public JList<String> getJlStyle() {
		return jlStyle;
	}

	public JList<String> getJlSize() {
		return jlSize;
	}

	public JLabel getJlblEx() {
		return jlblEx;
	}

	public JButton getJbtnCheck() {
		return jbtnCheck;
	}

	public JButton getJbtnCancel() {
		return jbtnCancel;
	}
	
	public JTextArea getJta() {
		return jta;
	}

}	// class