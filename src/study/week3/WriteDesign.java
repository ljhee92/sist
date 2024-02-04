package study.week3;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class WriteDesign extends JDialog {
	
	private JTextField jtfTitle;
	private JTextArea jtfContents;
	private JButton jbtnApply, jbtnWriteExit;
	
	public WriteDesign(BoardDesign bd, LoginDesign ld) {
		super(bd, "글쓰기", true);
		
		jtfTitle = new JTextField();
		jtfContents = new JTextArea();
		JScrollPane jsp = new JScrollPane(jtfContents);

		jbtnApply = new JButton("등록");
		jbtnWriteExit = new JButton("취소");
		
		jtfTitle.setBorder(new TitledBorder("제목"));
		jsp.setBorder(new TitledBorder("내용"));
		
		jtfTitle.setBounds(15, 10, 470, 40);
		jsp.setBounds(15, 50, 470, 280);
		jbtnApply.setBounds(190, 335, 60, 30);
		jbtnWriteExit.setBounds(260, 335, 60, 30);
		
		WriteEvent we = new WriteEvent(this, bd, ld);
		jbtnApply.addActionListener(we);
		jbtnWriteExit.addActionListener(we);
		
		add(jtfTitle);
		add(jsp);
		add(jbtnApply);
		add(jbtnWriteExit);
		
		setLayout(null);
		setBounds(bd.getX()+50, bd.getY()+50, 500, 400);
		setResizable(false);
		setVisible(true);
		
	}	// Write

	public JTextField getJtfTitle() {
		return jtfTitle;
	}

	public JTextArea getJtfContents() {
		return jtfContents;
	}

	public JButton getJbtnApply() {
		return jbtnApply;
	}

	public JButton getJbtnWriteExit() {
		return jbtnWriteExit;
	}

}	// class