package kr.co.sist.memo;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MemoInfoDesign extends JDialog {
	
	private JButton jbtnCloseInfo;

	public MemoInfoDesign(JavaMemo jm) {
		
		super(jm, "메모장 정보", true);
		
		JTextArea jtaInfo = new JTextArea("Java 메모장 Version1.0\n\n"
				+ "이 메모장은 SHPL(SuHyunPublicLicense)로서 아무나 가져다 변환 및 배포 가능합니다.\n\n"
				+ "편하게 가져다 사용해주세요.");
		JScrollPane jsp = new JScrollPane(jtaInfo);
		jtaInfo.setLineWrap(true);
		jtaInfo.setEditable(false);
		
		jbtnCloseInfo = new JButton("닫기");
		JPanel jp = new JPanel();
		
		jp.add(jbtnCloseInfo);
		
		add("Center", jsp);
		add("South", jp);
		
		MemoInfoEvent mie = new MemoInfoEvent(this);
		addWindowListener(mie);
		jbtnCloseInfo.addActionListener(mie);
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

		setBounds(jm.getX()+150, jm.getY()+150, 200, 200);
		setVisible(true);
		
	}	// MemoHelpDesign

	public JButton getJbtnCloseInfo() {
		return jbtnCloseInfo;
	}	// getJbtnCloseInfo

}	// class